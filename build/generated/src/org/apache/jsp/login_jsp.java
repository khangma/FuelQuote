package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<head>\n");
      out.write("<title> LOGIN PAGE </title>\n");
      out.write("\t<link rel = \"stylesheet\" type = \"text/css\" href = \"style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Lato\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<body>\n");
      out.write("<style>\n");
      out.write("body{\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpaddding: 0;\n");
      out.write("\tbackground-image: url(\"black.jpg\");\n");
      out.write("\tbackground-size: cover;\n");
      out.write("\tbackground-position: center;\n");
      out.write("\tfont-familt: sans-serif;\n");
      out.write("}\n");
      out.write(".loginbox{\n");
      out.write("\twidth: 320px;\n");
      out.write("\tbackground: rgba(0,0,0,0.5);\n");
      out.write("\theight: 480px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\ttop: 50%;\n");
      out.write("\tleft: 50%;\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttransform: translate(-50%, -50%);\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("        padding: 60px 30px;\n");
      out.write("}\n");
      out.write(".loginbox p{\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write(".loginbox input{\n");
      out.write("\twidth: 100%;\n");
      out.write("\tmargin-bottom: 20px;\n");
      out.write("}\n");
      out.write(".loginbox input[type = \"username\"], input[type = \"password\"]\n");
      out.write("{\n");
      out.write("\tborder: none;\n");
      out.write("\tborder-bottom: 1px solid #fff;\n");
      out.write("\tbackground: transparent;\n");
      out.write("\toutline: none;\n");
      out.write("\theight: 40px;\n");
      out.write("\tcolor: lightgray;\n");
      out.write("\tfont-size: 13px;\n");
      out.write("}\n");
      out.write(".loginbox input[type = \"submit\"]\n");
      out.write("{\n");
      out.write("\tborder: none;\n");
      out.write("\toutline: none;\n");
      out.write("\theight: 40px;\n");
      out.write("\tbackground: green;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\t<div class = \"loginbox\">\n");
      out.write("\t\t<h1> LOGIN </h1>\n");
      out.write("\t\t<form action=\"loginprocess.jsp\" method=\"post\">\n");
      out.write("                    <p>   </p>\n");
      out.write("\t\t\t<p> Username </p>\n");
      out.write("\t\t\t<input id=\"uname\" type = \"username\" name= \"username\" placeholder = \" \" required>\n");
      out.write("\t\t\t<p> Password</p>\n");
      out.write("\t\t\t<input type = \"password\" name = \"password\" placeholder = \" \" required> <br>\n");
      out.write("                        <p>   </p>\n");
      out.write("                        <input type = \"submit\" style=\"background:white; color:black;\"onclick=\"savepass()\" name = \"\" value = \"Sign In\"> <br></form>\n");
      out.write("\t\t<form action=\"adduser.jsp\" method=\"post\">\n");
      out.write("                <input type=\"submit\" name = \"\" value = \"Create Account\"><br>\n");
      out.write("                </form>\n");
      out.write("\t</div>\n");
      out.write("\t<script>\n");
      out.write("            function savepass(){\n");
      out.write("                localStorage.setItem(\"username\",(document.getElementById(\"uname\").value));\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\t\n");
      out.write("</body>\n");
      out.write("</head>");
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
