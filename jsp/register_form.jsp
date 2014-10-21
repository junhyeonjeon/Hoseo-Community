<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<%@include file="./include/head.jsp" %>
<link rel="stylesheet" href="<%=commonURL%>/jsp/css/join.css" type="text/css" />
<link rel="stylesheet" href="<%=commonURL%>/jsp/css/login.css" type="text/css" />

<body>
	<div id="templatemo_wrapper">
	
		<!-- header -->
		<%@include file="./include/header.jsp" %>

		<div id="templatemo_main">
			
			<form name="join" method="post" class="form-horizontal" role="form"	autocomplete="off">
			<div align="center" class="login_form" style="height: 100%;">
			    <div class="login_here">
			    	<label>JOIN HERE</label>
			    </div>
			    <div class="clear h40"></div>
			    <div style="width: 400px;">
			    	<div class="row_group">
						<div id="idDiv" class="join_row">
							<span class="ps_box int_id">
								<input type="text" name="userid" id="userid" maxlength="12" placeholder="아이디" class="int input_id" onblur="check('userid')"/>
							</span>
							<div align="left"><span class="error" name="userid_result" id="userid_result"></span></div>
						</div>
						<div class="join_row">
							<span class="ps_box int_pass">
								<input type="password" name="pw1" id="pw1" maxlength="16" placeholder="비밀번호" class="int input_pw" onblur="check('pw1')"/>
							</span>	
							<div align="left"><span class="error" name="pw1_result" id="pw1_result"></span></div>
						</div>
						<div class="join_row">
							<span class="ps_box int_pass">
								<input type="password" name="pw2" id="pw2" maxlength="16" placeholder="비밀번호 재입력" class="int input_pw" onblur="check('pw2')"/>
							</span>
							<div align="left"><span class="error" name="pw2_result" id="pw2_result"></span></div>
						</div>
					</div>
					
					<div class="row_group">
						<div class="join_row">
							<span class="ps_box">
								<input type="text" name="username" id="username" maxlength="40" placeholder="이름" class="int" onblur="check('username')"/>
							</span>
							<div align="left"><span class="error" name="username_result" id="username_result"></span></div>
						</div>
						
						<div class="join_row join_birthday">
							<div class="join_birth">
								<div class="bir_yy">
									<span class="ps_box">
										<input type="text" name="year" id="year" maxlength="4" placeholder="생년" class="int" onblur="checkBirth()"/> 
									</span>
								</div>
								<div class="bir_mm">
									<span class="ps_box">
										<select title="월" name="month" id="month" class="sel" onblur="checkBirth()">
														<option value="">월</option>
										  	 			<option value="1">1</option>
										  	 			<option value="2">2</option>
										  	 			<option value="3">3</option>
										  	 			<option value="4">4</option>
										  	 			<option value="5">5</option>
										  	 			<option value="6">6</option>
										  	 			<option value="7">7</option>
										  	 			<option value="8">8</option>
										  	 			<option value="9">9</option>
										  	 			<option value="10">10</option>
										  	 			<option value="11">11</option>
										  	 			<option value="12">12</option>
										</select>
									</span>
								</div>
								<div class="bir_dd">
									<span class="ps_box">
										<input type="text" name="day" id="day" maxlength="2" placeholder="일" class="int" onblur="checkBirth()"/>
									</span>
								</div>
							</div>
							<div align="left"><span class="error" name="birth_result" id="birth_result"></span></div>
						</div>
						
						<div class="join_row join_email">
							<span class="ps_box int_email">
								<input type="email" name="email" id="email" maxlength="100" placeholder="이메일" class="int" onblur="check('email')"/>
							</span>
							<div align="left"><span class="error" name="email_result" id="email_result"></span></div>
						</div>
					</div>
					
					<div class="row_group" style="display:block">
						<div class="join_row join_mobile">
							<span class="ps_box country_code">
								<span class="sel_value">+82</span>
							</span>
							<span class="ps_box int_mobile"> 
								<input type="text" name="phone" id="phone" maxlength="11" placeholder="휴대전화번호" class="int" onblur="check('phone')">
							</span>
							<div align="left"><span class="error" name="phone_result" id="phone_result"></span></div>
							<a href="javascript:checkPhone()" class="btn_c btn_mobile_submit">인증</a>
						</div>
						
						<div id="authnoDiv" class="join_row join_mobile_certify">
							<span class="ps_box int_mobile_certify"> 
								<input type="text" name="key" id="key" maxlength="6" placeholder="인증번호" class="int" onblur="check('key')">								
							</span>
							<div align="left"><span class="error" name="key_result" id="key_result"></span></div>
							<a href="javascript:checkKey()" class="btn_c btn_mobile_submit">확인</a>
						</div>
					</div>					
				</div>
				<a href="javascript:register_ok()" class="button button-blue register"><span>가입하기</span></a>
			</div>
			</form>
			
		</div>
		<!-- END of templatemo_main -->
	</div>
	<!-- END of templatemo_wrapper -->
	
	<!-- footer -->
	<%@include file="./include/footer.jsp" %>
	
	<!-- script -->
	<script src="<%=commonURL%>/jsp/js/member.js" type="text/javascript"></script>
</body>
</html>