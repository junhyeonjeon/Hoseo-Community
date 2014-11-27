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
	List search_id = (List)request.getAttribute("search_id");
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
						
							if(search_id.size() == 0){
								%>
								입력한 정보가 잘못되었거나, 탈퇴한 회원입니다.	
								<%
							}else{
								%>
								고객님의 정보와 일치하는 아이디 목록입니다.<br/>
								비밀번호 찾기를 원하시면 아이디를 클릭해주세요.
								<%
							}
						%>						
						</label>
					</div>
					<div class="clear h20"></div>
					<div style="font-size: 15px; font-weight: bold;">
					<%
					for(int i=0; i<search_id.size(); i++){
						MemberDto dto = (MemberDto)search_id.get(i);
						%>
						<a href="pw.do?userid=<%=dto.getUserid()%>"><%=dto.getUserid()%></a><br/>
						<%
					}
					%>
					</div>
					<div class="clear h20"></div>
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