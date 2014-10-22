<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="common.jsp" %>

	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>Hoseo Community</title>
	<meta name="keywords" content="" />
	<meta name="description" content="" />	
	<link rel="stylesheet" href="<%=commonURL%>/jsp/css/templatemo_style.css" type="text/css" />
		
	<link rel="stylesheet" href="<%=commonURL%>/jsp/css/orman.css" type="text/css"	media="screen" />
	<link rel="stylesheet" href="<%=commonURL%>/jsp/css/nivo-slider.css" type="text/css" media="screen" />
	
	<link rel="stylesheet" href="<%=commonURL%>/jsp/css/ddsmoothmenu.css" type="text/css"/>
	<link rel="stylesheet" href="<%=commonURL%>/jsp/css/button.css" type="text/css"/>
		
	<script type="text/javascript" src="<%=commonURL%>/jsp/js/jquery.min.js"></script>
	<script type="text/javascript" src="<%=commonURL%>/jsp/js/ddsmoothmenu.js"></script>
	
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
	
	<link rel="stylesheet" href="<%=commonURL%>/jsp/css/slimbox2.css" type="text/css" media="screen" />
	
	<script type="text/JavaScript" src="<%=commonURL%>/jsp/js/slimbox2.js"></script>
	<script type="text/JavaScript" src="<%=commonURL%>/jsp/js/member.js"></script>