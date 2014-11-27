<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<%@include file="../../include/checkLogin.jsp" %>
	<%@include file="../../include/head.jsp" %>
	<link rel="stylesheet" href="<%=commonURL%>/src/css/login.css" type="text/css"/>
</head>

<body>
	<div id="templatemo_wrapper">
	
		<!-- header -->
		<%@include file="../../include/header.jsp" %>
		
		<form name="gallery_upload_form" method="post" enctype="multipart/form-data">
		<div id="templatemo_main">
		
			<input type="hidden" name="writer" id="writer" value="<%=userid%>"/>
		
			<div class="clear h40"></div>				
			<div align="center" class="login_form">
			    <div class="login_here">
			 		<img src="<%=commonURL%>/src/images/add/intro_tex03.png" alt="호서대학교" />
			 	   	<div class="clear h20"></div>
			    	<label>Gallery Upload</label>
			    </div>
			    
			    <div class="clear h40"></div>
			    <div class="input_row">
					<span class="input_box"> 
						<input type="text" name="title" id="title" tabindex="7" accesskey="L"	placeholder="제목" class="int" maxlength="25" value	autocomplete="off"/>
					</span>
				</div>
				<div class="clear h20"></div>
				<input type="file" name="files[0]" id="galleryFile" onchange="uploadImg(this);"/>
				<div style="color: red; font-size: 12px;">
					※ 10MB 이하의 jpg, gif, png 파일만 업로드 가능합니다.
				</div>
			    <div class="clear h40"></div>
			    <div align="center">
			    		<a href="javascript:upload()"><input type="button" class="thoughtbot" value="이미지 업로드"/></a>
			    </div>
			    
			    
			    <div class="clear h40"></div>
			</div>
		
			<div class="clear h40"></div>
		</div>
		</form>
		<!-- End main -->		
	</div>
	<!-- END of templatemo_wrapper -->
	
	<!-- footer -->
	<%@include file="../../include/footer.jsp" %>
	
	<!-- script -->
	<script>
		// 파일 업로드 체크
		function upload() {

			var frm = document.gallery_upload_form;
			frm.action = "./upload_ok.do";

			var title = document.getElementById("title").value;
			var file = document.getElementById("galleryFile").value;

			if (title == "") {
				alert("제목은 필수항목입니다.");
				frm.title.focus();
				return;
			} else if (file == "") {
				alert("파일은 필수항목입니다.");
				frm.file.focus();
				return;
			}

			frm.submit();
		}

		//파일 업로드 이미지만 걸러내기
		function uploadImg(fileObj) {
			var filePath = fileObj.value;
			var filesid = fileObj.id;
			var fileName = filePath.substring(filePath.lastIndexOf("\\") + 1);
			var fileKind = fileName.split(".")[1];
			if (fileKind != "jpg" && fileKind != "gif" && fileKind != "png") {
				alert("jpg, gif, png 확장자를 가진 이미지 파일만 올려주세요.");
				document.getElementById(filesid).value = "";
				document.getElementById(filesid).select();
				document.selection.clear();
			}
		}
	</script>
</body>
</html>