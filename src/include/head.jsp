<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="common.jsp" %>

	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>Hoseo Community</title>
	
	<link rel="stylesheet" href="<%=commonURL%>/src/css/templatemo_style.css" type="text/css"/>
	<link rel="stylesheet" href="<%=commonURL%>/src/css/top_navi.css" type="text/css"/>
	<link rel="stylesheet" href="<%=commonURL%>/src/css/button.css" type="text/css"/>
	<link rel="stylesheet" href="<%=commonURL%>/src/css/img_expend.css" type="text/css" media="screen"/>

	<!--<script src="http://code.jqeury.com/jqeury-latest.min.js"></script> -->
	<script type="text/javascript" src="<%=commonURL%>/src/js/naviSlider_imgModal.js"></script>	
	<script type="text/javascript" src="<%=commonURL%>/src/js/top_navi_silder.js"></script>
	
	<!-- 상단 메뉴 드롭다운 -->
	<script language="javascript" type="text/javascript">
		ddsmoothmenu.init({
			mainmenuid: "templatemo_menu", //menu DIV id
			orientation: 'h', //Horizontal or vertical menu: Set to "h" or "v"
			classname: 'ddsmoothmenu', //class added to menu's outer DIV
			//customtheme: ["#1c5a80", "#18374a"],
			contentsource: "markup" //"markup" or ["container_id", "path_to_menu_file"]
		})

		function clearText(field)
		{
    		if (field.defaultValue == field.value) 
    			field.value = '';
    		else if (field.value == '') 
    			field.value = field.defaultValue;
		}
	</script>
	
	<script type="text/JavaScript" src="<%=commonURL%>/src/js/img_modal.js"></script>