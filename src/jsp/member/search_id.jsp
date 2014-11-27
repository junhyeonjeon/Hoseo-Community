<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<%@include file="../../include/head.jsp"%>
<link rel="stylesheet" href="<%=commonURL%>/src/css/login.css" type="text/css" />

</head>

<body>
	<div id="templatemo_wrapper">

		<!-- header -->
		<%@include file="../../include/header.jsp"%>

		<form name="search_form" method="post" action="id_ok.do" onkeydown="javascript:if(event.keyCode==13){submit();}">
			<div id="templatemo_main">
				<div class="clear h40"></div>

				<div align="center" class="login_form">
					<div class="login_here">
						<img src="<%=commonURL%>/src/images/add/intro_tex03.png" alt="호서대학교" /><br/>
						<label style="font-size: 15px;">아이디 찾기 - 가입 시 등록한 이메일을 입력해주세요.</label>
					</div>
					<div class="clear h40"></div>

					<div class="input_row">
						<span class="input_box">  
							<input type="text" name="email" id="email" tabindex="7" accesskey="L" placeholder="가입 시 등록한 이메일" class="int" value	autocomplete="off"/>
						</span>
					</div>
					<div class="clear h20"></div>

					<div align="center">
						<input type="button" class="thoughtbot" value="아이디 찾기" onclick="submit()"/>
					</div>
				</div>
			</div>
		</form>
		<!-- End main -->
	</div>
	<!-- END of templatemo_wrapper -->
	<!-- footer -->
	<%@include file="../../include/footer.jsp"%>
</body>
</html>