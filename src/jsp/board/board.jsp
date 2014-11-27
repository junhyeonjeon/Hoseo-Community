<%@page import="com.hoseo.board.*, java.util.*, com.hoseo.page.Pager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@include file="../../include/head.jsp" %>
<link rel="stylesheet" href="<%=commonURL%>/src/css/board_slider.css" type="text/css" media="screen" />
<link rel="stylesheet" href="<%=commonURL%>/src/css/board_write.css" type="text/css"/>
</head>

<%
	String kind = request.getParameter("kind"); //현재 카테고리
	String searchKey = StringUtil.convNull(request.getParameter("searchKey"),"all"); // 검색 종류
	String keyword = StringUtil.convNull(request.getParameter("keyword"),""); // 검색어
%>

<body>

	<div id="templatemo_wrapper">
		<!-- header -->
		<%@include file="../../include/header.jsp"%>
		<div id="templatemo_main">
			<div class="board_title">
				<h3 style="text-align: center;">
					<%if(kind.equals("trade")){ %>중고 거래 게시판<%} 
					else if(kind.equals("ad")){ %>원룸 광고 게시판<%}
					else if(kind.equals("report")){ %>사건/사고 신고 게시판<%} 
					else if(kind.equals("free")){ %>자유 게시판<%} 
					else if(kind.equals("none")){ %>익명 게시판<%} 
					else if(kind.equals("missing")){ %>분실 / 습득물 신고 게시판<%} %>
				</h3>
			</div>
			
			
			<!-- 프리미엄 게시글 영역 : 시작 -->
			<%if(kind.equals("report")) {%>
			<div align="left" class="report_img">
				<a href="http://thecheat.co.kr/rb/?m=bbs&bid=cheat&type=cheat&page_num=1" target="_block">
					<img src="<%=commonURL%>/src/images/add/joonggonara_main_banner.jpg" alt="더치트 사기꾼 목록 확인하기" /></a>				
			</div>
			<%} else { %>
			<div id="gallery" class="pl3">
				<div id="t"> 
					<ul>
					<% List premium = (List)request.getAttribute("premium");
					
						if(premium.size()>0){
					
						for(int i=0; i<premium.size(); i++){
							BoardDto dto = (BoardDto)premium.get(i);
						%>
						<li>
							<div class="col one_fourth gallery_box">
								<div class="img_frame img_frame_14 img_nom">
									<span></span> 	
									<a href="<%=commonURL%>/src/db/board/<%=dto.getFilename1()%>" rel="lightbox[new_gallery]"> 
										<img class="hot_label" src="<%=commonURL%>/src/images/add/icon_hot.png" />
										<img class="hot pro_ov" src="<%=commonURL%>/src/images/add/pro_ov.png" />
										<img class="hot" src="<%=commonURL%>/src/db/board/<%=dto.getFilename1()%>" alt="<%=dto.getFilename1()%>" />
									</a>
								</div>
								<span></span> 
								<a class="hot_a" href="view.do?category=<%=kind%>&seq=<%=dto.getSeq()%>">
									<h5><small><%=dto.getTitle()%>										
										<%if(dto.getReplecount() > 0){%>										
										<span style="color: orange;">&nbsp;&nbsp;[<%=dto.getReplecount()%>]</span>
										<%}%>
									</small></h5></a>
								<div style="float: left">
									<%if(kind.equals("none")){ %>
										익명
									<%} else {%>									
										<a href="#"><%=dto.getUsername()%></a>
									<%} %>
								</div>
								<div style="float: right">★추천 <%=dto.getLikecount()%>개&nbsp;&nbsp;</div>
							</div>
						</li>						
						<%	
						}} else {
						%>
						<div style="margin-bottom: 30px;"></div>
						<%} %>
					</ul>
				</div>
			</div>
			
			<%if(premium.size()>4){ %>
			<div align="center">
				<button type="button" class="skip">◀ PREV</button>&nbsp;&nbsp;
				<button type="button" class="skip">NEXT ▶</button>
			</div>			
			<!-- 프리미엄 게시글 영역 : 끝 -->
			
			<!-- 프리미엄 게시글 슬라이더 javascript -->
			<script type="text/javascript" src="<%=commonURL%>/src/js/slider.js"></script>
			<%}} %>
			
			<!-- 일반 게시글 영역 : 시작 -->
			<div>
				<table class="table_board" cellpadding="0" cellspacing="0" border="0">
					<colgroup>
						<col width="60" />
						<col width="*" />
						<col width="120" />
						<col width="100" />
						<col width="60" />
						<col width="60" />
					</colgroup>
					<thead>
						<tr class="tr_board">
							<td>번호</td>
							<td>제목</td>
							<td>작성자</td>
							<td>작성일</td>
							<td>조회</td>
							<td>추천</td>
						</tr>
					</thead>
					<tbody>
					<%
						int rowCount = (Integer)request.getAttribute("rowCount");
						int pg = Integer.parseInt(request.getParameter("pg"));
					
						List list = (List)request.getAttribute("list");
					
						for(int i=0; i<list.size(); i++){
							BoardDto dto = (BoardDto)list.get(i);
					%>
						<tr>
							<td align="center"><%=rowCount - (((pg-1)*10)+i)%></td>
							<td align="left">
								<a href="view.do?category=<%=kind%>&seq=<%=dto.getSeq()%>">
									<%=dto.getTitle()%>									
									<%
									if(dto.getPremium() > 0){
									%>
									<img src="<%=commonURL%>/src/images/add/icon_hot.gif" alt="[Hot]" />
									<%} %>
								</a>
								<%if(dto.getReplecount() > 0){%>
									<span style="color: orange;">&nbsp;&nbsp;[<%=dto.getReplecount()%>]</span>
								<%}%>
							</td>
							<td align="center">
									<%if(kind.equals("none")){ %>
										익명
									<%} else {%>									
										<a href="#"><%=dto.getUsername()%></a>
									<%} %>
							</td>
							<td align="center"><%=dto.getWdate()%></td>
							<td align="center"><%=dto.getHit()%></td>
							<td align="center"><%=dto.getLikecount() %></td>
						</tr>
						
					<%} %>

					</tbody>
				</table>
			</div>
			
			<%
			if(list.size() == 0){%>
				<div style="text-align: center; margin: 50px;">
				등록된 게시글이 없습니다.
				</div>
			<%} %>
			<!-- 일반 게시글 영역 : 끝 -->

			<div class="clear"></div>
			
			<!-- 페이징 영역  : 시작 -->
			<div class="pagging">
				<%=Pager.makeTag(commonURL + "/" + layout + "/list.do?kind=" + kind + "&", 10, searchKey, keyword)%>

			<form method="get" action="list.do?">
				<input type="hidden" name="kind" value="<%=kind%>"/>
				<input type="hidden" name="pg" value="1"/>
				<input type="hidden" name="block" value="1"/>
				
				<div align="right" class="search_select">
					<select name="searchKey" id="searchKey">
						<option value="all" <%if(searchKey.equals("all")){ %>selected<%} %>>전체</option>
						<option value="title" <%if(searchKey.equals("title")){ %>selected<%} %>>제목</option>
						<option value="contents" <%if(searchKey.equals("contents")){ %>selected<%} %>>내용</option>
						<option value="writer" <%if(searchKey.equals("writer")){ %>selected<%} %>>작성자</option>
					</select> 
					<input type="text" name="keyword" id="keyword" value="<%=keyword%>"/>
					<button class="kboard-default-button-small">검색</button>&nbsp;
					<a href="<%=commonURL%>/board/write.do?layout=<%=layout%>&category=<%=kind%>" class="kboard-default-button-small">글쓰기</a>
				</div>
			</form>
			</div>
			<!-- 페이징 영역 : 끝 -->
			
			<div class="clear h40"></div>
			<div class="clear h40"></div>
			
		</div>
		<!-- END of templatemo_main -->
	</div>
	<!-- END of templatemo_wrapper -->

	<!-- footer -->
	<%@include file="../../include/footer.jsp" %>
</body>
</html>
