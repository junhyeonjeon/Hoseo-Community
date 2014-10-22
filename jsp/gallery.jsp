<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.hoseo.gallery.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<%@include file="./include/head.jsp" %>
</head>

<body>
	<div id="templatemo_wrapper">
	
		<!-- header -->
		<%@include file="./include/header.jsp" %>

		<div id="templatemo_main">
			<h2>Gallery</h2>
			<div id="gallery">
				<%
				int pg = (Integer)request.getAttribute("pg");//페이지 번호
				int pageCount = (Integer)request.getAttribute("pageCount"); //페이지 개수
				int block = (Integer)request.getAttribute("block");
				
				//갤러리 가져오기
				List list = (List)request.getAttribute("list");
				
				for(int i=0; i<list.size(); i++){
					GalleryDto dto = (GalleryDto)list.get(i);
				%>
				<div class="col one_fourth gallery_box <%if(i==3 || i==7){%>no_margin_right<%}%>">
					<div class="img_frame img_frame_14 img_nom">
						<span></span> <a href="<%=commonURL%>/jsp/images/gallery/<%=dto.getUrl()%>" rel="lightbox[new_gallery]"> 
						<img class="hot" src="<%=commonURL%>/jsp/images/gallery/<%=dto.getUrl()%>" alt="Gallery Item 1" />
						</a>
					</div>
					<h4><%=dto.getTitle()%></h4>
					<p><%=dto.getContents()%></p>
				</div>
				<%
				}
				%>
			</div>
			
			<div class="clear"></div>
			<div class="pagging">
				<ul>
					<li><a href="#">Previous</a></li>
					<%for(int i=(block-1)*15+1; pageCount>=i; i++){ %>
						<li><a href="<%=commonURL%>/gallery.do?pg=<%=i%>" <%if(i==pg){%>class="pg_select"<%}%>><%=i%></a></li>
					<%} %>
					<li><a href="#">Next</a></li>
				</ul>
				<% if(userid!=null && !userid.equals("") && userid.equals("admin")){  %>
					<div align="right"><a href="<%=commonURL%>/gallery_upload.do" class="button button-blue"><span>업로드</span></a></div>
				<%} %>
			</div>
			<div class="clear h20"></div>			
		</div>
		<!-- END of templatemo_main -->
	</div>
	<!-- END of templatemo_wrapper -->
	
	<!-- footer -->
	<%@include file="./include/footer.jsp" %>
</body>
</html>