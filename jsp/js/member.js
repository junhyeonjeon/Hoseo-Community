//로그인
function login(){
	var frm = document.login_form;
	frm.action = "./login_ok.do";
	
	var id = document.getElementById("userid").value;
	var pw = document.getElementById("pw1").value;
	
	if(id=="" || id==null){
		alert("아이디를 입력해주세요.");
		frm.userid.focus();
		return;
	}else if(pw=="" || pw==null){
		alert("패스워드를 입력해주세요.");
		frm.password.focus();
		return;
	}
	
	frm.submit();	
}

//약관 동의 체크
function agree() {
	var frm = document.agree;
	frm.action = "./register_form.do";

	/* 체크 여부 확인 */
	if (!frm.chk1.checked || !frm.chk2.checked) {
		alert("약관동의 후 가입 가능합니다.");
		return;
	}

	frm.submit();
}

/* 필수정보 체크 */
// 전역 변수 설정
var id, value, rootTag;
function check(id) {

	// 입력 값 받아오기
	var id = document.getElementById(id).id;
	var value = document.getElementById(id).value;

	// 출력 input 설정
	var rootTag = document.getElementById(id + "_result");
	
	// 입력 값이 없을 때
	if (value == ""){
		rootTag.innerHTML = "필수 정보입니다.";
		rootTag.value= id;
	}
	
	// 입력 값이 있을 때
	else {
		rootTag.innerHTML = "";
		rootTag.value="Y";
		// input 태그 종류 별 옵션 함수 실행
		if (id == 'userid')
			checkid(id, value, rootTag);
		else if (id == 'pw2')
			checkpwd(value, rootTag);
	}
}

// 아이디 체크
function checkid(id, value, rootTag) {

	var msg = "5~12자의 영문 소문자, 숫자만 사용 가능합니다.";

	// 적절한 길이가 아닌 경우
	if (value.length < 5 || value.length > 12) {
		rootTag.innerHTML = msg;
		rootTag.value="userid";
		return;
	}
	
	// 영문 소문자 혹은 숫자가 아닌 경우
	for (var i = 0; i < value.length; i++) {
		
		if (!(value.charAt(i) >= 0 && value.charAt(i) <= 9) && 
				!(value.charAt(i) >= "a" && value.charAt(i) <= "z")) {
			rootTag.innerHTML = msg;
			rootTag.value="userid";
			return;
		}
	}

	// 아이디 중복 체크 ajax
	ajaxSend('id', this, id, value, rootTag);
}

/* 중복 체크 Ajax */
var xmlReq; // 전역변수로 지정.
// Ajax 객체 생성 과정
function createAjax() {
	xmlReq = new XMLHttpRequest();
}

// Ajax 객체를 이용한 데이터 전송 과정
function ajaxSend(type, obj, id, value, rootTag) {

	createAjax();

	if (type == "id") 
		xmlReq.onreadystatechange = callBack_id;
		
	xmlReq.open("get", "/hoseo/jsp/ajax_receive.jsp?type=" + id + "&value="	+ value, true);
	

	xmlReq.send(null);
	// send가 끝나고나면 비동기식이기 때문에 프로그램이 계속 진행된다.
}

// 아이디 콜백 함수 과정
function callBack_id() {
	if (xmlReq.readyState == 4) {
		if (xmlReq.status == 200) {
			printData('id');
		}
	}
}

// 결과 출력 과정
function printData(type) {
	
	var result = xmlReq.responseXML;
	var rootNode = result.documentElement;
	var rootValue = rootNode.firstChild.nodeValue;
	var rootTag = document.getElementById("userid_result");
	var idNode = rootNode.getElementsByTagName("id");
	var idValue = idNode.item(0).firstChild.nodeValue;
	var idTag = document.getElementById("idTxt");

	if (rootValue == "true") {
		rootTag.innerHTML = "";
		rootTag.value="Y";
	} else {
		rootTag.innerHTML = "이미 사용중인 아이디 입니다.";
		rootTag.value="userid";
	}
}

// 비밀번호 일치 체크
function checkpwd(pw2, rootTag) {
	var pw1 = document.getElementById('pw1').value;
	var msg = "";
	
	if (pw1 != pw2){
		msg = "비밀번호 불일치";
		rootTag.value="pw2";
		rootTag.innerHTML = msg;
		return;
	}
	
	rootTag.innerHTML = msg;
	rootTag.value="Y";
}

// 생년월일 체크
function checkBirth(){
	
	var d = new Date();
	
	var year = document.getElementById("year").value;
	var month = document.getElementById("month").value;
	var day = document.getElementById("day").value;
	var rootTag = document.getElementById("birth_result");
		
	
	
	if(year=="" || month=="" || day=="" || day>31){
		rootTag.innerHTML = "생년월일을 정확히 입력해주세요.";
		rootTag.value="birth";
	}else{
		if(year >= d.getFullYear())
			rootTag.innerHTML = "미래에서 오셨군요. ^^";
		else if((d.getFullYear() - year) >= 100)
			rootTag.innerHTML = "정말이세요?";
		else
			rootTag.innerHTML = "";
		
		rootTag.value="Y";
	}
}

// 핸드폰 인증번호 생성
function checkPhone(){
	var phone = document.getElementById("phone").value;	
	var rootTag = document.getElementById("phone_result");
	var msg;
	
	if(phone.length < 10)
		msg = "전화번호를 다시 확인해주세요.";
	else
		msg = Math.floor((Math.random()*(999999 - 100000 + 1)) + 100000);
	
	rootTag.innerHTML = msg;
	rootTag.value = msg;
}

// 인증번호 일치 확인
function checkKey(){
	var phone_result = document.getElementById("phone_result").value;
	var key = document.getElementById("key").value;
	var key_result = document.getElementById("key_result");
	
	var msg = "인증번호가 틀렸습니다.";
		
	if(phone_result == key){
		msg = "인증 성공!";
		key_result.value="Y";
	}
	
	key_result.innerHTML = msg;	
}

// 가입완료
function register_ok(){
	var userid = document.getElementById("userid_result").value;
	var pw1 = document.getElementById("pw1_result").value;
	var pw2 = document.getElementById("pw2_result").value;
	var username = document.getElementById("username_result").value;
	var birth = document.getElementById("birth_result").value;
	var email = document.getElementById("email_result").value;
	var key = document.getElementById("key_result").value;

	var arr = new Array(userid, pw1, pw2, username, birth, email, key);
	
	
	for(var i=0; i<arr.length; i++){
		if(arr[i] != "Y"){
			alert("입력하신 정보를 다시 확인해주세요");
			return;
		}
	}
	
	alert("가입을 축하드립니다. 메인화면으로 이동합니다.");
	
	var frm = document.join;
	frm.action = "./register_ok.do";
	frm.submit();
}

