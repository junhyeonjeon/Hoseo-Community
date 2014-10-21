<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	//모든 세션을 초기화한다.
	session.invalidate();
%>
<script type="text/javascript">
	location.href = 'index.do';
</script>