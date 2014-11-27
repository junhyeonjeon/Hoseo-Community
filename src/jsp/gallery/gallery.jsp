<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, com.hoseo.gallery.*, com.hoseo.page.Pager"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<%@include file="../../include/head.jsp" %>
	<link rel="stylesheet" href="<%=commonURL%>/src/css/board_write.css" type="text/css"/>
	<style>
	#tooltip {
		z-index: 999;
		color: red;
		font-size: 12px;
		text-align: center;
	}

	#tooltip .tipBody {
		background-color: white;
	}
	</style>
</head>

<body>
	<div id="templatemo_wrapper">
	
		<!-- header -->
		<%@include file="../../include/header.jsp" %>

		<div id="templatemo_main">
			<h2>Gallery</h2>
			<div id="gallery">
				<%
				//갤러리 가져오기
				List list = (List)request.getAttribute("list");
				
				for(int i=0; i<list.size(); i++){
					GalleryDto dto = (GalleryDto)list.get(i);
				%>
				<div class="col one_fourth gallery_box <%if(i==3 || i==7){%>no_margin_right<%}%>" <%if(i>=1 || i<=4){%>style="height: 220px;"<%} %>>
					<div class="img_frame img_frame_14 img_nom">
						<span></span>
						<a href="<%=commonURL%>/src/db/gallery/<%=dto.getUrl()%>" rel="lightbox[new_gallery]"> 
							<img class="hot pro_ov" src="<%=commonURL%>/src/images/add/pro_ov.png" />
							<img class="hot" src="<%=commonURL%>/src/db/gallery/<%=dto.getUrl()%>" alt="<%=dto.getUrl()%>" />
						</a>
					</div>
					<a href="<%=commonURL%>/gallery/delete.do?seq=<%=dto.getSeq()%>&url=<%=dto.getUrl()%>" rel="tooltip" title="제목 클릭 시 삭제 페이지로 이동"><h4><%=dto.getTitle()%></h4></a>
					<div style="float: left">
						<a href=""><%=dto.getUsername()%></a>
					</div>
					<div style="float: right"><%=dto.getWdate()%></div>
				</div>
				<%
				}
				%>
			</div>
			
			<div class="clear"></div>
			<div class="pagging">
				<!-- 페이징 -->
				<div align="left"><%=Pager.makeTag(commonURL + "/gallery/list.do?", 10, "", "")%></div>

				<!-- 업로드 -->
				<div align="right"><a href="<%=commonURL%>/gallery/upload.do" class="kboard-default-button-small"><span>이미지 업로드</span></a></div>
			</div>
		</div>
		<!-- END of templatemo_main -->
	</div>
	<!-- END of templatemo_wrapper -->
	<div class="clear h40"></div>
	<!-- footer -->
	<%@include file="../../include/footer.jsp" %>
	<script>
		$(document).ready(
				function() {
					// html 페이지에서 'rel=tooltip'이 사용된 곳에 마우스를 가져가면 
					$('a[rel=tooltip]').mouseover(
							function(e) {
								var tip = $(this).attr('title');

								// 브라우져에서 제공하는 기본 툴 팁을 끈다
								$(this).attr('title', '');

								// css와 연동하기 위해 html 태그를 추가해줌
								$(this).append('<div id="tooltip"><div class="tipBody">' + tip + '</div></div>');
							}).mousemove(function(e) {
						//마우스가 움직일 때 툴 팁이 따라 다니도록 위치값 업데이트
						$('#tooltip').css('top', e.pageY - 220);
						$('#tooltip').css('left', e.pageX);
					}).mouseout(function() {
						//위에서 껐던 브라우져에서 제공하는 기본 툴 팁을 복원
						$(this).attr('title', $('.tipBody').html());
						$(this).children('div#tooltip').remove();
					});
				});
	</script>
</body>
</html>