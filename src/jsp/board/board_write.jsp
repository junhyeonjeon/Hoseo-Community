<%@page import="com.hoseo.board.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@include file="../../include/checkLogin.jsp"%>
<%@include file="../../include/head.jsp"%>
<link rel="stylesheet" href="<%=commonURL%>/src/css/board_write.css" type="text/css"/>
<script src="<%=commonURL%>/src/js/board.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/src/smarteditor/js/HuskyEZCreator.js" charset="utf-8"></script>
</head>

<body>
	<div id="templatemo_wrapper">
		<!-- header -->
		<%@include file="../../include/header.jsp"%>
		<%
			String mode = StringUtil.convNull(request.getAttribute("mode"), "ins"); // 글쓰기 모드 (삽입, 수정, 답글)
			String referer = request.getHeader("referer"); // 이전 페이지
			String category = request.getParameter("category"); // 카테고리
			String writer = (String)session.getAttribute("userid"); // 작성자 아이디
			
			String title = ""; // 글제목
			String contents = ""; // 글내용
			int seq = 0; // 글번호
			
			// 수정
			if(mode.equals("mod")){
				BoardDto modDto = (BoardDto)request.getAttribute("dto");
				title = modDto.getTitle();
				contents = modDto.getContents();
				seq = (Integer)request.getAttribute("seq");
			}
		%>

		<form name="write_form" id="frm" action="write_ok.do" method="post" enctype="multipart/form-data">
			<input type="hidden" name="category" id="category" value="<%=category%>"/>
			<input type="hidden" name="referer" id="referer" value="<%=referer%>"/>
			<input type="hidden" name="writer" id="writer" value="<%=writer%>"/>
			<input type="hidden" name="mode" value="<%=mode%>"/>
			<input type="hidden" name="seq" value="<%=seq%>"/>

			<!-- Start main -->
			<div id="templatemo_main">
				<div id="kboard-default-editor">

					<div class="kboard-header"></div>

					<div class="kboard-attr-row kboard-attr-title">
						<label class="attr-name">제목 </label>
						<div class="attr-value">
							<input type="text" name="title" id="title" value="<%=title%>"/>
						</div>
					</div>

					<%
						if((category.equals("trade") || category.equals("ad")) && mode.equals("ins")){ 
					%>
					<div class="kboard-attr-row">
						<label class="attr-name">프리미엄 옵션 </label>
						<div class="attr-value">
							<select title="프리미엄" name="premium" id="premium" class="sel" onchange="block_file(this)">
								<option value="0">선택 안함</option>
								<option value="1">1주 - 1,000원</option>
								<option value="2">2주 - 1,800원</option>
								<option value="3">3주 - 2,500원</option>
								<option value="4">4주 - 3,500원</option>
							</select>
							&nbsp;프리미엄을 선택 시, 화면에 보일 사진을 등록해주세요.
						</div>
						<div class="attr-value" id="file" style="display: none">
							<input type="file" name="files[0]" id="files1" onchange="uploadImg(this);"/>※ 10MB 이하의 이미지 파일(jpg, gif, png)만 업로드 가능
						</div>
					</div>
					
					<%}else{%>
					<input type="hidden" name="premium" id="premium" value="0"/>
					<%} %>
					
					<div class="kboard-content">
						<textarea name="contents" id="contents"><%=contents%></textarea><br/>
					</div>
					
					<div class="kboard-control">
						<div class="left">
							<a href="javascript:history.back(-1)" class="kboard-default-button-small" onclick="history.back(-1)">돌아가기</a>
						</div>
						<div class="right">
							<a id="savebutton" class="kboard-default-button-small">
							<%if(mode.equals("mod")){ %>
								수정완료
							<%}else{ %>
								작성완료
							<%} %>
							</a>
						</div>
					</div>
				</div>
			</div>
		</form>

		<!-- SmartEditer -->
		<script>
		$(function() {
			//전역변수선언
			var editor_object = [];

			nhn.husky.EZCreator.createInIFrame({
				oAppRef : editor_object, elPlaceHolder : "contents", sSkinURI : "<%=request.getContextPath()%>/src/smarteditor/SmartEditor2Skin.html", htParams : {
								// 툴바 사용 여부 (true:사용/ false:사용하지 않음)
								bUseToolbar : true,
								// 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)
								bUseVerticalResizer : true,
								// 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)
								bUseModeChanger : true,
							}
						});

				//전송버튼 클릭이벤트
				$("#savebutton").click(
						function() {
							
							var title = document.getElementById("title").value;
							if (title == "" || title == null) {
								alert("제목을 입력해주세요.");
								frm.title.focus();
								return;
							}
							
							//id가 smarteditor인 textarea에 에디터에서 대입
							editor_object.getById["contents"].exec("UPDATE_CONTENTS_FIELD", []);

							// 이부분에 에디터 validation 검증

							//폼 submit
							$("#frm").submit();
						})
			})
		</script>

	<div class="clear h40"></div>
	<div class="clear h40"></div>

	</div>
	<!-- End main -->
	<!-- END of templatemo_wrapper -->

	<%@include file="../../include/footer.jsp"%>
	
	<script>
		// 프리미엄 게시글 이미지 div 창 출력 조절
		function block_file(select) {
			var file = document.getElementById("file");

			if (select.value > 0)
				file.style.display = 'block';
			else
				file.style.display = 'none';
		}
	</script>

</body>
</html>