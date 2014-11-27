<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<%@include file="../../include/checkLogin.jsp"%>
	<%@include file="../../include/head.jsp"%>
	<link rel="stylesheet" href="<%=commonURL%>/src/css/login.css" type="text/css"/>
</head>
<%
	String seq = request.getParameter("seq");
	String category = request.getParameter("category");
%>
<body>
	<div id="templatemo_wrapper">
	
		<!-- header -->
		<%@include file="../../include/header.jsp" %>		

		<form name="delete_form" action="delete_check.do" method="post">
		<div id="templatemo_main">
				
			<div align="center" class="login_form">
			    <div class="login_here">
			    	<img src="<%=commonURL%>/src/images/add/intro_tex03.png" alt="호서대학교" />
			    	<label>Board Delete</label>
			    </div>
			    <div class="clear h40"></div>
			    
				<div class="clear h40"></div>
				<h5 style="color:red;"><small>해당 게시글을 정말 삭제하시겠습니까?</small></h5>
				<div class="clear h20"></div>
				
			    <div class="input_row">
					<span class="input_box"> 
						<input type="hidden" name="seq" id="seq" value="<%=seq%>" />
						<input type="hidden" name="userid" id="userid" value="<%=userid%>"/>
						<input type="hidden" name="category" id="category" value="<%=category%>"/>
						<input type="password" name="pw" id="pw" tabindex="7" accesskey="L"	placeholder="작성자 암호 입력" class="int" maxlength="40" value	autocomplete="off"/>
					</span>
				</div>
				<div class="clear h20"></div>
				
			    <div align="center">
			    		<button class="thoughtbot" onclick="submit()" ><span>삭제하기</span></button>
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

</body>
</html>