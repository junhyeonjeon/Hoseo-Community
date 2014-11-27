<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String referer = (String) request.getAttribute("referer"); // 리퍼러를 가져온다.
	String login_ok = (String) request.getAttribute("login_ok"); // 로그인 여부를 가져온다
	
	// 위에서 받은 리퍼러 애트리뷰트의 값이 null 일때, 실제 리퍼러 값을 가져온다.
	// 로그인 실패시 리퍼러 값이 변경되는 것을 방지하고자 만든 구조이다.
	if (referer == null || referer.equals("/member/login.do"))
		referer = request.getHeader("referer");
	
	if (referer.matches(".*id_ok.*") || referer.matches(".*pw_ok.*"))
		referer = "/hoseo/index.do";

	System.out.println(referer);
		
	// 로그인이 성공적으로 이루어졌을 시에는 아이디와 이름을 갖고 리퍼러에 해당되는 페이지로 돌아간다.
	if (login_ok.equals("Y")) {
		String userid = (String) request.getAttribute("userid");
		String username = (String) request.getAttribute("username");
		session.setAttribute("userid", userid);
		session.setAttribute("username", username);
%>
<script>
			alert("<%=username%>님 로그인하셨습니다.");
			location.href = '<%=referer%>';
</script>
<%
	return;
	}
	// 로그인이 실패했을 때는 실패메시지를 띄우고, 로그인 성공 여부 변수를 초기화한다.
	else if (login_ok.equals("N")) {
%>
<script>
			alert("로그인 실패! 회원정보를 다시 확인해주세요");
</script>
<%
	login_ok = "";
	}
%>