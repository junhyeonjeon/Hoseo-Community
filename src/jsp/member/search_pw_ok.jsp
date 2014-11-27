<%@page import="com.hoseo.member.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<%@include file="../../include/head.jsp"%>
<link rel="stylesheet" href="<%=commonURL%>/src/css/login.css" type="text/css" />

</head>

<body>
<%
	int result = (Integer)request.getAttribute("result");
%>

	<div id="templatemo_wrapper">
		<!-- header -->
		<%@include file="../../include/header.jsp"%>

			<div id="templatemo_main">
				<div class="clear h40"></div>

				<div align="center" class="login_form">
					<div class="login_here">
						<img src="<%=commonURL%>/src/images/add/intro_tex03.png" alt="호서대학교" /><br/>
						<div class="clear h40"></div>
						<label style="font-size: 15px;">
						<%
						
							if(result == 1){
								%>
								입력하신 이메일로 임시 비밀번호를 전송하였습니다.<br/><br/>
								로그인 후 비밀번호를 변경해주세요.	
								<%
							}else{
								%>
								일치하는 정보가 없습니다.
								<%
							}
						%>						
						</label>
					</div>
					<div class="clear h40"></div>
					<div align="center">
						<input type="button" class="thoughtbot" value="로그인 화면으로 돌아가기" onclick="location.href='<%=commonURL%>/member/login.do'"/>
					</div>
				</div>
			</div>
		<!-- End main -->
	</div>	
	<!-- END of templatemo_wrapper -->
	<!-- footer -->
	<%@include file="../../include/footer.jsp"%>
</body>
</html>