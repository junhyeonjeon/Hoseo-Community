<%@page import="com.hoseo.message.*, java.util.*, com.hoseo.page.Pager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@include file="../../include/checkLogin_MvIndex.jsp"%>
<%@include file="../../include/head.jsp" %>
<link rel="stylesheet" href="<%=commonURL%>/src/css/board_slider.css" type="text/css" media="screen" />
<link rel="stylesheet" href="<%=commonURL%>/src/css/board_write.css" type="text/css"/>

<style type="text/css">

#leftview{background:#EAEAEA; width:200px; float:left;}
#rightview{width:720px; float:right;}

table { table-layout: fixed }
table td { overflow: hidden; text-overflow:ellipsis;  white-space:nowrap;}
 
</style>

</head>

<body>


	<div id="templatemo_wrapper">

		<!-- header -->
		<%@include file="../../include/header.jsp"%>



		<div id="templatemo_main">
		
	<br></br>
			<div
				style="width: 100%; height: 50px; font-family: 돋음체; font-size: 70px;">
				<img
					src="http://www.topsecretglasgow.com/image-files/ts_my_page_500_v1.png"></img>
			</div>

			<br></br> <br></br> <br></br>
		
			<%@include file="./message_side.jsp" %>
			<!-- 왼쪽메뉴 : 끝 -->




			<!-- 오른쪽 내용 : 시작 -->
			<div id="rightview">
	
				<div class="board_title">
					<h3 style="text-align: center;">  보낸 쪽지함 </h3>
				</div>
						
				<div style="margin-bottom: 30px;"></div>		
				
						
						
				<!-- 리스트 : 시작 -->	
				<div style = "display:block; overflow: hidden; width:500; white-space:nowrap; text-overflow:ellipsis;">
					<table class="table_board" cellpadding="0" cellspacing="0" border="0">
						<colgroup>
							<col width="120" />
							<col width="150"/>
							<col width="*" />
							<col width="150" />
						</colgroup>
					
						<thead>
							<tr class="tr_board">
								<td>받은사람</td>
								<td>제목</td>
								<td>내용</td>
								<td>날짜</td>
							</tr>
						</thead>
	
						<tbody>
						<%
							List list = (List)request.getAttribute("list");
						
							for(int i=0; i<list.size(); i++){
								MessageDto dto = (MessageDto)list.get(i);
						%>
						
						
							<tr>
								<td align="center"><%=dto.getReceiveid()%></a></td>
								<td align="left"><a href="#"><%=dto.getSubject()%></a></td>
								<td align="left"><a href="#"><%=dto.getContents()%></a></td>
								<td align="center"><%=dto.getSdate()%></td>
							</tr>			
						<%} %>
	
						</tbody>
						
					</table>
				</div>

				<% 	if(list.size() == 0){%>
					<div style="text-align: center; margin: 50px;">
					발신된 쪽지가 없습니다.
					</div>
				<%} %>
				
				<!-- 리스트 : 끝 -->
				
				

				<div class="clear"></div>
				
				
			
			</div>
			
			<!-- 오른쪽 내용 : 끝 -->
				
			<div class="clear h40"></div>
			<div class="clear h40"></div>
		
	
		</div>
		<!-- END of templatemo_main -->

	</div>
	<!-- END of templatemo_wrapper -->

	<!-- footer -->
	<%@include file="../../include/footer.jsp" %>
	<script src="<%=commonURL%>/src/js/cancellation.js"></script>
</body>
</html>