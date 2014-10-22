<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

	<%@include file="./include/head.jsp" %>
	<link rel="stylesheet" href="<%=commonURL%>/jsp/css/login.css" type="text/css"/>
	<script src=""></script>
	
</head>

<body>
	<div id="templatemo_wrapper">
	
		<!-- header -->
		<%@include file="./include/header.jsp" %>
		
		<form name="gallery_upload_form" method="post" enctype="multipart/form-data">
		<div id="templatemo_main">
			<div class="clear h40"></div>
				
			<div align="center" class="login_form">
			    <div class="login_here">
			    	<label>Gallery Upload</label>
			    </div>
			    <div align="center" class="login_input">
			    	<div align="right">
			    		<input type="text" name="title" id="title" maxlength="40" placeholder="제목" style="width: 238px;"/>
			    	</div>
			    	<div class="clear h20"></div>
			    	<div align="right">
			    		<textarea name="contents" id="contents" maxlength="100" placeholder="내용" style="width: 235px; height: 100px;"></textarea>
			    	</div>
			    	<div class="clear h20"></div>
			    	<div align="right">
			    		<input type="file" name="files[0]" id="files[0]"/>
			    	</div>
			    	<div class="clear h20"></div>
			    </div>
			    <div align="center">
			    		<a href="javascript:history.go(-1);" class="button button-blue"><span>돌아가기</span></a>
			    		<a href="javascript:upload()" class="button button-blue"><span>업로드</span></a>
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
	<%@include file="./include/footer.jsp" %>
	
	<!-- script -->
	<script type="text/JavaScript" src="<%=commonURL%>/jsp/js/gallery.js"></script>
</body>
</html>