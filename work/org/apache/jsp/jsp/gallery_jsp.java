/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.55
 * Generated at: 2014-10-22 12:21:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.hoseo.gallery.*;

public final class gallery_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/jsp/./include/header.jsp", Long.valueOf(1413978435772L));
    _jspx_dependants.put("/jsp/./include/common.jsp", Long.valueOf(1413779009175L));
    _jspx_dependants.put("/jsp/./include/footer.jsp", Long.valueOf(1413967257663L));
    _jspx_dependants.put("/jsp/./include/head.jsp", Long.valueOf(1413979430495L));
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("\t");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");

	//상대경로 대용
	String commonURL="/hoseo";

      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<title>Hoseo Community</title>\r\n");
      out.write("\t<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("\t<meta name=\"description\" content=\"\" />\t\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(commonURL);
      out.write("/jsp/css/templatemo_style.css\" type=\"text/css\" />\r\n");
      out.write("\t\t\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(commonURL);
      out.write("/jsp/css/orman.css\" type=\"text/css\"\tmedia=\"screen\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(commonURL);
      out.write("/jsp/css/nivo-slider.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(commonURL);
      out.write("/jsp/css/ddsmoothmenu.css\" type=\"text/css\"/>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(commonURL);
      out.write("/jsp/css/button.css\" type=\"text/css\"/>\r\n");
      out.write("\t\t\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(commonURL);
      out.write("/jsp/js/jquery.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(commonURL);
      out.write("/jsp/js/ddsmoothmenu.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 상단 메뉴 드롭다운 -->\r\n");
      out.write("\t<script language=\"javascript\" type=\"text/javascript\">\r\n");
      out.write("\t\tddsmoothmenu.init({\r\n");
      out.write("\t\t\tmainmenuid: \"templatemo_menu\", //menu DIV id\r\n");
      out.write("\t\t\torientation: 'h', //Horizontal or vertical menu: Set to \"h\" or \"v\"\r\n");
      out.write("\t\t\tclassname: 'ddsmoothmenu', //class added to menu's outer DIV\r\n");
      out.write("\t\t\t//customtheme: [\"#1c5a80\", \"#18374a\"],\r\n");
      out.write("\t\t\tcontentsource: \"markup\" //\"markup\" or [\"container_id\", \"path_to_menu_file\"]\r\n");
      out.write("\t\t})\r\n");
      out.write("\r\n");
      out.write("\t\tfunction clearText(field)\r\n");
      out.write("\t\t{\r\n");
      out.write("    \t\tif (field.defaultValue == field.value) \r\n");
      out.write("    \t\t\tfield.value = '';\r\n");
      out.write("    \t\telse if (field.value == '') \r\n");
      out.write("    \t\t\tfield.value = field.defaultValue;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.print(commonURL);
      out.write("/jsp/css/slimbox2.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/JavaScript\" src=\"");
      out.print(commonURL);
      out.write("/jsp/js/slimbox2.js\"></script>\r\n");
      out.write("\t<script type=\"text/JavaScript\" src=\"");
      out.print(commonURL);
      out.write("/jsp/js/member.js\"></script>");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"templatemo_wrapper\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- header -->\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\r\n");

	String userid = (String) session.getAttribute("userid");
	System.out.println("세션 : " + userid);

      out.write("\r\n");
      out.write("<!-- Start_header -->\r\n");
      out.write("\t\t<div id=\"templatemo_header\">\r\n");
      out.write("\t\t\t<div id=\"site_title\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(commonURL);
      out.write("/jsp/images/add/intro_tex02.jpg\" alt=\"Venture1st_호서대학교\" onclick=\"#\"/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div align=\"right\" style=\"color:orange;\">이 웹페이지는 <a href=\"https://www.google.com/intl/ko/chrome/browser/features.html\">Chrome</a> 브라우저에 최적화 되어 있습니다</div>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t\t<div id=\"templatemo_search\">\r\n");
      out.write("\t\t\t\t<form action=\"#\" method=\"get\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" value=\"Search...\" name=\"keyword\" id=\"keyword\" title=\"keyword\" onfocus=\"clearText(this)\" onblur=\"clearText(this)\"\tclass=\"txt_field\" /> \r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"Search\" value=\"\"\talt=\"Search\" id=\"searchbutton\" title=\"Search\" class=\"sub_btn\" />\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- End_header -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");

			String layout = (String)request.getAttribute("layout");
			System.out.println(layout);
		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- Start Menu -->\r\n");
      out.write("\t\t<div id=\"templatemo_menu\" class=\"ddsmoothmenu\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/index.do\" ");
if(layout.equals("index")){ 
      out.write("class=\"selected\"");
} 
      out.write(">Home</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/board.do?kind=trade\" ");
if(layout.equals("market")){ 
      out.write("class=\"selected\"");
} 
      out.write(">Market Place</a>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a rel=\"nofollow\" href=\"");
      out.print(commonURL);
      out.write("/board.do?kind=trade\">중고 거래</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a rel=\"nofollow\" href=\"");
      out.print(commonURL);
      out.write("/board.do?kind=ad\">원룸 광고</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a rel=\"nofollow\" href=\"");
      out.print(commonURL);
      out.write("/board.do?kind=nanum\">무료 나눔</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a rel=\"nofollow\" href=\"");
      out.print(commonURL);
      out.write("/board.do?kind=report\">사건/사고 신고</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/board.do?kind=free\" ");
if(layout.equals("board")){ 
      out.write("class=\"selected\"");
} 
      out.write(">Board</a>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li><a rel=\"nofollow\" href=\"");
      out.print(commonURL);
      out.write("/board.do?kind=free\">자유게시판</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a rel=\"nofollow\" href=\"");
      out.print(commonURL);
      out.write("/board.do?kind=none\">익명게시판</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a rel=\"nofollow\" href=\"");
      out.print(commonURL);
      out.write("/board.do?kind=major\">학과별 게시판</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/gallery.do?pg=1\" ");
if(layout.equals("gallery")){ 
      out.write("class=\"selected\"");
} 
      out.write(">Gallery</a></li>\r\n");
      out.write("\t\t\t\t<!-- <li><a href=\"blog.jsp\">Blog</a></li> -->\r\n");
      out.write("\t\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/contact.do\" ");
if(layout.equals("contact")){ 
      out.write("class=\"selected\"");
} 
      out.write(">Contact</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"");
      out.print(commonURL);
      out.write("/jsp/js/jquery-1.11.0.js\"></script>\r\n");
      out.write("\t\t\t<script src=\"");
      out.print(commonURL);
      out.write("/jsp/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");
 if(userid!=null && !userid.equals("")){ 
      out.write("\r\n");
      out.write("\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">");
      out.print(userid);
      out.write("&nbsp;님</a>&nbsp;&nbsp;&nbsp; \r\n");
      out.write("\t\t\t\t\t<a href=\"#\">새쪽지 0</a>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(commonURL);
      out.write("/logout.do\" class=\"button button-blue\"><span>로그아웃</span></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");
 } else { 
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(commonURL);
      out.write("/login.do\" class=\"button button-blue\"><span>로그인</span></a>\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(commonURL);
      out.write("/register.do\" class=\"button button-blue\"><span>회원가입</span></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<br style=\"clear: left\" />\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- End Menu -->");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"templatemo_main\">\r\n");
      out.write("\t\t\t<h2>Gallery</h2>\r\n");
      out.write("\t\t\t<div id=\"gallery\">\r\n");
      out.write("\t\t\t\t");

				int pg = (Integer)request.getAttribute("pg");//페이지 번호
				int pageCount = (Integer)request.getAttribute("pageCount"); //페이지 개수
				int block = (Integer)request.getAttribute("block");
				
				//갤러리 가져오기
				List list = (List)request.getAttribute("list");
				
				for(int i=0; i<list.size(); i++){
					GalleryDto dto = (GalleryDto)list.get(i);
				
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col one_fourth gallery_box ");
if(i==3 || i==7){
      out.write("no_margin_right");
}
      out.write("\">\r\n");
      out.write("\t\t\t\t\t<div class=\"img_frame img_frame_14 img_nom\">\r\n");
      out.write("\t\t\t\t\t\t<span></span> <a href=\"");
      out.print(commonURL);
      out.write("/jsp/images/gallery/");
      out.print(dto.getUrl());
      out.write("\" rel=\"lightbox[new_gallery]\"> \r\n");
      out.write("\t\t\t\t\t\t<img class=\"hot\" src=\"");
      out.print(commonURL);
      out.write("/jsp/images/gallery/");
      out.print(dto.getUrl());
      out.write("\" alt=\"Gallery Item 1\" />\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<h4>");
      out.print(dto.getTitle());
      out.write("</h4>\r\n");
      out.write("\t\t\t\t\t<p>");
      out.print(dto.getContents());
      out.write("</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t");

				}
				
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t<div class=\"pagging\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Previous</a></li>\r\n");
      out.write("\t\t\t\t\t");
for(int i=(block-1)*15+1; pageCount>=i; i++){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/gallery.do?pg=");
      out.print(i);
      out.write('"');
      out.write(' ');
if(i==pg){
      out.write("class=\"pg_select\"");
}
      out.write('>');
      out.print(i);
      out.write("</a></li>\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">Next</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t");
 if(userid!=null && !userid.equals("") && userid.equals("admin")){  
      out.write("\r\n");
      out.write("\t\t\t\t\t<div align=\"right\"><a href=\"");
      out.print(commonURL);
      out.write("/gallery_upload.do\" class=\"button button-blue\"><span>업로드</span></a></div>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clear h20\"></div>\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- END of templatemo_main -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- END of templatemo_wrapper -->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- footer -->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<div id=\"templatemo_bottom_wrapper\">\r\n");
      out.write("\t\t<div id=\"templatemo_bottom\">\r\n");
      out.write("\t\t\t<div class=\"col one_fourth\">\r\n");
      out.write("\t\t\t\t<h4>Market Place</h4>\r\n");
      out.write("\t\t\t\t<ul class=\"no_bullet\">\r\n");
      out.write("\t\t\t\t\t<li><span class=\"header\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.print(commonURL);
      out.write("/board.do?kind=trade\">중고거래</a>\r\n");
      out.write("\t\t\t\t\t\t</span> \r\n");
      out.write("\t\t\t\t\t\t<p>각종 중고 물품 사고 팔기가 가능합니다.</p>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li><span class=\"header\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.print(commonURL);
      out.write("/board.do?kind=ad\">원룸광고</a>\r\n");
      out.write("\t\t\t\t\t\t</span> \r\n");
      out.write("\t\t\t\t\t\t<p>건물주분들의 원룸광고를 지원해주며, 학생분들은 원룸 정보를 알아 볼 수 있습니다.</p>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li><span class=\"header\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.print(commonURL);
      out.write("/board.do?kind=nanum\">무료나눔</a>\r\n");
      out.write("\t\t\t\t\t\t</span> \r\n");
      out.write("\t\t\t\t\t\t<p>아름다운 나눔을 실천해보세요.</p>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li><span class=\"header\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.print(commonURL);
      out.write("/board.do?kind=report\">사건/사고 신고</a>\r\n");
      out.write("\t\t\t\t\t\t</span> \r\n");
      out.write("\t\t\t\t\t\t<p>거래 중의 각종 사고를 신고할 수 있습니다. 불량 이용자는 블랙리스트에 등록됩니다.</p>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col one_fourth\">\r\n");
      out.write("\t\t\t\t<h4>Board</h4>\r\n");
      out.write("\t\t\t\t<ul class=\"no_bullet\">\r\n");
      out.write("\t\t\t\t\t<li><span class=\"header\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.print(commonURL);
      out.write("/board.do?kind=free\">자유게시판</a>\r\n");
      out.write("\t\t\t\t\t\t</span> \r\n");
      out.write("\t\t\t\t\t\t<p>모든 이용자들이 자유롭게 대화할 수 있는 게시판 입니다.</p>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li><span class=\"header\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.print(commonURL);
      out.write("/board.do?kind=none\">익명게시판</a>\r\n");
      out.write("\t\t\t\t\t\t</span> \r\n");
      out.write("\t\t\t\t\t\t<p>무엇이든 터놓고 이야기 할 수 있는 게시판입니다.</p>\r\n");
      out.write("\t\t\t\t\t</li>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li><span class=\"header\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.print(commonURL);
      out.write("/board.do?kind=major\">학과별 게시판</a>\r\n");
      out.write("\t\t\t\t\t\t</span> \r\n");
      out.write("\t\t\t\t\t\t<p>각 학과별 전용 게시판을 지원해드립니다.</p>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col one_fourth\">\r\n");
      out.write("\t\t\t\t<h4>Photo Gallery</h4>\r\n");
      out.write("\t\t\t\t<ul class=\"footer_gallery\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/jsp/images/gallery/01.jpg\" rel=\"lightbox[portfolio]\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print(commonURL);
      out.write("/jsp/images/gallery/01.jpg\" alt=\"image 6\" />\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/jsp/images/gallery/02.jpg\" rel=\"lightbox[portfolio]\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print(commonURL);
      out.write("/jsp/images/gallery/02.jpg\" alt=\"image 7\" />\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/jsp/images/gallery/03.jpg\" rel=\"lightbox[portfolio]\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print(commonURL);
      out.write("/jsp/images/gallery/03.jpg\" alt=\"image 8\" />\r\n");
      out.write("\t\t\t\t\t</a></li>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/jsp/images/gallery/04.jpg\" rel=\"lightbox[portfolio]\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print(commonURL);
      out.write("/jsp/images/gallery/04.jpg\" alt=\"image 9\" />\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/jsp/images/gallery/05.jpg\" rel=\"lightbox[portfolio]\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print(commonURL);
      out.write("/jsp/images/gallery/05.jpg\" alt=\"image 10\" />\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/jsp/images/gallery/06.jpg\" rel=\"lightbox[portfolio]\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print(commonURL);
      out.write("/jsp/images/gallery/06.jpg\" alt=\"image 11\" />\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/jsp/images/gallery/07.jpg\" rel=\"lightbox[portfolio]\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print(commonURL);
      out.write("/jsp/images/gallery/07.jpg\" alt=\"image 12\" />\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/jsp/images/gallery/08.jpg\" rel=\"lightbox[portfolio]\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print(commonURL);
      out.write("/jsp/images/gallery/08.jpg\" alt=\"image 13\" />\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(commonURL);
      out.write("/jsp/images/gallery/09.jpg\" rel=\"lightbox[portfolio]\">\r\n");
      out.write("\t\t\t\t\t\t\t<img src=\"");
      out.print(commonURL);
      out.write("/jsp/images/gallery/09.jpg\" alt=\"image 14\" />\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(commonURL);
      out.write("/gallery.do?pg=1\" class=\"more\">more</a>\r\n");
      out.write("\t\t\t</div>\t\t\t\r\n");
      out.write("\t\t\t<div class=\"col one_fourth no_margin_right\">\r\n");
      out.write("\t\t\t\t<h4>Contact</h4>\r\n");
      out.write("\t\t\t\t<ul class=\"no_bullet\">\r\n");
      out.write("\t\t\t\t\t<!-- <li><span class=\"header\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.print(commonURL);
      out.write("/blog.do\">Blog</a>\r\n");
      out.write("\t\t\t\t\t\t</span> \r\n");
      out.write("\t\t\t\t\t\t<p>관리자 전용 블로그입니다. 일상생활, 유용한정보 등 다양한 포스팅을 열람하실 수 있습니다.</p>\r\n");
      out.write("\t\t\t\t\t</li> -->\r\n");
      out.write("\t\t\t\t\t<li><span class=\"header\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.print(commonURL);
      out.write("/contact.do\">Contact</a>\r\n");
      out.write("\t\t\t\t\t\t</span> \r\n");
      out.write("\t\t\t\t\t\t<p>사이트 이용 중 불편한 사항을 관리자에게 문의 할 수 있습니다.</p>\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- END of templatemo_bottom -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- END of templatemo_bottom_wrapper -->\r\n");
      out.write("\t<div id=\"templatemo_footer_wrapper\">\r\n");
      out.write("\t\t<div id=\"templatemo_footer\">\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\tCopyright © 2014 All rights reserved by <a href=\"\">Jeon Young-Hyeon</a>.<br/>\r\n");
      out.write("\t\t\t\t이 웹페이지는 <a href=\"https://www.google.com/intl/ko/chrome/browser/features.html\">Chrome</a> 브라우저에 최적화 되어 있습니다.\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- END of templatemo_footer -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- END of templatemo_footer_wrapper -->");
      out.write("\r\n");
      out.write("</body>\r\n");
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
