/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.56
 * Generated at: 2014-11-27 06:06:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.src.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hoseo.util.StringUtil;

public final class register_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/src/jsp/member/../../include/common.jsp", Long.valueOf(1417067247405L));
    _jspx_dependants.put("/src/jsp/member/../../include/header.jsp", Long.valueOf(1417067247436L));
    _jspx_dependants.put("/src/jsp/member/../../include/head.jsp", Long.valueOf(1417067247425L));
    _jspx_dependants.put("/src/jsp/member/../../include/footer.jsp", Long.valueOf(1417067247415L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');

	//상대경로 대용
	String commonURL="/hoseo";

      out.write("\n");
      out.write("\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t<title>Hoseo Community</title>\n");
      out.write("\t\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(commonURL);
      out.write("/src/css/templatemo_style.css\" type=\"text/css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(commonURL);
      out.write("/src/css/top_navi.css\" type=\"text/css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(commonURL);
      out.write("/src/css/button.css\" type=\"text/css\"/>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(commonURL);
      out.write("/src/css/img_expend.css\" type=\"text/css\" media=\"screen\"/>\n");
      out.write("\n");
      out.write("\t<!--<script src=\"http://code.jqeury.com/jqeury-latest.min.js\"></script> -->\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(commonURL);
      out.write("/src/js/naviSlider_imgModal.js\"></script>\t\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(commonURL);
      out.write("/src/js/top_navi_silder.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- 상단 메뉴 드롭다운 -->\n");
      out.write("\t<script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("\t\tddsmoothmenu.init({\n");
      out.write("\t\t\tmainmenuid: \"templatemo_menu\", //menu DIV id\n");
      out.write("\t\t\torientation: 'h', //Horizontal or vertical menu: Set to \"h\" or \"v\"\n");
      out.write("\t\t\tclassname: 'ddsmoothmenu', //class added to menu's outer DIV\n");
      out.write("\t\t\t//customtheme: [\"#1c5a80\", \"#18374a\"],\n");
      out.write("\t\t\tcontentsource: \"markup\" //\"markup\" or [\"container_id\", \"path_to_menu_file\"]\n");
      out.write("\t\t})\n");
      out.write("\n");
      out.write("\t\tfunction clearText(field)\n");
      out.write("\t\t{\n");
      out.write("    \t\tif (field.defaultValue == field.value) \n");
      out.write("    \t\t\tfield.value = '';\n");
      out.write("    \t\telse if (field.value == '') \n");
      out.write("    \t\t\tfield.value = field.defaultValue;\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("\t\n");
      out.write("\t<script type=\"text/JavaScript\" src=\"");
      out.print(commonURL);
      out.write("/src/js/img_modal.js\"></script>");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(commonURL);
      out.write("/src/css/join.css\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(commonURL);
      out.write("/src/css/login.css\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<div id=\"templatemo_wrapper\">\n");
      out.write("\t\n");
      out.write("\t\t<!-- header -->\n");
      out.write("\t\t");
      out.write('\n');
      out.write('\n');
      out.write('\n');

	String userid = StringUtil.convNull((String) session.getAttribute("userid"), "");
	String username = StringUtil.convNull((String) session.getAttribute("username"), "");
	String layout = StringUtil.convNull((String)request.getAttribute("layout"), "index");
	
	System.out.println("Session_userid : " + userid);
	System.out.println("Session_username : " + username);
	System.out.println(layout);	

      out.write("\n");
      out.write("<!-- Start_header -->\n");
      out.write("\t\t<div id=\"templatemo_header\">\n");
      out.write("\t\t\t<div id=\"site_title\">\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(commonURL);
      out.write("/src/images/add/intro_tex02.jpg\" alt=\"Venture1st_호서대학교\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div align=\"right\" style=\"color:orange;\">이 웹페이지는 <a href=\"https://www.google.com/intl/ko/chrome/browser/features.html\">Chrome</a> 브라우저에 최적화 되어 있습니다</div>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<div id=\"templatemo_search\">\n");
      out.write("\t\t\t\t<form action=\"search.do\" method=\"get\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" value=\"Search...\" name=\"keyword\" id=\"keyword\" title=\"keyword\" onfocus=\"clearText(this)\" onblur=\"clearText(this)\"\tclass=\"txt_field\" /> \n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"Search\" value=\"\" alt=\"Search\" id=\"searchbutton\" title=\"Search\" class=\"sub_btn\" />\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- End_header -->\n");
      out.write("\t\t\n");
      out.write("\t\t");

			
		
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Start Menu -->\n");
      out.write("\t\t<div id=\"templatemo_menu\" class=\"ddsmoothmenu\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/index.do\" ");
if(layout.equals("index")){ 
      out.write("class=\"selected\"");
} 
      out.write(">Home</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/market/list.do?kind=trade&pg=1&block=1\" ");
if(layout.equals("market")){ 
      out.write("class=\"selected\"");
} 
      out.write(">Market Place</a>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a rel=\"nofollow\" href=\"");
      out.print(commonURL);
      out.write("/market/list.do?kind=trade&pg=1&block=1\">중고 거래</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a rel=\"nofollow\" href=\"");
      out.print(commonURL);
      out.write("/market/list.do?kind=ad&pg=1&block=1\">원룸 광고</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a rel=\"nofollow\" href=\"");
      out.print(commonURL);
      out.write("/market/list.do?kind=report&pg=1&block=1\">사건/사고 신고</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/board/list.do?kind=free&pg=1&block=1\" ");
if(layout.equals("board")){ 
      out.write("class=\"selected\"");
} 
      out.write(">Board</a>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a rel=\"nofollow\" href=\"");
      out.print(commonURL);
      out.write("/board/list.do?kind=free&pg=1&block=1\">자유게시판</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a rel=\"nofollow\" href=\"");
      out.print(commonURL);
      out.write("/board/list.do?kind=none&pg=1&block=1\">익명게시판</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a rel=\"nofollow\" href=\"");
      out.print(commonURL);
      out.write("/board/list.do?kind=missing&pg=1&block=1\">분실/습득물</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/gallery/list.do?pg=1&block=1\" ");
if(layout.equals("gallery")){ 
      out.write("class=\"selected\"");
} 
      out.write(">Gallery</a></li>\n");
      out.write("\t\t\t\t<!-- <li><a href=\"blog.jsp\">Blog</a></li> -->\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/contact.do\" ");
if(layout.equals("contact")){ 
      out.write("class=\"selected\"");
} 
      out.write(">Contact</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t");
 if(!userid.equals("")){ 
      out.write("\n");
      out.write("\t\t\t<div align=\"right\">\n");
      out.write("\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(commonURL);
      out.write("/message/message_receive.do\">");
      out.print(username);
      out.write("&nbsp;님 &nbsp; 새쪽지 0</a>&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(commonURL);
      out.write("/member/logout.do\" class=\"button button-blue\"><span>로그아웃</span></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t");
 } else { 
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t<div align=\"right\">\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(commonURL);
      out.write("/member/login.do\" class=\"button button-blue\"><span>로그인</span></a>\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(commonURL);
      out.write("/member/register.do\" class=\"button button-blue\"><span>회원가입</span></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t");
} 
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<br style=\"clear: left\" />\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- End Menu -->");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div id=\"templatemo_main\">\n");
      out.write("\t\t\t<form name=\"join\" method=\"post\" class=\"form-horizontal\">\n");
      out.write("\t\t\t<div align=\"center\" class=\"login_form\">\n");
      out.write("\t\t\t    <div class=\"login_here\">\n");
      out.write("\t\t\t    \t<img src=\"");
      out.print(commonURL);
      out.write("/src/images/add/intro_tex03.png\" alt=\"호서대학교\"></img>\n");
      out.write("\t\t\t    </div>\n");
      out.write("\t\t\t    <div style=\"width: 400px;\">\n");
      out.write("\t\t\t    \t<div class=\"row_group\">\n");
      out.write("\t\t\t\t\t\t<div id=\"idDiv\" class=\"join_row\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"ps_box int_id\">\n");
      out.write("\t\t\t\t\t\t\t\t<!-- userid -->\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"userid\" id=\"userid\" maxlength=\"20\" placeholder=\"아이디\" class=\"int input_id\" onblur=\"check('userid')\"/>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t<div align=\"left\"><span class=\"error\" name=\"userid_result\" id=\"userid_result\"></span></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"join_row\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"ps_box int_pass\">\n");
      out.write("\t\t\t\t\t\t\t\t<!-- password1 -->\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" name=\"pw1\" id=\"pw1\" maxlength=\"20\" placeholder=\"비밀번호\" class=\"int input_pw\" onblur=\"check('pw1')\"/>\n");
      out.write("\t\t\t\t\t\t\t</span>\t\n");
      out.write("\t\t\t\t\t\t\t<div align=\"left\"><span class=\"error\" name=\"pw1_result\" id=\"pw1_result\"></span></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"join_row\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"ps_box int_pass\">\n");
      out.write("\t\t\t\t\t\t\t\t<!-- password2 -->\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" name=\"pw2\" id=\"pw2\" maxlength=\"16\" placeholder=\"비밀번호 재입력\" class=\"int input_pw\" onblur=\"check('pw2')\"/>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t<div align=\"left\"><span class=\"error\" name=\"pw2_result\" id=\"pw2_result\"></span></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"row_group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"join_row\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"ps_box\">\n");
      out.write("\t\t\t\t\t\t\t\t<!-- username -->\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"username\" id=\"username\" maxlength=\"10\" placeholder=\"닉네임\" class=\"int\" onblur=\"check('username')\"/>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t<div align=\"left\"><span class=\"error\" name=\"username_result\" id=\"username_result\"></span></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"join_row join_birthday\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"join_birth\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bir_yy\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"ps_box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- birth_year -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"year\" id=\"year\" maxlength=\"4\" placeholder=\"생년\" class=\"int\" onblur=\"checkBirth()\"/> \n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bir_mm\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"ps_box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- birth_month -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<select title=\"월\" name=\"month\" id=\"month\" class=\"sel\" onblur=\"checkBirth()\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">월</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  \t \t\t\t<option value=\"01\">1</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  \t \t\t\t<option value=\"02\">2</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  \t \t\t\t<option value=\"03\">3</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  \t \t\t\t<option value=\"04\">4</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  \t \t\t\t<option value=\"05\">5</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  \t \t\t\t<option value=\"06\">6</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  \t \t\t\t<option value=\"07\">7</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  \t \t\t\t<option value=\"08\">8</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  \t \t\t\t<option value=\"09\">9</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  \t \t\t\t<option value=\"10\">10</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  \t \t\t\t<option value=\"11\">11</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t  \t \t\t\t<option value=\"12\">12</option>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"bir_dd\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"ps_box\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- birth_day -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"day\" id=\"day\" maxlength=\"2\" placeholder=\"일\" class=\"int\" onblur=\"checkBirth()\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div align=\"left\"><span class=\"error\" name=\"birth_result\" id=\"birth_result\"></span></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"join_row join_email\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"ps_box int_email\">\n");
      out.write("\t\t\t\t\t\t\t\t<!-- email -->\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"email\" name=\"email\" id=\"email\" maxlength=\"100\" placeholder=\"이메일 ( ID / PW 찾기 시 사용됩니다. )\" class=\"int\" onblur=\"check('email')\"/>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t<div align=\"left\"><span class=\"error\" name=\"email_result\" id=\"email_result\"></span></div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"row_group\" style=\"display:block\">\n");
      out.write("\t\t\t\t\t\t<div class=\"join_row join_mobile\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"ps_box country_code\">\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sel_value\">+82</span>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"ps_box int_mobile\"> \n");
      out.write("\t\t\t\t\t\t\t\t<!-- phone -->\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"phone\" id=\"phone\" maxlength=\"11\" placeholder=\"휴대전화번호\" class=\"int\" onblur=\"check('phone')\"/>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t<div align=\"left\"><span class=\"error\" name=\"phone_result\" id=\"phone_result\"></span></div>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:checkPhone()\" class=\"btn_c btn_mobile_submit\">인증</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div id=\"authnoDiv\" class=\"join_row join_mobile_certify\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"ps_box int_mobile_certify\"> \n");
      out.write("\t\t\t\t\t\t\t\t<!-- phone_key -->\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"key\" id=\"key\" maxlength=\"6\" placeholder=\"인증번호\" class=\"int\" onblur=\"check('key')\"/>\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t<div align=\"left\"><span class=\"error\" name=\"key_result\" id=\"key_result\"></span></div>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:checkKey()\" class=\"btn_c btn_mobile_submit\">확인</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<input type=\"button\" class=\"thoughtbot\" value=\"가입하기\" onclick=\"register_ok()\"/>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"clear h20\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- END of templatemo_main -->\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END of templatemo_wrapper -->\n");
      out.write("\t<div class=\"clear h40\"></div>\n");
      out.write("\t<!-- footer -->\n");
      out.write("\t");
      out.write("\n");
      out.write("<div id=\"templatemo_footer_wrapper\">\n");
      out.write("\t<div id=\"templatemo_footer\">\n");
      out.write("\t\t<p>\n");
      out.write("\t\t\tCopyright © 2014 All rights reserved by <a href=\"mailto:\"></a>.<br /> 이\n");
      out.write("\t\t\t웹페이지는 <a href=\"https://www.google.com/intl/ko/chrome/browser/features.html\">Chrome</a>\n");
      out.write("\t\t\t브라우저에 최적화 되어 있습니다.<br/>\n");
      out.write("\t\t</p>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END of templatemo_footer -->\n");
      out.write("</div>\n");
      out.write("<!-- END of templatemo_footer_wrapper -->");
      out.write("\n");
      out.write("\t<script type=\"text/JavaScript\" src=\"");
      out.print(commonURL);
      out.write("/src/js/member.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
