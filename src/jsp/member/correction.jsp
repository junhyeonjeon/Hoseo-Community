<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="com.hoseo.member.*, java.util.*"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@include file="../../include/head.jsp"%>
<link rel="stylesheet" href="<%=commonURL%>/src/css/join.css"
	type="text/css" />
<link rel="stylesheet" href="<%=commonURL%>/src/css/login.css"
	type="text/css" />


</head>

<body>
	<div id="templatemo_wrapper">


		<!-- header -->
		<%@include file="../../include/header.jsp"%>

		<%
			MemberDto dto = (MemberDto) request
					.getAttribute("result_correction");
			MemberDto dto_pw = (MemberDto) request
					.getAttribute("Modify_password");
		%>


		<div id="templatemo_main">
			<form name="join" method="post" class="form-horizontal">
				<div align="center" class="login_form">
					<div class="login_here">
						<img src="<%=commonURL%>/src/images/add/intro_tex03.png"
							alt="호서대학교"></img>
					</div>
					<div style="width: 400px;">
						<div class="row_group">
							<div id="idDiv" class="join_row">
								<span class="ps_box int_id"> <!-- userid -->
									<div align="left">
										<%=userid%>

									</div> <input type="hidden" name="userid" value="<%=userid%>"></input>
								</span>
							</div>

							<div class="join_row">
								<span class="ps_box int_pass"> <!-- password1 --> <input
									type="password" name="pwf1" id="pwf1" maxlength="16"
									placeholder="현재 비밀번호" class="int input_pw"
									onblur="check('pwf1')" />
								</span>
								<div align="left">
									<span class="error" name="pwf1_result" id="pwf1_result"></span>
								</div>


							</div>


							<!-- 
						비밀번호 입력부분 -->
							<div class="join_row">
								<span class="ps_box int_pass"> <!-- password1 --> <input
									type="password" name="pw1" id="pw1" maxlength="16"
									placeholder="비밀번호" class="int input_pw"
									onblur="correction_check('pw1')" />
								</span>
								<div align="left">
									<span class="error" name="pw1_result" id="pw1_result"></span>
								</div>
							</div>

							<div class="join_row">
								<span class="ps_box int_pass"> <!-- password2 --> <input
									type="password" name="pw2" id="pw2" maxlength="16"
									placeholder="비밀번호 재입력" class="int input_pw"
									onblur="correction_check('pw2')" />
								</span>
								<div align="left">
									<span class="error" name="pw2_result" id="pw2_result"></span>
								</div>
							</div>

						</div>

						<div class="row_group">
							<div class="join_row">
								<span class="ps_box"> <!-- username --> <input
									type="text" name="username" id="username" maxlength="10"
									value=<%=dto.getUsername()%> placeholder="닉네임" class="int"
									onblur="check('username')" />
								</span>
								<div align="left">
									<span class="error" name="username_result" id="username_result"></span>
								</div>
							</div>

							<!-- 생년월일 자르기 -->
							<%
								String bir = dto.getBirth();
								String year = bir.substring(0, 4);
								String month = bir.substring(5, 7).replace("0", ""); 
								String day = bir.substring(8, 10);
								int to = Integer.parseInt(month); 
							%>

							<div class="join_row join_birthday">
								<div class="join_birth">
									<div class="bir_yy">
										<span class="ps_box"> <!-- birth_year --> <input
											type="text" name="year" id="year" maxlength="4"
											value=<%=year%> placeholder="생년" class="int"
											onblur="checkBirth()" />
										</span>
									</div>
									<div class="bir_mm">
										<span class="ps_box"> <!-- birth_month --> <select
											title="월" name="month" id="month" class="sel"
											onblur="checkBirth()" >
												
												<option value="">▒선택▒</option>
												<option value="01" <%if(to==1){ %> selected <%}%> >1 </option>
												<option value="02" <%if(to==2){ %> selected <%}%> >2 </option>
												<option value="03" <%if(to==3){ %> selected <%}%> >3</option>
												<option value="04"  <%if(to==4){ %> selected <%}%> >4</option>
												<option value="05"  <%if(to==5){ %> selected <%}%> >5</option>
												<option value="06" <%if(to==6){ %> selected <%}%> >6</option>
												<option value="07" <%if(to==7){ %> selected <%}%> >7</option>
												<option value="08"<%if(to==8){ %> selected <%}%>>8</option>
												<option value="09" <%if(to==9){ %> selected <%}%> >9</option>
												<option value="10" <%if(to==10){ %> selected <%}%> >10</option>
												<option value="11" <%if(to==11){ %> selected <%}%> >11</option>
												<option value="12" <%if(to==12){ %> selected <%}%>  >12</option>
												
											
										</select>
										</span>
									</div>
									<div class="bir_dd">
										<span class="ps_box"> <!-- birth_day --> <input
											type="text" name="day" id="day" maxlength="2" placeholder="일"
											value=<%=day%> class="int" onblur="checkBirth()" />
										</span>
									</div>
								</div>
								<div align="left">
									<span class="error" name="birth_result" id="birth_result"></span>
								</div>
							</div>

							<div class="join_row join_email">
								<span class="ps_box int_email"> <!-- email --> <input
									type="email" name="email" id="email" maxlength="100"
									value=<%=dto.getEmail()%> placeholder="이메일" class="int"
									onblur="check('email')" />
								</span>
								<div align="left">
									<span class="error" name="email_result" id="email_result"></span>
								</div>
							</div>
						</div>



						<div class="row_group" style="display: block">
							<div class="join_row join_mobile">
								<span class="ps_box country_code"> <span
									class="sel_value">+82</span>
								</span> <span class="ps_box int_mobile"> <!-- phone --> <input
									type="text" name="phone" id="phone" maxlength="11"
									placeholder="휴대전화번호" class="int"
									onblur="check('phone')"
									value="<%=dto.getPhone().trim()%>" />
								</span>
								<div align="left">
									<span class="error" name="phone_result" id="phone_result"></span>
								</div>
								<a href="javascript:checkPhone()"
									class="btn_c btn_mobile_submit">인증</a>
							</div>

							<div id="authnoDiv" class="join_row join_mobile_certify">
								<span class="ps_box int_mobile_certify"> <!-- phone_key -->
									<input type="text" name="key" id="key" maxlength="6"
									placeholder="인증번호" class="int" onblur="check('key')" />
								</span>
								<div align="left">
									<span class="error" name="key_result" id="key_result"></span>
								</div>
								<a href="javascript:checkKey()" class="btn_c btn_mobile_submit">확인</a>
							</div>
						</div>
					</div>
					&nbsp;&nbsp;&nbsp;&nbsp;



					<div id="main" style="margin: auto;">
						<div id=a style="float: center;">
							<input type="button" value="수정하기" class="thoughtbot"
								onclick="modify_ok()" />

						</div>

						<div id=b style="float: center;">
							<a href="javascript:history.back() "><input type="button"
								value="뒤로가기 " class="thoughtbot" /></a> </a>
						</div>

					</div>


				</div>
			</form>

			<div class="clear h20"></div>
		</div>
		<!-- END of templatemo_main -->
	</div>
	<!-- END of templatemo_wrapper -->
	<div class="clear h40"></div>
	<!-- footer -->
	<%@include file="../../include/footer.jsp"%>
	<script type="text/JavaScript" src="<%=commonURL%>/src/js/member.js"></script>

</body>
</html>