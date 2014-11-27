<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<!-- 헤더파일 include -->
<%@include file="../../include/head.jsp" %>
</head>

<body>
	<div id="templatemo_wrapper">
	
		<!-- 상단 네비바 -->
		<%@include file="../../include/header.jsp" %>

		<form name="agree" method="post">
		<div id="templatemo_main">
			<div>
				<h5><small>회원가입약관</small></h5>
				<%@include file="rules_1.jsp" %>
				
				<div align="center">
					<input type="checkbox" name="chk1" id="chk1" value="1" /><label for="chk1">회원가입 약관을 읽었으며 내용에 동의합니다.</label>
				</div>
			</div>
			<div class="clear h40"></div>
			<div>
				<h5><small>개인정보보호정책</small></h5>
				<%@include file="rules_2.jsp" %>
				
				<div align="center">
					<input type="checkbox" name="chk2" id="chk2" value="1"/><label for="chk2">개인정보보호정책을 읽었으며 내용에 동의합니다.</label>
				</div>
			</div>
			<div class="clear h20"></div>
			<div align="center">
				<input type="button" class="thoughtbot" value="동의 후 계속진행" onclick="agreebtn()"/>
			</div>
		</div>
		</form>
		<!-- END of templatemo_main -->
	</div>
	<!-- END of templatemo_wrapper -->
	
	<div class="clear h40"></div>
	<div class="clear h40"></div>
	
	<!-- footer -->
	<%@include file="../../include/footer.jsp" %>
	<script>
	//약관 동의 체크
	function agreebtn() {
		var frm = document.agree;
		frm.action = "./register_form.do";

		/* 체크 여부 확인 */
		if (!frm.chk1.checked || !frm.chk2.checked) {
			alert("약관동의 후 가입 가능합니다.");
			return;
		}

		frm.submit();
	}
	</script>
</body>
</html>