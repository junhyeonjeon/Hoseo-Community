/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.55
 * Generated at: 2014-11-27 08:46:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.src.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hoseo.util.StringUtil;

public final class cancellation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/src/jsp/member/../../include/footer.jsp", Long.valueOf(1417067248000L));
    _jspx_dependants.put("/src/jsp/member/../../include/header.jsp", Long.valueOf(1417075902000L));
    _jspx_dependants.put("/src/jsp/member/../../include/common.jsp", Long.valueOf(1417067248000L));
    _jspx_dependants.put("/src/jsp/member/../../include/head.jsp", Long.valueOf(1417067248000L));
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
      out.write('\n');
      out.write('\n');

	if (session.getAttribute("userid") == null) {
		
	

      out.write("\n");
      out.write("\n");
      out.write(" <script>location.href = \"/hoseo/index.do\"; </script>\n");

	}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".content_header {\n");
      out.write("\tmargin-bottom: 8px;\n");
      out.write("\tborder-bottom: 2px solid #e5e5e5;\n");
      out.write("\t*zoom: 1\n");
      out.write("}\n");
      out.write("\n");
      out.write(".h_dropout {\n");
      out.write("\tmargin-top: 30px !important;\n");
      out.write("\tmargin-bottom: 0 !important;\n");
      out.write("\tpadding-left: 13px;\n");
      out.write("\tbackground: url(https://static.nid.naver.com/images/web/user/sp_ico.png)\n");
      out.write("\t\tno-repeat 0 3px;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\tcolor: #333\n");
      out.write("}\n");
      out.write("\n");
      out.write(".h_dropout em {\n");
      out.write("\tfont-family: tahoma;\n");
      out.write("\tcolor: #390\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropout_dsc {\n");
      out.write("\tpadding: 5px 0 0 13px;\n");
      out.write("\tfont-size: 12px;\n");
      out.write("\tcolor: #666;\n");
      out.write("\tline-height: 18px\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropout_dsc em {\n");
      out.write("\tcolor: #FF6000\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
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
      out.write("\t\t<div>\n");
      out.write("\n");
      out.write("\t\t\t<a href=\"");
      out.print(commonURL);
      out.write("/message/message_receive.do\">");
      out.print(username);
      out.write("&nbsp;님\n");
      out.write("\t\t\t\t&nbsp; My Page</a>&nbsp;&nbsp;&nbsp; <a\n");
      out.write("\t\t\t\thref=\"");
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
      out.write("\t\t<form name=\"dis_agree\" method=\"post\">\n");
      out.write("\t\t\t<div id=\"templatemo_main\">\n");
      out.write("\t\t\t\t<div class=\"content_header\">\n");
      out.write("\t\t\t\t\t<h2>\n");
      out.write("\t\t\t\t\t\t<img\n");
      out.write("\t\t\t\t\t\t\tsrc=\"https://static.nid.naver.com/images/user/images/help/h2_getout.gif\"\n");
      out.write("\t\t\t\t\t\t\twidth=\"53\" height=\"16\" alt=\"탈퇴안내\">\n");
      out.write("\t\t\t\t\t</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"userid\" value=\"");
      out.print(userid);
      out.write("\"></input>\n");
      out.write("\t\t\t\t<p class=\"content_summary\">회원탈퇴를 신청하기 전에 안내 사항을 꼭 확인해주세요.</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t<h3 class=\"h_dropout\">사용하고 계신 아이디(name)는 탈퇴할 경우 재사용 및 복구가\n");
      out.write("\t\t\t\t\t불가능합니다.</h3>\n");
      out.write("\t\t\t\t<p class=\"dropout_dsc\">\n");
      out.write("\t\t\t\t\t<em>탈퇴한 아이디는 본인과 타인 모두 재사용 및 복구가 불가</em> 하오니 신중하게 선택하시기 바랍니다.\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t<h3 class=\"h_dropout\">탈퇴 후 회원정보 및 개인형 서비스 이용기록은 모두 삭제됩니다.</h3>\n");
      out.write("\t\t\t\t<p class=\"dropout_dsc\">\n");
      out.write("\t\t\t\t\t회원정보 및 메일, 블로그, 주소록 등 개인형 서비스 이용기록은 모두 삭제되며, 삭제된 데이터는 복구되지 않습니다.<br>삭제되는\n");
      out.write("\t\t\t\t\t\t내용을 확인하시고 필요한 데이터는 미리 백업을 해주세요. \n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t\t<!-- \n");
      out.write("\t\t\tname은 배열이 가능\n");
      out.write("\t\t\tid는 유일해야 한다. -->\n");
      out.write("\n");
      out.write("\t\t\t\t<div align=\"center\">\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"chk1\" id=\"chk1\" value=\"1\" /><label\n");
      out.write("\t\t\t\t\t\tfor=\"chk1\">회원탈퇴 약관을 읽었으며 내용에 동의합니다.</label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"clear h20\"></div>\n");
      out.write("\t\t\t<div align=\"center\">\n");
      out.write("\t\t\t\t<a href=\"javascript:dis_agree()\" class=\"button button-blue\"><span>탈퇴하기</span></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</form>\n");
      out.write("\t<!-- END of templatemo_main -->\n");
      out.write("\n");
      out.write("\t<!-- END of templatemo_wrapper -->\n");
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
      out.write("\t\n");
      out.write("\t<script>\n");
      out.write("\t\n");
      out.write("\tfunction dis_agree() {\n");
      out.write("\t\tvar frm = document.dis_agree;\n");
      out.write("\t\t/* 체크 여부 확인 */\n");
      out.write("\t\tif (!frm.chk1.checked) {\n");
      out.write("\t\t\talert(\"동의 후 탈퇴 가능합니다.\");\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t}\n");
      out.write("\t\talert(\"그동안 이용해 주셔서 감사합니다.\");\n");
      out.write("\t\t\n");
      out.write("\t\tfrm.action = \"./dis_agree_ok.do\";\n");
      out.write("\t\tfrm.submit();\n");
      out.write("\t}\n");
      out.write("\t</script>\n");
      out.write("\t\n");
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
