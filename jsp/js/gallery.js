function upload(){
	var frm = document.gallery_upload_form;
	frm.action = "./gallery_upload_ok.do";
	
	var title = document.getElementById("title").value;
	var file = document.getElementById("files[0]").value;
	
	if(title==""){
		alert("제목은 필수항목입니다.");
		frm.title.focus();
		return;
	}else if(file==""){
		alert("파일은 필수항목입니다.");
		frm.file.focus();
		return;
	}
	
	frm.submit();
}