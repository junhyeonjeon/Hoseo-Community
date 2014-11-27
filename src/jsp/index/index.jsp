<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.hoseo.gallery.GalleryDto, java.util.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@include file= "../../include/head.jsp"%>
<link rel="stylesheet" href="<%=commonURL%>/src/css/index_slider_1.css"	type="text/css" media="screen" />
<link rel="stylesheet" href="<%=commonURL%>/src/css/index_slider_2.css"	type="text/css" media="screen" />
</head>

<body>
	<div id="templatemo_wrapper">

		<%@include file="../../include/header.jsp"%>

		<!-- 메인 이미지 슬라이더 : 시작 -->
		<div id="templatemo_slider">
			<div class="slider-wrapper theme-orman">
				<div class="ribbon"></div> <!-- 테두리 설정 -->
				
				<!-- 슬라이더에 사용할 이미지 설정 -->
				<div id="slider" class="nivoSlider">
					<a rel="nofollow" href="http://www.hoseo.ac.kr/CmsHome/intro_00022875.eznic" target="_blank"> 
						<img src="<%=commonURL%>/src/images/slider/05.jpg" alt="학교 전경"	title="이미지 클릭 시 대학 홈페이지로 이동합니다" />
					</a> 
					<a rel="nofollow" href="http://www.hoseo.ac.kr/CmsHome/intro_00022875.eznic" target="_blank"> 
						<img src="<%=commonURL%>/src/images/slider/02.jpg" alt="교훈 : 하면된다. 할수있다." title="이미지 클릭 시 대학 홈페이지로 이동합니다" />
					</a> 
					<a rel="nofollow" href="http://www.hoseo.ac.kr/CmsHome/intro_00022875.eznic" target="_blank"> 
						<img src="<%=commonURL%>/src/images/slider/03.jpg" alt="중앙도서관과 잔디광장" 	title="이미지 클릭 시 대학 홈페이지로 이동합니다" />
					</a> 
					<a rel="nofollow" href="http://www.hoseo.ac.kr/CmsHome/intro_00022875.eznic" target="_blank"> 
						<img src="<%=commonURL%>/src/images/slider/06.jpg" alt="장영실관" title="이미지 클릭 시 대학 홈페이지로 이동합니다" />
					</a>
				</div>
				
				<div class="nivo-controlNav-bg"></div>
			</div>

			
		</div>
		<!-- 메인 이미지 슬라이더 : 끝 -->

		<!-- Start main -->
		<div id="templatemo_main">
			<h2>About</h2>
			<div class="img_frame img_frame_12 img_nom img_fl">
				<span></span> <img src="<%=commonURL%>/src/images/add/about.jpg"
					alt="" />
			</div>
			<div class="half right">
				<p>
					<em>기존의 <a
						href="http://www.hoseo.ac.kr/CmsHome/communication_08.eznic"
						target="_blank">호서광장 - 벼룩시장</a> 은 학번이 없는 사용자는	글쓰기가 불가능했고, 커뮤니케이션<br/> 기능이 부족해 많은 호서인들이 사용하기엔 적합하지 않은 게시판이었습니다.
						<br/><b>'호서 커뮤니티'</b>는 좀 더 자유로운 대학 게시판을 활성화 하기 위해 만들어졌습니다.
					</em>
				</p>
				<ul class="list_bullet">
					<li class="flow">누구든지 가입이 가능합니다</li>
					<li class="flow">중고물품 거래가 가능합니다</li>
					<li class="flow">원룸 광고와 평가가 가능합니다</li>
					<li class="flow">회원은 모든 게시글에 코멘트가 가능합니다</li>
					<!-- <li class="flow">호서커뮤니티는 학과 전용 게시판을 지원해드립니다</li> -->
				</ul>
			</div>

			<div class="clear h40"></div>

		</div>
		<!-- End main -->
	</div>
	<!-- END of templatemo_wrapper -->
	
	<!-- 각 게시판 소개 글 : 시작 -->
	<div id="templatemo_bottom_wrapper">
		<div id="templatemo_bottom">
		
			<!-- market 게시판 소개 : 시작 -->
			<div class="col one_fourth">
				<h4>Market Place</h4>
				<ul class="no_bullet">
					<li>
						<span class="header"> 
							<a href="<%=commonURL%>/market/list.do?kind=trade&pg=1&block=1">중고거래</a>
						</span>
						<p>각종 중고 물품 사고 팔기가 가능합니다.</p>
					</li>
					<li>
						<span class="header"> 
							<a href="<%=commonURL%>/market/list.do?kind=ad&pg=1&block=1">원룸광고</a>
						</span>
						<p>건물주분들의 원룸광고를 지원해주며, 학생분들은 원룸 정보를 알아 볼 수 있습니다.</p></li>
					<li>
						<span class="header"> 
							<a href="<%=commonURL%>/market/list.do?kind=report&pg=1&block=1">사건/사고 신고</a>
						</span>
						<p>거래 중의 각종 사고를 신고할 수 있습니다. 불량 이용자는 블랙리스트에 등록됩니다.</p>
					</li>
				</ul>
			</div>
			<!-- market 게시판 소개 : 끝 -->
			
			<!-- board 게시판 소개 : 시작 -->
			<div class="col one_fourth">
				<h4>Board</h4>
				<ul class="no_bullet">
					<li><span class="header"> <a
							href="<%=commonURL%>/board/list.do?kind=free&pg=1&block=1"">자유게시판</a>
					</span>
						<p>모든 이용자들이 자유롭게 대화할 수 있는 게시판 입니다.</p></li>
					<li><span class="header"> <a
							href="<%=commonURL%>/board/list.do?kind=none&pg=1&block=1">익명게시판</a>
					</span>
						<p>무엇이든 터놓고 이야기 할 수 있는 게시판입니다.</p></li>
					<li><span class="header"> <a
							href="<%=commonURL%>/board/list.do?kind=missing&pg=1&block=1">분실/습득물</a>
					</span>
						<p>교내에서 분실/습득한 물품을 신고해주세요</p></li>
				</ul>
			</div>
			<!-- board 게시판 소개 : 끝 -->
			
			<!-- gallery 게시판 소개 : 시작 -->
			<div class="col one_fourth">
				<h4>Photo Gallery</h4>
				<ul class="footer_gallery">
					<!-- DB에서 최신 이미지 9개 가져와서 출력 -->
					<% List list = (List)request.getAttribute("list");
						
						for(int i=0; i<list.size(); i++){
							GalleryDto dto = (GalleryDto)list.get(i);
					%>
					<li>
						<a href="<%=commonURL%>/src/db/gallery/<%=dto.getUrl()%>" rel="lightbox[portfolio]"> 
							<img src="<%=commonURL%>/src/db/gallery/<%=dto.getUrl()%>" alt="image 6" />
						</a>
					</li>
					<%} %>
				</ul>
				<div class="clear"></div>
				<a href="<%=commonURL%>/gallery/list.do?pg=1&block=1" class="more">more</a>
			</div>
			<!-- gallery 게시판 소개 : 끝 -->
			
			<!-- Contact 페이지 소개 : 시작 -->
			<div class="col one_fourth no_margin_right">
				<h4>Contact</h4>
				<ul class="no_bullet">
					<!-- <li><span class="header">
							<a href="<%=commonURL%>/blog.do">Blog</a>
						</span> 
						<p>관리자 전용 블로그입니다. 일상생활, 유용한정보 등 다양한 포스팅을 열람하실 수 있습니다.</p>
					</li> -->
					<li><span class="header"> 
						<a href="<%=commonURL%>/contact.do">Contact</a>
					</span>
						<p>사이트 이용 중 불편한 사항을 관리자에게 문의 할 수 있습니다.</p></li>
					
					<li><span class="header"> 
						<a href="<%=commonURL%>/admin.do">관리자 페이지</a>
					</span>
						<p>사이트 관리 페이지로, 권리자 권한이 있는 계정만 사용 가능합니다.</p></li>
				</ul>
			</div>
			<!-- Contact 페이지 소개 : 끝 -->
			
			<div class="clear"></div>
		</div>
	</div>
	
	<!-- footer -->
	<%@include file="../../include/footer.jsp"%>
	
	<!-- slider script -->
	<script type="text/javascript" src="<%=commonURL%>/src/js/jquery.nivo.slider.pack.js"></script>
	<script type="text/javascript">
		$(window).load(function() {
			$('#slider').nivoSlider({
				controlNav : true
			});
		});
	</script>
</body>
</html>