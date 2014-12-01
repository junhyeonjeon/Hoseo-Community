<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@include file="../../include/head.jsp"%>
<%@include file="../../include/checkLogin_MvIndex.jsp"%>

<style type="text/css">
<!--
.content_header {
	margin-bottom: 8px;
	border-bottom: 2px solid #e5e5e5;
	*zoom: 1
}

.h_dropout {
	margin-top: 30px !important;
	margin-bottom: 0 !important;
	padding-left: 13px;
	background: url(https://static.nid.naver.com/images/web/user/sp_ico.png)
		no-repeat 0 3px;
	font-size: 12px;
	color: #333
}

.h_dropout em {
	font-family: tahoma;
	color: #390
}

.dropout_dsc {
	padding: 5px 0 0 13px;
	font-size: 12px;
	color: #666;
	line-height: 18px
}

.dropout_dsc em {
	color: #FF6000
}
-->
</style>



</head>

<body>
	<div id="templatemo_wrapper">

		<!-- header -->
		<%@include file="../../include/header.jsp"%>

		<form name="dis_agree" method="post">
			<div id="templatemo_main">
				<div class="content_header">
					<h2>
						<img
							src="https://static.nid.naver.com/images/user/images/help/h2_getout.gif"
							width="53" height="16" alt="탈퇴안내">
					</h2>
				</div>
				<input type="hidden" name="userid" value="<%=userid%>"></input>
				<p class="content_summary">회원탈퇴를 신청하기 전에 안내 사항을 꼭 확인해주세요.</p>


				<h3 class="h_dropout">사용하고 계신 아이디(name)는 탈퇴할 경우 재사용 및 복구가
					불가능합니다.</h3>
				<p class="dropout_dsc">
					<em>탈퇴한 아이디는 본인과 타인 모두 재사용 및 복구가 불가</em> 하오니 신중하게 선택하시기 바랍니다.
				</p>

				<h3 class="h_dropout">탈퇴 후 회원정보 및 개인형 서비스 이용기록은 모두 삭제됩니다.</h3>
				<p class="dropout_dsc">
					회원정보 및 메일, 블로그, 주소록 등 개인형 서비스 이용기록은 모두 삭제되며, 삭제된 데이터는 복구되지 않습니다.<br>삭제되는
						내용을 확인하시고 필요한 데이터는 미리 백업을 해주세요. 
				</p>
				<!-- 
			name은 배열이 가능
			id는 유일해야 한다. -->

				<div align="center">
					<input type="checkbox" name="chk1" id="chk1" value="1" /><label
						for="chk1">회원탈퇴 약관을 읽었으며 내용에 동의합니다.</label>
				</div>
			</div>

			<div class="clear h20"></div>
			<div align="center">
				<a href="javascript:dis_agree()" class="button button-blue"><span>탈퇴하기</span></a>
			</div>
	</div>
	</form>
	<!-- END of templatemo_main -->

	<!-- END of templatemo_wrapper -->

	<!-- footer -->
	<%@include file="../../include/footer.jsp"%>
	
	<script>
	
	function dis_agree() {
		var frm = document.dis_agree;
		/* 체크 여부 확인 */
		if (!frm.chk1.checked) {
			alert("동의 후 탈퇴 가능합니다.");
			return;
		}
		alert("그동안 이용해 주셔서 감사합니다.");
		
		frm.action = "./dis_agree_ok.do";
		frm.submit();
	}
	</script>
	
</body>
</html>