<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<form name="join" method="post"
	action="<%=commonURL%>/member/correction.do">
	<!-- 왼쪽메뉴 : 시작 -->
	<div id="leftview" align="center">

		<input type="hidden" name="userid" value="<%=userid%>" /> <br />
		
		<%=username%>(<%=userid%>)님<br/> 안녕하세요. </br> </br>

		<ul>
			<li><a href="<%=commonURL%>/message/message_receive.do"	class="button button-blue" style="width: 150px; height: 50px;"> <span style="padding-top: 17px;">받은쪽지함</span></a></li>
			<br />

			<li><a href="<%=commonURL%>/message/message_send.do" class="button button-blue" style="width: 150px; height: 50px"> <span style="padding-top: 17px;">보낸쪽지함</span></a></li>
			<br />

			<li><a href="<%=commonURL%>/message/message_form.do" class="button button-blue" style="width: 150px; height: 50px"> <span style="padding-top: 17px;">쪽	지 쓰 기</span></a></li>
			<br />

			<li><a href="javascript:document.join.submit()" class="button button-blue" style="width: 150px; height: 50px"> <span style="padding-top: 17px;">정보	수정</span></a></li>
			<br />

			<li><a href="javascript:cancellation() " class="button button-blue" style="width: 150px; height: 50px"> <span style="padding-top: 17px;">회원 탈퇴</span></a></li>
			<br />
	</div>
</form>
</body>
</html>