
function cancellation() {
	
	var frm = document.join;
	
	frm.action = "/hoseo/member/cancellation.do";
	alert("탈퇴 안내로 이동합니다.");
	/* 체크 여부 확인 */
	frm.submit();
}