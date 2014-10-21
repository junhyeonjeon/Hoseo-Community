<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String userid = (String) session.getAttribute("userid");
	System.out.println("세션 : " + userid);
%>
<!-- Start_header -->
		<div id="templatemo_header">
			<a href="<%=commonURL%>/index.do">
			<div id="site_title">
				<img src="<%=commonURL%>/jsp/images/add/intro_tex02.jpg" alt="Venture1st_호서대학교" />
			</div>
			</a>
			<div id="templatemo_search">
				<form action="#" method="get">
					<input type="text" value="Search..." name="keyword" id="keyword" title="keyword" onfocus="clearText(this)" onblur="clearText(this)"	class="txt_field" /> 
					<input type="submit" name="Search" value=""	alt="Search" id="searchbutton" title="Search" class="sub_btn" />
				</form>
			</div>
		</div>
		<!-- End_header -->
		
		<%
			String layout = (String)request.getAttribute("layout");
			System.out.println(layout);
		%>
		
		<!-- Start Menu -->
		<div id="templatemo_menu" class="ddsmoothmenu">
			<ul>
				<li><a href="<%=commonURL%>/index.do" <%if(layout.equals("index")){ %>class="selected"<%} %>>Home</a></li>
				<li><a href="<%=commonURL%>/board.do?kind=trade" <%if(layout.equals("market")){ %>class="selected"<%} %>>Market Place</a>
					<ul>
						<li><a rel="nofollow" href="<%=commonURL%>/board.do?kind=trade">중고 거래</a></li>
						<li><a rel="nofollow" href="<%=commonURL%>/board.do?kind=ad">원룸 광고</a></li>
						<li><a rel="nofollow" href="<%=commonURL%>/board.do?kind=nanum">무료 나눔</a></li>
						<li><a rel="nofollow" href="<%=commonURL%>/board.do?kind=report">사건/사고 신고</a></li>
					</ul>
				</li>
				<li><a href="<%=commonURL%>/board.do" <%if(layout.equals("board")){ %>class="selected"<%} %>>Board</a>
					<ul>
						<li><a rel="nofollow" href="<%=commonURL%>/board.do?kind=free">자유게시판</a></li>
						<li><a rel="nofollow" href="<%=commonURL%>/board.do?kind=none">익명게시판</a></li>
						<li><a rel="nofollow" href="<%=commonURL%>/board.do?kind=major">학과별 게시판</a></li>
					</ul>
				</li>
				<li><a href="<%=commonURL%>/gallery.do" <%if(layout.equals("gallery")){ %>class="selected"<%} %>>Gallery</a></li>
				<!-- <li><a href="blog.jsp">Blog</a></li> -->
				<li><a href="<%=commonURL%>/contact.do" <%if(layout.equals("contact")){ %>class="selected"<%} %>>Contact</a></li>
			</ul>
			
			<script type="text/javascript" src="<%=commonURL%>/jsp/js/jquery-1.11.0.js"></script>
			<script src="<%=commonURL%>/jsp/js/bootstrap.min.js"></script>

			<% if(userid!=null && !userid.equals("")){ %>
			<div align="right">
				<div>
					<a href="#"><%=userid%>&nbsp;님</a>&nbsp;&nbsp;&nbsp; 
					<a href="#">새쪽지 0</a>&nbsp;&nbsp;&nbsp;
					<a href="<%=commonURL%>/logout.do" class="button button-blue"><span>로그아웃</span></a>
				</div>
			</div>
			<% } else { %>						
			<div align="right">
				<a href="<%=commonURL%>/login.do" class="button button-blue"><span>로그인</span></a>
				<a href="<%=commonURL%>/register.do" class="button button-blue"><span>회원가입</span></a>
			</div>
			<%} %>
			
			
			<br style="clear: left" />
		</div>
		<!-- End Menu -->