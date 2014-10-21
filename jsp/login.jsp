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
		
		<form name="login_form" method="post">
		<div id="templatemo_main">
			<div class="clear h40"></div>
			<div class="clear h40"></div>
				
			<div align="center" class="login_form">
			    <div class="login_here">
			    	<label>LOGIN HERE</label>
			    </div>
			    <div align="center" class="login_input">
			    	<div align="right">
			    		User ID : <input type="text" name="userid" id="userid"/>
			    	</div>
			    	<div class="clear h20"></div>
			    	<div align="right">
			    		Password : <input type="password" name="pw1" id="pw1"/>
			    	</div>
			    	<div class="clear h20"></div>
			    </div>
			    <div align="center">
			    		<a href="<%=commonURL%>/register.do" class="button button-blue"><span>회원가입</span></a>
			    		<!-- <a href="#" class="button button-blue" style="width: 100px; padding: 0px;"><span>회원정보 찾기</span></a> -->
			    		<a href="javascript:login()" class="button button-blue"><span>로그인</span></a>
			    </div>
			</div>
		
			<div class="clear h40"></div>
			<div class="clear h40"></div>
		</div>
		</form>
		<!-- End main -->		
	</div>
	<!-- END of templatemo_wrapper -->
	
	<!-- footer -->
	<%@include file="./include/footer.jsp" %>
</body>
</html>