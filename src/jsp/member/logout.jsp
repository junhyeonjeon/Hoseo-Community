<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	//리퍼러 가져오기
	String referer = request.getHeader("referer");
	//모든 세션을 초기화한다.
	session.invalidate();
%>
<script type="text/javascript">
	alert("로그아웃 하였습니다.");
	location.href = '<%=referer%>';
</script>