<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<%@include file="login_ok.jsp" %>
<%@include file="../../include/head.jsp"%>
<link rel="stylesheet" href="<%=commonURL%>/src/css/login.css" type="text/css" />

</head>

<body>
	<div id="templatemo_wrapper">

		<!-- header -->
		<%@include file="../../include/header.jsp"%>

		<form name="login_form" method="post" onkeydown="javascript:if(event.keyCode==13){login();}">
			<div id="templatemo_main">

				<input type="hidden" name="referer" id="referer" value="<%=referer%>" />

				<div align="center" class="login_form">
					<div class="login_here">
						<img src="<%=commonURL%>/src/images/add/intro_tex03.png" alt="호서대학교" />
					</div>
					<div class="clear h40"></div>

					<div class="input_row">
						<span class="input_box"> 
							<label for="id" id="label_id_area" class="lbl" style="display: block;">아이디</label> 
							<input type="text" name="userid" id="userid" tabindex="7" accesskey="L"	placeholder="아이디" class="int" maxlength="20" value	autocomplete="off"/>
						</span>
					</div>
					<div class="input_row">
						<span class="input_box"> 
							<label for="id" id="label_id_area" class="lbl" style="display: block;">비밀번호</label> 
							<input type="password" name="pw1" id="pw1" tabindex="7" accesskey="L"	placeholder="비밀번호" class="int" maxlength="20" value	autocomplete="off"/>
						</span>
					</div>
					<div class="clear h20"></div>

					<div align="center">
						<input type="button" class="thoughtbot" value="로그인" onclick="login()"/>
					</div>
					<div class="clear h40"></div>
				</div>
				<div align="center" class="info_form">
					<a href="search/id.do">아이디 찾기</a> | <a href="search/pw.do">비밀번호 찾기</a> | <a href="<%=commonURL%>/member/register.do">회원가입</a>
				</div>

				<div class="clear h40"></div>
				<div class="clear h40"></div>
			</div>
		</form>
		
		<!-- End main -->
	</div>
	<!-- END of templatemo_wrapper -->

	<!-- footer -->
	<%@include file="../../include/footer.jsp"%>
	<script>
		//로그인
		function login() {
			var frm = document.login_form;
			frm.action = "./login_ok.do";

			var id = document.getElementById("userid").value;
			var pw = document.getElementById("pw1").value;

			if (id == "" || id == null) {
				alert("아이디를 입력해주세요.");
				frm.userid.focus();
				return;
			} else if (pw == "" || pw == null) {
				alert("패스워드를 입력해주세요.");
				frm.password.focus();
				return;
			}

			frm.submit();
		}
	</script>


</body>
</html>