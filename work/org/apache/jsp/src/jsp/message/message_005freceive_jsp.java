/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.55
 * Generated at: 2014-11-30 13:02:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.src.jsp.message;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hoseo.message.*;
import java.util.*;
import com.hoseo.page.Pager;
import com.hoseo.util.StringUtil;

public final class message_005freceive_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/src/jsp/message/../../include/checkLogin_MvIndex.jsp", Long.valueOf(1417351615973L));
    _jspx_dependants.put("/src/jsp/message/../../include/footer.jsp", Long.valueOf(1417067248000L));
    _jspx_dependants.put("/src/jsp/message/../../include/header.jsp", Long.valueOf(1417078158611L));
    _jspx_dependants.put("/src/jsp/message/../../include/head.jsp", Long.valueOf(1417067248000L));
    _jspx_dependants.put("/src/jsp/message/./message_side.jsp", Long.valueOf(1417352539193L));
    _jspx_dependants.put("/src/jsp/message/../../include/common.jsp", Long.valueOf(1417067248000L));
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

	if (session.getAttribute("userid") == null) {

      out.write("\n");
      out.write("<script>\n");
      out.write("\talert(\"로그인 후 이용하실 수 있습니다.\");\n");
      out.write("\tlocation.replace(\"/hoseo/index.do\");\n");
      out.write("</script>\n");

	return;
	}

      out.write('\n');
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
      out.write("/src/css/board_slider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(commonURL);
      out.write("/src/css/board_write.css\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("#leftview {\n");
      out.write("\tbackground: #EAEAEA;\n");
      out.write("\twidth: 200px;\n");
      out.write("\tfloat: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#rightview {\n");
      out.write("\twidth: 720px;\n");
      out.write("\tfloat: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table {\n");
      out.write("\ttable-layout: fixed\n");
      out.write("}\n");
      out.write("\n");
      out.write("table td {\n");
      out.write("\toverflow: hidden;\n");
      out.write("\ttext-overflow: ellipsis;\n");
      out.write("\twhite-space: nowrap;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div id=\"templatemo_wrapper\">\n");
      out.write("\n");
      out.write("\t\t<!-- header -->\n");
      out.write("\t\t");
      out.write('\n');
      out.write('\n');
      out.write('\n');

	String userid = StringUtil.convNull(
			(String) session.getAttribute("userid"), "");
	String username = StringUtil.convNull(
			(String) session.getAttribute("username"), "");
	String layout = StringUtil.convNull(
			(String) request.getAttribute("layout"), "index");

	System.out.println("Session_userid : " + userid);
	System.out.println("Session_username : " + username);
	System.out.println(layout);
	
	
	

      out.write("\n");
      out.write("<!-- Start_header -->\n");
      out.write("<div id=\"templatemo_header\">\n");
      out.write("\t<div id=\"site_title\">\n");
      out.write("\t\t<img src=\"");
      out.print(commonURL);
      out.write("/src/images/add/intro_tex02.jpg\"\n");
      out.write("\t\t\talt=\"Venture1st_호서대학교\" />\n");
      out.write("\t</div>\n");
      out.write("\t<div align=\"right\" style=\"color: orange;\">\n");
      out.write("\t\t이 웹페이지는 <a\n");
      out.write("\t\t\thref=\"https://www.google.com/intl/ko/chrome/browser/features.html\">Chrome</a>\n");
      out.write("\t\t브라우저에 최적화 되어 있습니다\n");
      out.write("\t</div>\n");
      out.write("\t</a>\n");
      out.write("\t<div id=\"templatemo_search\">\n");
      out.write("\t\t<form action=\"search.do\" method=\"get\">\n");
      out.write("\t\t\t<input type=\"text\" value=\"Search...\" name=\"keyword\" id=\"keyword\"\n");
      out.write("\t\t\t\ttitle=\"keyword\" onfocus=\"clearText(this)\" onblur=\"clearText(this)\"\n");
      out.write("\t\t\t\tclass=\"txt_field\" /> <input type=\"submit\" name=\"Search\" value=\"\"\n");
      out.write("\t\t\t\talt=\"Search\" id=\"searchbutton\" title=\"Search\" class=\"sub_btn\" />\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- End_header -->\n");
      out.write("\n");

	

      out.write("\n");
      out.write("\n");
      out.write("<!-- Start Menu -->\n");
      out.write("<div id=\"templatemo_menu\" class=\"ddsmoothmenu\">\n");
      out.write("\t<ul>\n");
      out.write("\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/index.do\"\n");
      out.write("\t\t\t");
if (layout.equals("index")) {
      out.write(" class=\"selected\" ");
}
      out.write(">Home</a></li>\n");
      out.write("\t\t<li><a\n");
      out.write("\t\t\thref=\"");
      out.print(commonURL);
      out.write("/market/list.do?kind=trade&pg=1&block=1\"\n");
      out.write("\t\t\t");
if (layout.equals("market")) {
      out.write(" class=\"selected\" ");
}
      out.write(">Market\n");
      out.write("\t\t\t\tPlace</a>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a rel=\"nofollow\"\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(commonURL);
      out.write("/market/list.do?kind=trade&pg=1&block=1\">중고\n");
      out.write("\t\t\t\t\t\t거래</a></li>\n");
      out.write("\t\t\t\t<li><a rel=\"nofollow\"\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(commonURL);
      out.write("/market/list.do?kind=ad&pg=1&block=1\">원룸 광고</a></li>\n");
      out.write("\t\t\t\t<li><a rel=\"nofollow\"\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(commonURL);
      out.write("/market/list.do?kind=report&pg=1&block=1\">사건/사고\n");
      out.write("\t\t\t\t\t\t신고</a></li>\n");
      out.write("\t\t\t</ul></li>\n");
      out.write("\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/board/list.do?kind=free&pg=1&block=1\"\n");
      out.write("\t\t\t");
if (layout.equals("board")) {
      out.write(" class=\"selected\" ");
}
      out.write(">Board</a>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a rel=\"nofollow\"\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(commonURL);
      out.write("/board/list.do?kind=free&pg=1&block=1\">자유게시판</a></li>\n");
      out.write("\t\t\t\t<li><a rel=\"nofollow\"\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(commonURL);
      out.write("/board/list.do?kind=none&pg=1&block=1\">익명게시판</a></li>\n");
      out.write("\t\t\t\t<li><a rel=\"nofollow\"\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(commonURL);
      out.write("/board/list.do?kind=missing&pg=1&block=1\">분실/습득물</a></li>\n");
      out.write("\t\t\t</ul></li>\n");
      out.write("\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/gallery/list.do?pg=1&block=1\"\n");
      out.write("\t\t\t");
if (layout.equals("gallery")) {
      out.write(" class=\"selected\" ");
}
      out.write(">Gallery</a></li>\n");
      out.write("\t\t<!-- <li><a href=\"blog.jsp\">Blog</a></li> -->\n");
      out.write("\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/contact.do\"\n");
      out.write("\t\t\t");
if (layout.equals("contact")) {
      out.write(" class=\"selected\" ");
}
      out.write(">Contact</a></li>\n");
      out.write("\t</ul>\n");
      out.write("\n");
      out.write("\t");

		if (!userid.equals("")) {
	
      out.write("\n");
      out.write("\t<div align=\"right\">\n");
      out.write("\t\t<div style=\"color: #fff\">\n");
      out.write("\t\t\t");
      out.print(username);
      out.write("&nbsp;님&nbsp;\n");
      out.write("\t\t\t<a href=\"");
      out.print(commonURL);
      out.write("/message/message_receive.do\">마이페이지</a>&nbsp;&nbsp;&nbsp; \n");
      out.write("\t\t\t<a href=\"");
      out.print(commonURL);
      out.write("/member/logout.do\" class=\"button button-blue\"><span>로그아웃</span></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t");

		} else {
	
      out.write("\n");
      out.write("\t<div align=\"right\">\n");
      out.write("\t\t<a href=\"");
      out.print(commonURL);
      out.write("/member/login.do\" class=\"button button-blue\"><span>로그인</span></a>\n");
      out.write("\t\t<a href=\"");
      out.print(commonURL);
      out.write("/member/register.do\" class=\"button button-blue\"><span>회원가입</span></a>\n");
      out.write("\t</div>\n");
      out.write("\t");

		}
	
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<br style=\"clear: left\" />\n");
      out.write("</div>\n");
      out.write("<!-- End Menu -->");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div id=\"templatemo_main\">\n");
      out.write("\n");
      out.write("\t\t\t<br></br>\n");
      out.write("\t\t\t<div\n");
      out.write("\t\t\t\tstyle=\"width: 100%; height: 50px; font-family: 돋음체; font-size: 70px;\">\n");
      out.write("\t\t\t\t<img\n");
      out.write("\t\t\t\t\tsrc=\"http://www.topsecretglasgow.com/image-files/ts_my_page_500_v1.png\"></img>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<br></br> <br></br> <br></br>\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form name=\"join\" method=\"post\"\r\n");
      out.write("\taction=\"");
      out.print(commonURL);
      out.write("/member/correction.do\">\r\n");
      out.write("\t<!-- 왼쪽메뉴 : 시작 -->\r\n");
      out.write("\t<div id=\"leftview\" align=\"center\">\r\n");
      out.write("\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"userid\" value=\"");
      out.print(userid);
      out.write("\" /> <br />\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.print(username);
      out.write('(');
      out.print(userid);
      out.write(")님<br/> 안녕하세요. </br> </br>\r\n");
      out.write("\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/message/message_receive.do\"\tclass=\"button button-blue\" style=\"width: 150px; height: 50px;\"> <span style=\"padding-top: 17px;\">받은쪽지함</span></a></li>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/message/message_send.do\" class=\"button button-blue\" style=\"width: 150px; height: 50px\"> <span style=\"padding-top: 17px;\">보낸쪽지함</span></a></li>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/message/message_form.do\" class=\"button button-blue\" style=\"width: 150px; height: 50px\"> <span style=\"padding-top: 17px;\">쪽\t지 쓰 기</span></a></li>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li><a href=\"javascript:document.join.submit()\" class=\"button button-blue\" style=\"width: 150px; height: 50px\"> <span style=\"padding-top: 17px;\">정보\t수정</span></a></li>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li><a href=\"javascript:cancellation() \" class=\"button button-blue\" style=\"width: 150px; height: 50px\"> <span style=\"padding-top: 17px;\">회원 탈퇴</span></a></li>\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t</div>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("\t\t\t<!-- 왼쪽메뉴 : 끝 -->\n");
      out.write("\n");
      out.write("\t\t\t<!-- 오른쪽 내용 : 시작 -->\n");
      out.write("\t\t\t<div id=\"rightview\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"board_title\">\n");
      out.write("\t\t\t\t\t<h3 style=\"text-align: center;\">받은 쪽지함</h3>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div style=\"margin-bottom: 30px;\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- 리스트 : 시작 -->\n");
      out.write("\t\t\t\t<div\n");
      out.write("\t\t\t\t\tstyle=\"display: block; overflow: hidden; width: 500; white-space: nowrap; text-overflow: ellipsis;\">\n");
      out.write("\t\t\t\t\t<table class=\"table_board\" cellpadding=\"0\" cellspacing=\"0\"\n");
      out.write("\t\t\t\t\t\tborder=\"0\">\n");
      out.write("\t\t\t\t\t\t<colgroup>\n");
      out.write("\t\t\t\t\t\t\t<col width=\"120\" />\n");
      out.write("\t\t\t\t\t\t\t<col width=\"150\" />\n");
      out.write("\t\t\t\t\t\t\t<col width=\"*\" />\n");
      out.write("\t\t\t\t\t\t\t<col width=\"150\" />\n");
      out.write("\t\t\t\t\t\t</colgroup>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t<tr class=\"tr_board\">\n");
      out.write("\t\t\t\t\t\t\t\t<td>보낸사람</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>제목</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>내용</td>\n");
      out.write("\t\t\t\t\t\t\t\t<td>날짜</td>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t</thead>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t");

								List list = (List) request.getAttribute("list");

								int result = list.size();
								for (int i = 0; i < list.size(); i++) {
									MessageDto dto = (MessageDto) list.get(i);
							
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\">");
      out.print(dto.getSendid());
      out.write("</a></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"left\"><a href=\"#\">");
      out.print(dto.getSubject());
      out.write("</a></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"left\"><a href=\"#\">");
      out.print(dto.getContents());
      out.write(" </a></td>\n");
      out.write("\t\t\t\t\t\t\t\t<td align=\"center\">");
      out.print(dto.getSdate());
      out.write("</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t");

								}
							
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t</tbody>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<form name=\"frm1\" method=\"post\" >\n");
      out.write("\t\t\t\t\t<input type='hidden' name='reuslt' value=\"");
      out.print(result);
      out.write("\" />\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

					if (list.size() == 0) {
				
      out.write("\n");
      out.write("\t\t\t\t<div style=\"text-align: center; margin: 50px;\">수신된 쪽지가 없습니다.</div>\n");
      out.write("\t\t\t\t");

					}
				
      out.write("\n");
      out.write("\t\t\t\t<!-- 리스트 : 끝 -->\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<!-- 오른쪽 내용 : 끝 -->\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"clear h40\"></div>\n");
      out.write("\t\t\t<div class=\"clear h40\"></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- END of templatemo_main -->\n");
      out.write("\t</div>\n");
      out.write("\t<!-- END of templatemo_wrapper -->\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\t<script src=\"");
      out.print(commonURL);
      out.write("/src/js/cancellation.js\"></script>\n");
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
