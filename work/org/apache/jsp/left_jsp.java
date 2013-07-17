package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class left_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("function show(){\r\n");
      out.write("if(document.getElementById('div1').style.display==\"block\"){\r\n");
      out.write("document.getElementById('div1').style.display=\"none\";\r\n");
      out.write("}\r\n");
      out.write("else if(document.getElementById('div1').style.display==\"none\"){\r\n");
      out.write("document.getElementById('div1').style.display=\"block\";\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("function showcheck(){\r\n");
      out.write("if(document.getElementById('div2').style.display==\"block\"){\r\n");
      out.write("document.getElementById('div2').style.display=\"none\";\r\n");
      out.write("}\r\n");
      out.write("else if(document.getElementById('div2').style.display==\"none\"){\r\n");
      out.write("document.getElementById('div2').style.display=\"block\";\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write(".caidan{\r\n");
      out.write("width: 160px;\r\n");
      out.write("height: 50px;\r\n");
      out.write("border:1px solid #96C2F1;\r\n");
      out.write("background-color: #EFF7FF\r\n");
      out.write("}\r\n");
      out.write(".button{\r\n");
      out.write("width:160px;\r\n");
      out.write("height:30px;\r\n");
      out.write("background-color: #EEFAFF\r\n");
      out.write("}\r\n");
      out.write(".divstyle{ \r\n");
      out.write("width:160px;\r\n");
      out.write("background-color: #F1F7F9\r\n");
      out.write("}\r\n");
      out.write(".fontstyle{ \r\n");
      out.write("width:160px;\r\n");
      out.write("font-size:16px;\r\n");
      out.write("font-style:inherit;\r\n");
      out.write("border:1px solid #96C2F1;\r\n");
      out.write("font-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("color: #333333;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#5AA2C8\">\r\n");
      out.write("<table class=\"caidan\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td> \r\n");
      out.write("<marquee direction=left scrollamount=3 onmouseover=\"this.stop()\" onmouseout=\"this.start()\">\r\n");
      out.write("欢迎访问图书管理系统\r\n");
      out.write("</marquee>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<input type=\"button\" class=\"button\" value=\"图书管理\" onclick=\"show()\"/>\r\n");
      out.write("<div id=\"div1\"  class=\"divstyle\" style=\"display:none\">\r\n");
      out.write("<div class=\"fontstyle\"><a href=\"bookmessage.jsp\" target=\"right\"><center>查看图书</center></a></div>\r\n");
      out.write("<div class=\"fontstyle\"><a href=\"addbook.jsp\" target=\"right\"><center>添加图书</center></a></div>\r\n");
      out.write("</div>\r\n");
      out.write("<input type=\"button\" class=\"button\" value=\"查找图书\" onclick=\"showcheck()\"/>\r\n");
      out.write("<div id=\"div2\" class=\"divstyle\" style=\"display:none\">\r\n");
      out.write("<div class=\"fontstyle\"><a href=\"searchauthor.jsp\" target=\"right\"><center>作者查询</center></a></div>\r\n");
      out.write("<div class=\"fontstyle\"><a href=\"searchname.jsp\" target=\"right\"><center>书名查询</center></a></div>\r\n");
      out.write("<div class=\"fontstyle\"><a href=\"searchtype.jsp\" target=\"right\"><center>图书分类查询</center></a></div>\r\n");
      out.write("<div class=\"fontstyle\"><a href=\"searchchuban.jsp\" target=\"right\"><center>出版社查询</center></a></div>\r\n");
      out.write("<div class=\"fontstyle\"><a href=\"searchcontent.jsp\" target=\"right\"><center>内容查询</center></a></div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
