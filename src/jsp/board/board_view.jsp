<%@page import="java.util.List, com.hoseo.board.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@include file="../../include/head.jsp"%>
<link rel="stylesheet" href="<%=commonURL%>/src/css/board_write.css" type="text/css"/>
<link rel="stylesheet" href="<%=commonURL%>/src/css/board_view.css" type="text/css"/>
</head>

<%
		BoardDto dto = (BoardDto)request.getAttribute("contents");
		String category = request.getParameter("category");
		String seq = request.getParameter("seq");
		int repleCount = (Integer)request.getAttribute("repleCount");		
%>

<body>
	<div id="templatemo_wrapper">

		<!-- header -->
		<%@include file="../../include/header.jsp"%>
		
		<!-- Start main -->
		<form name="view_form" method="post">
		<div id="templatemo_main">

			<!-- 수정, 답글, 댓글을 위한 히든태그 -->
			<input type="hidden" name="seq" value="<%=seq%>"/>
			<input type="hidden" name="category" value="<%=category%>"/>
			<input type="hidden" name="layout" value="<%=layout%>"/>
			<input type="hidden" name="mode"/>
			<input type="hidden" name="reple_seq" value="0"/> <!-- 댓글삭제용 -->

			<div class="clear"></div>
			<div class="title">
				<h5><%=dto.getTitle()%></h5>
			</div>
			
			<div class="info">
				<b>작성자</b>&nbsp;&nbsp;
									<%if(category.equals("none")){ %>
										익명
									<%} else {%>									
										<a href="#"><%=dto.getUsername()%></a>
									<%} %>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<b>조회</b>&nbsp;&nbsp;<%=dto.getHit()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<b>추천</b>&nbsp;&nbsp;<%=dto.getLikecount()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<b>작성일</b>&nbsp;&nbsp;<%=dto.getWdate()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				
			</div>
			
			<div class="contents">
				<p><%=dto.getContents()%></p>
			</div>
			
			<div class="repleCount">
				<div style="float: left;">댓글 <%=repleCount%>개</div>
				<div style="float: right;">
					<a href="like.do?category=<%=category%>&seq=<%=seq%>" onclick="javascript:alert('추천되었습니다.')">乃 추천하기</a> 
					&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="#">★ 스크랩</a>
				</div>
			</div>
			
			<div class="reple">
			
				<!-- 댓글 작성 : 시작 -->
					<div class="write">
						<input type="hidden" name="writer" value="<%=userid%>"/>
						<textarea name="contents" id="contents" onkeyup="chkMsgLength(200,contents,currentMsgLen);" 
							<%if(userid.equals("")){%>readonly="readonly" class="readonly" placeholder="로그인 후 입력 가능합니다" onclick="javascript:alert('로그인 후 입력 가능합니다.')<%}%>"></textarea>
						<button onclick="insert_reple()" class="skip" style="width: 80px; height: 52px; position: absolute; margin-left: 10px;">입력</button>
						<div align="right" style="margin-right: 120px;">
							<span id="currentMsgLen" style="text-align: right;" >0</span> / 200byte
						</div>
					</div>
				<!-- 댓글 작성 : 끝 -->
				
				<!-- 댓글 영역 : 시작 -->
				<%
					List repleList = (List)request.getAttribute("repleList");
				
					for(int j=0; j<repleList.size(); j++){
						BoardDto repleDto = (BoardDto)repleList.get(j);
				%>
				<div style="margin-bottom: 15px">
					<b>
						<%if(category.equals("none")){ %>
							익명
						<%} else {%>									
							<a href="#"><%=repleDto.getUsername()%></a>
						<%} %>
					</b>&nbsp;&nbsp;&nbsp;&nbsp;<%=repleDto.getWdate()%>
				
					<%if(userid.equals(repleDto.getWriter())){%>						
						&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:delete_reple('<%=repleDto.getSeq()%>')">삭제</a><br/>
					<%}%>
					
					<p><%=repleDto.getContents()%></p>
				</div>
				<%} %>
				<!-- 댓글 영역 : 끝 -->
				
				<div style="margin-top: 30px; border-top: 1px solid #A6A4A6; padding: 10px 0px 0px 0px;">
					<div style="background-color: #f4f4f4; float: left;">
						<%BoardDto nextpre = (BoardDto)request.getAttribute("next_pre");%>
						<div style="height: 20px;">
							<%if(nextpre.getNext_seq() > 0){ %>
								<a href="view.do?category=<%=category%>&seq=<%=nextpre.getNext_seq()%>">▲ 다음글 | <%=nextpre.getNext_title()%></a>
							<%} %>
						</div>
						<div style="height: 20px;">
							<%if(nextpre.getPre_seq() > 0){ %>
								<a href="view.do?category=<%=category%>&seq=<%=nextpre.getPre_seq()%>">▼ 이전글 | <%=nextpre.getPre_title()%></a>
							<%} %>
						</div>
					</div>
					<div style="float: right; padding-top: 5px">
						<a href="list.do?kind=<%=category%>&pg=1&block=1" class="kboard-default-button-small">목록보기</a>
						<!-- <a href="#" class="kboard-default-button-small">답글쓰기</a> -->
					
						<%if(userid.equals(dto.getWriter())){ %>
							<a href="javascript:modify()" class="kboard-default-button-small">글 수정</a>
							<a href="delete.do?category=<%=category%>&seq=<%=seq%>" class="kboard-default-button-small">글 삭제</a>
						<%} %>
					</div>
				</div>
			</div>				
		</div>
		</form>
		<!-- End main -->
	</div>
	<!-- END of templatemo_wrapper -->
	
	<div class="clear h40"></div>
	<div class="clear h40"></div>

	<%@include file="../../include/footer.jsp"%>
	<script>
	// 댓글 삽입
	function insert_reple(){
		var frm = document.view_form;
		frm.action = "insert_reple.do";
		frm.submit();
	}

	// 게시글 수정
	function modify(){
		var frm = document.view_form;
		
		frm.action = "write.do";
		frm.mode.value = "mod"; //수정
		frm.submit();
	}

	// 댓글 삭제
	function delete_reple(seq){
		var frm = document.view_form;
		msg = "댓글을 삭제 하시겠습니까?";
		if (confirm(msg)!=0) {
			frm.reple_seq.value = seq;		
			frm.action = "delete_reple.do";
			frm.submit();
	    } else {
	    	return;
	    }
	}
	</script>
</body>
</html>