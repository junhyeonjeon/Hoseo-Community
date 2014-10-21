<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="./include/common.jsp" %>
<script language="javascript" type="text/javascript">
<%
	String ok = (String)request.getAttribute("login_ok");
	
	if(ok.equals("N")){
		%>
				alert("로그인 실패 : 회원정보를 다시 확인해주세요.");
		<%
	}else{
		String userid = (String)request.getAttribute("userid");
		session.setAttribute("userid", userid);
		%>
				location.href = 'index.do';
		<%
	}
%>
</script>