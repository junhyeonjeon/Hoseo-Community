<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<%
	String result = (String) request.getAttribute("result");

	if (result.equals("Y")) {
		%>
			<script>
				alert("게시물을 삭제했습니다.");
				location.href = 'list.do?pg=1&block=1';
			</script>
		<%
	} else {
		%>
			<script>
				alert("작성자 본인이 아니거나, 암호가 다릅니다.");
				history.back(-2);
			</script>
		<%
	}
%>