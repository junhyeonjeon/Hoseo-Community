<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String result = (String) request.getAttribute("result");
	String kind = (String) request.getAttribute("kind");

	if (result.equals("Y")) {
%>
<script>
	var kind = "<%=kind%>";
	alert("게시물을 삭제했습니다.");
	location.href = 'list.do?kind=' + kind + '&pg=1&block=1';
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