<%@page import="com.hoseo.message.MessageDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@include file="../../include/head.jsp"%>
<link rel="stylesheet" href="<%=commonURL%>/src/css/join.css"
	type="text/css" />
<link rel="stylesheet" href="<%=commonURL%>/src/css/login.css"
	type="text/css" />


<style>
#leftview {
	background: #EAEAEA;
	width: 200px;
	float: left;
}

#rightview {
	width: 75%;
	float: right;
}

li {
	list-style: none;
}

.login_form {
	margin-top: 0px;
}
</style>
<script src="<%=commonURL%>/src/js/cancellation.js"></script>
</head>

<body>

	<div id="templatemo_wrapper">

		<!-- header 추가-->
		<%@include file="../../include/header.jsp"%>

		<div id="templatemo_main">

			<!-- MY Page 이미지 삽입 -->
			<br></br>
			<div align="center" style="width: 100%;">
				<img src="http://www.topsecretglasgow.com/image-files/ts_my_page_500_v1.png" align="middle"/>
			</div>

			<br /> <br /> <br />
			<%@include file="./message_side.jsp"%>




			<!-- rightview start -->
			<div id="rightview">

				<form name="msg" method="post" class="form-horizontal">

					<div align="center" class="login_form" style="height: 100%;">
						<div class="board_title">
							<h3 style="text-align: center; color: black">쪽지 보내기</h3>
						</div>

						<div align="center" class="login_input" style="margin-top: 0px">

							<input type="hidden" name="sendid" id="sendid"
								placeholder="보내는사람" value="<%=userid%>" /><br />
							<br />
							<div align="left">
								<span class="error" name="sendid_result" id="sendid_result"></span>
							</div>

							<input type="text" name="receiveid" id="receiveid"
								placeholder="받는사람" />
							<div align="left">
								<span class="error" name="receiveid_result"
									id="receiveid_result"></span>
							</div>
						</div>


						<div class="clear h50"></div>
						<div style="width: 500px;">
							<div class="row_group">

								<div id="idDiv" class="join_row">
									<span class="ps_box int_id"> <input type="text"
										name="subject" id="subject" maxlength="30" placeholder="제목"
										class="int input_id" />
									</span>
									<div align="left">
										<span class="error" name="subject_result" id="subject_result"></span>
									</div>
								</div>


								<div id="idDiv" class="join_row">
									<span class="ps_box int_id" style="height: 100px"> <textarea
											name="contents" id="contents"
											onkeyup="chkMsgLength(200,contents,currentMsgLen);"
											placeholder="내용" class="input_id"
											style="margin: 0px; width: 470px; height: 90px;"></textarea>
										<div align="right" style="margin-right: 120px;">
											<span id="currentMsgLen" style="text-align: right;">0</span>
											/ 200byte
										</div>
									</span>
									<div align="left">
										<span class="error" name="contents_result"
											id="contents_result"></span>
									</div>
								</div>

							</div>
						</div>

						<a href="javascript:message_ok()"
							class="button button-blue register"><span>쪽지보내기</span></a>
					</div>


				</form>



			</div>
			<!-- rightview end -->

			<div class="clear h40"></div>
			<div class="clear h40"></div>


		</div>
		<!-- END of templatemo_main -->

	</div>
	<!-- END of templatemo_wrapper -->

	<!-- footer -->
	<%@include file="../../include/footer.jsp"%>

	<script type="text/javascript" src="<%=commonURL%>/src/js/message.js"></script>
	<script src="<%=commonURL%>/src/js/textarea.js"></script>


</body>
</html>