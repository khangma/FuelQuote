package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class trial_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("<head></head>\n");
      out.write("<title> Fuel System </title>\n");
      out.write("\t<link rel = \"stylesheet\" type = \"text/css\" href = \"home.css\">\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("        <div class=\"mainbody\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("            <img src=\"logo1.png\">\n");
      out.write("            </div>       \n");
      out.write("            <div class=\"main-nav\">\n");
      out.write("                <li class=\"active\"><a href=\"\" > HOME </a></li>                \n");
      out.write("                <li><a href=\"login.jsp\" > ABOUT </a></li>\n");
      out.write("                <div class=\"sub-menu-1\"> <ul>\n");
      out.write("   <li><a href=\"\">Our Team</a></li>\n");
      out.write("   <li><a href=\"\">Camp Sites</a></li>\n");
      out.write("   \n");
      out.write("   <li><a href=\"\">Resources</a></li></div>\n");
      out.write("  </div>\n");
      out.write("                <li><a href=\"login.jsp\" > NEWS  </a></li>\n");
      out.write("                <li><a href=\"login.jsp\" > LOGIN </a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>  \n");
      out.write("        \n");
      out.write("         </div>\n");
      out.write("             \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
