// 쪽지보내기완료
function message_ok(){

	alert("성공적으로 쪽지를 보냈습니다. 보낸쪽지함으로 이동합니다.");
	
	var frm = document.msg;
	frm.action = "./message_ok.do";
	frm.submit();
}


