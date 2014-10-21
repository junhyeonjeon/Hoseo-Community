<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
			<div class="border_title">
				<h5>게시판 제목 <small>- 간단한 게시판 소개글</small></h5>				
			</div>	
			<div id="gallery">
				<div class="col one_fourth gallery_box">
					<div class="img_frame img_frame_14 img_nom">
						<span></span> 
						<a href="images/portfolio/01.jpg" rel="lightbox[new_gallery]">
							<img class="hot pro_ov" src="images/add/pro_ov.png"/>
							<img class="hot_label" src="images/add/icon_hot.png"/>
							<img class="hot" src="images/portfolio/01.jpg" alt="Gallery Item 1" />
						</a>
						
					</div>
					<a class="hot_a" href="boardView.jsp?kind=trade&num=1"><h5>중고 책 팝니다</h5></a>
					<div style="float: left">userid</div>
					<div style="float: right">2014-10-10</div>
					<a href="#" class="more">MORE</a>
				</div>
				<div class="col one_fourth gallery_box">
					<div class="img_frame img_frame_14 img_nom">
						<span></span> 
						<a href="images/portfolio/02.jpg"	rel="lightbox[new_gallery]">
							<img class="hot pro_ov" src="images/add/pro_ov.png"/>
							<img class="hot_label" src="images/add/icon_hot.png"/>
							<img class="hot" src="images/portfolio/02.jpg" alt="Gallery Item 2" />
						</a>
					</div>
					<a class="hot_a" href="boardView.jsp?kind=trade&num=1"><h5>중고 스마트폰 팝니다</h5></a>
					<div style="float: left">userid</div>
					<div style="float: right">2014-10-10</div>
					<a href="#" class="more">MORE</a>
				</div>
				<div class="col one_fourth gallery_box">
					<div class="img_frame img_frame_14 img_nom">
						<span></span> 
						<a href="images/portfolio/03.jpg"	rel="lightbox[new_gallery]">
							<img class="hot pro_ov" src="images/add/pro_ov.png"/>
							<img class="hot_label" src="images/add/icon_hot.png"/>
							<img class="hot" src="images/portfolio/03.jpg" alt="Gallery Item 3" />
						</a>
					</div>
					<a class="hot_a" href="boardView.jsp?kind=trade&num=1"><h5>중고 자전거 팝니다</h5></a>
					<div style="float: left">userid</div>
					<div style="float: right">2014-10-10</div>
					<a href="#" class="more">MORE</a>
				</div>
				<div class="col one_fourth gallery_box no_margin_right">
					<div class="img_frame img_frame_14 img_nom">
						<span></span> 
						<a href="images/portfolio/04.jpg" rel="lightbox[new_gallery]">
							<img class="hot pro_ov" src="images/add/pro_ov.png"/>
							<img class="hot_label" src="images/add/icon_hot.png"/>
							<img class="hot" src="images/portfolio/04.jpg" alt="Gallery Item 4" />
						</a>
					</div>
					<a class="hot_a" href="boardView.jsp?kind=trade&num=1"><h5>바이크 싸게 드립니다</h5></a>
					<div style="float: left">userid</div>
					<div style="float: right">2014-10-10</div>
					<a href="#" class="more">MORE</a>
				</div>
			</div>
			<div>
				<table class="table_board" cellpadding="0" cellspacing="0" border="0">
					<colgroup>
						<col width="60"/>
						<col width="*"/>
						<col width="130"/>
						<col width="100"/>
						<col width="70"/>
						<col width="70"/>	
					</colgroup>
					<thead>
						<tr class="tr_board">
							<td></td>
							<td>제목</td>
							<td>작성자</td>
							<td>작성일</td>
							<td>조회</td>
							<td>추천</td>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td align="center">1</td>
							<td align="left"><a href="#">제목</a></td>
							<td align="center"><a href="#">userid</a></td>
							<td align="center">2014-08-16</td>
							<td align="center">30</td>
							<td align="center">0</td>
						</tr>
						<tr>
							<td align="center">2</td>
							<td align="left"><a href="#">제목</a></td>
							<td align="center"><a href="#">userid</a></td>
							<td align="center">2014-08-16</td>
							<td align="center">30</td>
							<td align="center">0</td>
						</tr>
						<tr>
							<td align="center">3</td>
							<td align="left"><a href="#">제목</a></td>
							<td align="center"><a href="#">userid</a></td>
							<td align="center">2014-08-16</td>
							<td align="center">30</td>
							<td align="center">0</td>
						</tr>
						<tr>
							<td align="center">4</td>
							<td align="left"><a href="#">제목</a></td>
							<td align="center"><a href="#">userid</a></td>
							<td align="center">2014-08-16</td>
							<td align="center">30</td>
							<td align="center">0</td>
						</tr>
						<tr>
							<td align="center">5</td>
							<td align="left"><a href="#">제목</a></td>
							<td align="center"><a href="#">userid</a></td>
							<td align="center">2014-08-16</td>
							<td align="center">30</td>
							<td align="center">0</td>
						</tr>
						<tr>
							<td align="center">6</td>
							<td align="left"><a href="#">제목</a></td>
							<td align="center"><a href="#">userid</a></td>
							<td align="center">2014-08-16</td>
							<td align="center">30</td>
							<td align="center">0</td>
						</tr>
						<tr>
							<td align="center">7</td>
							<td align="left"><a href="#">제목</a></td>
							<td align="center"><a href="#">userid</a></td>
							<td align="center">2014-08-16</td>
							<td align="center">30</td>
							<td align="center">0</td>
						</tr>
						<tr>
							<td align="center">8</td>
							<td align="left"><a href="#">제목</a></td>
							<td align="center"><a href="#">userid</a></td>
							<td align="center">2014-08-16</td>
							<td align="center">30</td>
							<td align="center">0</td>
						</tr>
						<tr>
							<td align="center">9</td>
							<td align="left"><a href="#">제목</a></td>
							<td align="center"><a href="#">userid</a></td>
							<td align="center">2014-08-16</td>
							<td align="center">30</td>
							<td align="center">0</td>
						</tr>
						<tr>
							<td align="center">10</td>
							<td align="left"><a href="#">제목</a></td>
							<td align="center"><a href="#">userid</a></td>
							<td align="center">2014-08-16</td>
							<td align="center">30</td>
							<td align="center">0</td>
						</tr>

					</tbody>
				</table>
			</div>

			<div class="clear"></div>
			<div class="pagging">
				<ul>
					<li><a href="#">Previous</a></li>
					<li><a href="#" class="pg_select">1</a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li><a href="#">6</a></li>
					<li><a href="#">7</a></li>
					<li><a href="#">8</a></li>
					<li><a href="#">Next</a></li>
				</ul>
				<div align="right">
					<select>
						<option>전체</option>
						<option>제목</option>
						<option>내용</option>
						<option>작성자</option>						
					</select>
					<input type="text" name="search"/>
					<a href="#" class="button button-search"><span class="btn-board">Search</span></a>
					&nbsp;
					<a href="board_write.jsp" class="button btn-board button-search"><span class="btn-board">Write</span></a>
				</div>
			</div>			
			<div class="clear"></div>

			<div class="clear"></div>
		</div>
		<!-- END of templatemo_main -->
	</div>
	<!-- END of templatemo_wrapper -->
	
	<!-- footer -->
	<%@include file="./include/footer.jsp" %>
</body>
</html>