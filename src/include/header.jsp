<%@page import="com.hoseo.util.StringUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String userid = StringUtil.convNull(
			(String) session.getAttribute("userid"), "");
	String username = StringUtil.convNull(
			(String) session.getAttribute("username"), "");
	String layout = StringUtil.convNull(
			(String) request.getAttribute("layout"), "index");

	System.out.println("Session_userid : " + userid);
	System.out.println("Session_username : " + username);
	System.out.println(layout);
	
	
	
%>
<!-- Start_header -->
<div id="templatemo_header">
	<div id="site_title">
		<img src="<%=commonURL%>/src/images/add/intro_tex02.jpg"
			alt="Venture1st_호서대학교" />
	</div>
	<div align="right" style="color: orange;">
		이 웹페이지는 <a
			href="https://www.google.com/intl/ko/chrome/browser/features.html">Chrome</a>
		브라우저에 최적화 되어 있습니다
	</div>
	</a>
	<div id="templatemo_search">
		<form action="search.do" method="get">
			<input type="text" value="Search..." name="keyword" id="keyword"
				title="keyword" onfocus="clearText(this)" onblur="clearText(this)"
				class="txt_field" /> <input type="submit" name="Search" value=""
				alt="Search" id="searchbutton" title="Search" class="sub_btn" />
		</form>
	</div>
</div>
<!-- End_header -->

<%
	
%>

<!-- Start Menu -->
<div id="templatemo_menu" class="ddsmoothmenu">
	<ul>
		<li><a href="<%=commonURL%>/index.do"
			<%if (layout.equals("index")) {%> class="selected" <%}%>>Home</a></li>
		<li><a
			href="<%=commonURL%>/market/list.do?kind=trade&pg=1&block=1"
			<%if (layout.equals("market")) {%> class="selected" <%}%>>Market
				Place</a>
			<ul>
				<li><a rel="nofollow"
					href="<%=commonURL%>/market/list.do?kind=trade&pg=1&block=1">중고
						거래</a></li>
				<li><a rel="nofollow"
					href="<%=commonURL%>/market/list.do?kind=ad&pg=1&block=1">원룸 광고</a></li>
				<li><a rel="nofollow"
					href="<%=commonURL%>/market/list.do?kind=report&pg=1&block=1">사건/사고
						신고</a></li>
			</ul></li>
		<li><a href="<%=commonURL%>/board/list.do?kind=free&pg=1&block=1"
			<%if (layout.equals("board")) {%> class="selected" <%}%>>Board</a>
			<ul>
				<li><a rel="nofollow"
					href="<%=commonURL%>/board/list.do?kind=free&pg=1&block=1">자유게시판</a></li>
				<li><a rel="nofollow"
					href="<%=commonURL%>/board/list.do?kind=none&pg=1&block=1">익명게시판</a></li>
				<li><a rel="nofollow"
					href="<%=commonURL%>/board/list.do?kind=missing&pg=1&block=1">분실/습득물</a></li>
			</ul></li>
		<li><a href="<%=commonURL%>/gallery/list.do?pg=1&block=1"
			<%if (layout.equals("gallery")) {%> class="selected" <%}%>>Gallery</a></li>
		<!-- <li><a href="blog.jsp">Blog</a></li> -->
		<li><a href="<%=commonURL%>/contact.do"
			<%if (layout.equals("contact")) {%> class="selected" <%}%>>Contact</a></li>
	</ul>

	<%
		if (!userid.equals("")) {
	%>
	<div align="right">
		<div style="color: #fff">
			<%=username%>&nbsp;님&nbsp;
			<a href="<%=commonURL%>/message/message_receive.do">마이페이지</a>&nbsp;&nbsp;&nbsp; 
			<a href="<%=commonURL%>/member/logout.do" class="button button-blue"><span>로그아웃</span></a>
		</div>
	</div>
	<%
		} else {
	%>
	<div align="right">
		<a href="<%=commonURL%>/member/login.do" class="button button-blue"><span>로그인</span></a>
		<a href="<%=commonURL%>/member/register.do" class="button button-blue"><span>회원가입</span></a>
	</div>
	<%
		}
	%>



	<br style="clear: left" />
</div>
<!-- End Menu -->