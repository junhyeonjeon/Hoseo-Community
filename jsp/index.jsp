<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<%@include file="./include/head.jsp" %>
</head>

<body>
	<div id="templatemo_wrapper">
	
		<!-- header --> 
		<%@include file="./include/header.jsp"%>
				
		<!-- Start slider -->
		<div id="templatemo_slider">
			<div class="slider-wrapper theme-orman">
				<div class="ribbon"></div>
				<div id="slider" class="nivoSlider">
				<a rel="nofollow" href="http://www.hoseo.ac.kr/CmsHome/intro_00022875.eznic" target="_blank">
					<img src="<%=commonURL%>/jsp/images/slider/05.jpg" alt="학교 전경" title="이미지 클릭 시 대학 홈페이지로 이동합니다"/>
				</a>
				<a rel="nofollow" href="http://www.hoseo.ac.kr/CmsHome/intro_00022875.eznic" target="_blank">
					<img src="<%=commonURL%>/jsp/images/slider/02.jpg" alt="교훈 : 하면된다. 할수있다." title="이미지 클릭 시 대학 홈페이지로 이동합니다"/>
				</a>
				<a rel="nofollow" href="http://www.hoseo.ac.kr/CmsHome/intro_00022875.eznic" target="_blank">
					<img src="<%=commonURL%>/jsp/images/slider/03.jpg" alt="중앙도서관과 잔디광장" title="이미지 클릭 시 대학 홈페이지로 이동합니다"/>
				</a>
				
				<a rel="nofollow" href="http://www.hoseo.ac.kr/CmsHome/intro_00022875.eznic" target="_blank">
					<img src="<%=commonURL%>/jsp/images/slider/06.jpg" alt="장영실관" title="이미지 클릭 시 대학 홈페이지로 이동합니다"/>
				</a> 
				</div>
				<div class="nivo-controlNav-bg"></div>
			</div>
			
			
			<script type="text/javascript" src="<%=commonURL%>/jsp/js/jquery-1.6.1.min.js"></script>
			<script type="text/javascript" src="<%=commonURL%>/jsp/js/jquery.nivo.slider.pack.js"></script>
			<script type="text/javascript">
       			$(window).load(function() {
            		$('#slider').nivoSlider({
						controlNav:true
					});
        		});
        	</script>
		</div>
		<!-- End slider -->

		<!-- Start main -->
		<div id="templatemo_main">
			<h2>About</h2>
			<div class="img_frame img_frame_12 img_nom img_fl">
				<span></span> 
				<img src="<%=commonURL%>/jsp/images/add/about.jpg" alt="" />
			</div>
			<div class="half right">
				<p>
					<em>기존의 
						<a href="http://www.hoseo.ac.kr/CmsHome/communication_08.eznic" target="_blank">호서광장 - 벼룩시장</a>
						은 대학홈페이지의 일부로 접근성이 낮고, 학번이 없는 사용자는 글쓰기가 불가능했습니다. 또한, 커뮤니케이션 기능이 부족해 많은 호서인들이
						사용하기엔 적합하지 않은 게시판이었습니다. <b>'호서 커뮤니티'</b>는 좀 더 자유로운 대학 게시판을 활성화 하기 위해 만들어졌습니다.
					</em>
				</p>
				<ul class="list_bullet">
					<li class="flow">누구든지 가입이 가능합니다</li>
					<li class="flow">중고물품 거래가 가능합니다</li>
					<li class="flow">원룸 광고와 평가가 가능합니다</li>
					<li class="flow">회원은 모든 게시글에 코멘트가 가능합니다</li>
					<li class="flow">호서커뮤니티는 학과 전용 게시판을 지원해드립니다</li>
				</ul>
			</div>

			<div class="clear h40"></div>
			<div class="clear"></div>

		</div>
		<!-- End main -->
	</div>
	<!-- END of templatemo_wrapper -->
	
	<%@include file="./include/footer.jsp" %>
</body>
</html>