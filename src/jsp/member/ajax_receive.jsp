<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.hoseo.member.*"%>

<%
	request.setCharacterEncoding("UTF-8");

	String type = request.getParameter("type");
	String value = request.getParameter("value");
	String sql = "select count(*) from member where ";

	if (type.equals("userid")) {
		sql += "userid='" + value + "'";
	} else if (type.equals("username")) {
		sql += "username='" + value + "'";
	}

	StringBuffer str = new StringBuffer();
	str.append("<?xml version='1.0' encoding='UTF-8'?>");
	str.append("<root>");

	if (value != null && !value.equals("")) {
		MemberDao dao = new MemberDao();

		if (dao.isExist(sql))
			str.append("false");
		else
			str.append("true");

	}
	str.append("<id>" + value + "</id>");
	str.append("</root>");

	response.setContentType("text/xml;charset=UTF-8");
	response.getWriter().write(str.toString());
%>