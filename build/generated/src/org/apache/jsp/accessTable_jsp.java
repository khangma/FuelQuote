package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class accessTable_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

     String url = "jdbc:oracle:thin:@129.7.240.3:1521:ORCL";
        Class.forName ("oracle.jdbc.driver.OracleDriver"); 
// Establish connection //
Connection conn = DriverManager.getConnection(url, "SUNESARAF", "SUNESARAF1");

Statement statement = conn.createStatement ();             
ResultSet resultset = statement.executeQuery ("select * from LOGIN");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Lato\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        table.paleBlueRows {\n");
      out.write("  font-family: \"Times New Roman\", Times, serif;\n");
      out.write("  border: 1px solid #FFFFFF;\n");
      out.write("  background-color: #EFEFEF;\n");
      out.write("  width: 350px;\n");
      out.write("  height: 200px;\n");
      out.write("  text-align: center;\n");
      out.write("  border-collapse: collapse;\n");
      out.write("}\n");
      out.write("table.paleBlueRows td, table.paleBlueRows th {\n");
      out.write("  border: 1px solid #FFFFFF;\n");
      out.write("  padding: 3px 2px;\n");
      out.write("}\n");
      out.write("table.paleBlueRows tbody td {\n");
      out.write("  font-size: 13px;\n");
      out.write("}\n");
      out.write("table.paleBlueRows tr:nth-child(even) {\n");
      out.write("  background: #E3E4E5;\n");
      out.write("}\n");
      out.write("table.paleBlueRows thead {\n");
      out.write("  background: #706E81;\n");
      out.write("  border-bottom: 5px solid #FFFFFF;\n");
      out.write("}\n");
      out.write("table.paleBlueRows thead th {\n");
      out.write("  font-size: 17px;\n");
      out.write("  font-weight: bold;\n");
      out.write("  color: #FFFFFF;\n");
      out.write("  text-align: center;\n");
      out.write("  border-left: 2px solid #FFFFFF;\n");
      out.write("}\n");
      out.write("table.paleBlueRows thead th:first-child {\n");
      out.write("  border-left: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table.paleBlueRows tfoot {\n");
      out.write("  font-size: 14px;\n");
      out.write("  font-weight: bold;\n");
      out.write("  color: #939393;\n");
      out.write("  background: #737F88;\n");
      out.write("  border-top: 3px solid #151515;\n");
      out.write("}\n");
      out.write("table.paleBlueRows tfoot td {\n");
      out.write("  font-size: 14px;\n");
      out.write("}\n");
      out.write("table.paleBlueRows tfoot .links {\n");
      out.write("  text-align: right;\n");
      out.write("}\n");
      out.write("table.paleBlueRows tfoot .links a{\n");
      out.write("  display: inline-block;\n");
      out.write("  background: #DCC8DE;\n");
      out.write("  color: #FFFFFF;\n");
      out.write("  padding: 2px 8px;\n");
      out.write("  border-radius: 5px;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("        <center>\n");
      out.write("            <div style=\"padding-top:90px;\"></div>\n");
      out.write("                 \n");
      out.write("        <h2> DELETE USER </h2> </center>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"padding-top:50px;\"></div>\n");
      out.write("        <div style=\"padding-left:37%; \">\n");
      out.write("<table class=\"paleBlueRows\">\n");
      out.write("<thead>\n");
      out.write("<tr>\n");
      out.write("<th>Username</th>\n");
      out.write("<th>Password</th>\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("<tfoot>\n");
      out.write("<tr>\n");
      out.write("<td colspan=\"2\">\n");
      out.write("<div class=\"links\"><a href=\"#\">&laquo;</a> <a class=\"active\" href=\"#\">1</a> <a href=\"#\">2</a> <a href=\"#\">3</a> <a href=\"#\">4</a> <a href=\"#\">&raquo;</a></div>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</tfoot>\n");
      out.write("<tbody>\n");
      out.write("<tr>\n");
      out.write("    ");
 while (resultset.next()) {
      out.write("\n");
      out.write("<td>");
      out.print( resultset.getString(1));
      out.write("</td>\n");
      out.write("<td>");
      out.print( resultset.getString(2));
      out.write("</td></tr>");
 }
      out.write("\n");
      out.write("\n");
      out.write("</tbody>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("<div style=\"padding-bottom:90px;\"></div>\n");
      out.write("    </body>\n");
      out.write("       <!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:white;\">\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("\n");
      out.write("   \n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<title>Home</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Lato\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<style>\n");
      out.write("body {font-family: \"Lato\", sans-serif}\n");
      out.write(".mySlides {display: none}\n");
      out.write(".loginbox input[type = \"submit\"]\n");
      out.write("{\n");
      out.write("    background: transparent;\n");
      out.write("\tcolor: black;\n");
      out.write("         border: none;\n");
      out.write("         cursor: pointer;\n");
      out.write("         outline:none;\n");
      out.write("\tpadding-left:5px;\n");
      out.write("        text-align: left;\n");
      out.write("        float:left;\n");
      out.write("    -moz-transition: padding-left .3s ease-in;\n");
      out.write("    -o-transition: padding-left  .3s ease-in;\n");
      out.write("    -webkit-transition: padding-left  .3s ease-in;\n");
      out.write("    transition: padding-left  .3s ease-in;\n");
      out.write("          \t\n");
      out.write("        }\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write(" <script>\n");
      out.write("        //document.getElementById('USERNAME').innerhtml = localStorage.getItem('username');\n");
      out.write("        //document.getElementById('USERNAME').value = localStorage.getItem('username');\n");
      out.write("        function storeme(){\n");
      out.write("          document.getElementById('USERNAME').value = localStorage.getItem('username');\n");
      out.write("        }</script>\n");
      out.write("<!-- Navbar -->\n");
      out.write("<div class=\"w3-top\">\n");
      out.write("  <div class=\"w3-bar w3-black w3-card\">\n");
      out.write("    <a class=\"w3-bar-item w3-button w3-padding-large w3-hide-medium w3-hide-large w3-right\" href=\"javascript:void(0)\" onclick=\"myFunction()\" title=\"Toggle Navigation Menu\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("    <a href=\"index.jsp\" class=\"w3-bar-item w3-button w3-padding-large\">HOME</a>\n");
      out.write("     <div class=\"w3-dropdown-hover w3-hide-small\">\n");
      out.write("      <button class=\"w3-padding-large w3-button\" title=\"More\">RATES <i class=\"fa fa-caret-down\"></i></button>     \n");
      out.write("      <div class=\"w3-dropdown-content w3-bar-block w3-card-4\">\n");
      out.write("        <a href=\"seasonalfluction.jsp\" class=\"w3-bar-item w3-button\">Fuel Rates</a>\n");
      out.write("        <a href=\"transportation.jsp\" class=\"w3-bar-item w3-button\">Transportation Rates</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-dropdown-hover w3-hide-small\">\n");
      out.write("      <button class=\"w3-padding-large w3-button\" title=\"More\">USERS <i class=\"fa fa-caret-down\"></i></button>     \n");
      out.write("      <div class=\"w3-dropdown-content w3-bar-block w3-card-4\">\n");
      out.write("        <a href=\"accessTable.jsp\" class=\"w3-bar-item w3-button\">Current Users</a>\n");
      out.write("        <a href=\"adduser.jsp\" class=\"w3-bar-item w3-button\">Add Users</a>\n");
      out.write("        <a href=\"deleteuser.jsp\" class=\"w3-bar-item w3-button\">Delete Users</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <a href=\"orders.jsp\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">ORDERS </a>\n");
      out.write("    <a href=\"#band\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">ABOUT US</a>\n");
      out.write("    <a href=\"#tour\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">CONTACT</a>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    <a href=\"login.jsp\" class=\"w3-padding-large w3-hover-red w3-hide-small w3-right\">LOGOUT</a>\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"w3-padding-large w3-hover-red w3-hide-small w3-right\"><i class=\"fa fa-search\"></i></a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Navbar on small screens (remove the onclick attribute if you want the navbar to always show on top of the content when clicking on the links) -->\n");
      out.write("<div id=\"navDemo\" class=\"w3-bar-block w3-black w3-hide w3-hide-large w3-hide-medium w3-top\" style=\"margin-top:46px\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("   //document.getElementById('USERNAME').innerhtml = localStorage.getItem('username');\n");
      out.write("        //document.getElementById('USERNAME').value = localStorage.getItem('username');\n");
      out.write("        function storeme(){\n");
      out.write("          document.getElementById('USERNAME').value = localStorage.getItem('username');\n");
      out.write("          document.getElementById('SUMMERFUELPRICE').value = localStorage.getItem('summer');\n");
      out.write("          document.getElementById('WINTERFUELPRICE').value = localStorage.getItem('winter');\n");
      out.write("          document.getElementById('TXCOST').value = localStorage.getItem('txcost');\n");
      out.write("          document.getElementById('OTHERCOST').value = localStorage.getItem('othercost');\n");
      out.write("          document.getElementById('DISCOUNT').value = localStorage.getItem('discount');\n");
      out.write("        }\n");
      out.write("        //\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write("<!-- End Page Content -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"w3-container w3-padding-64 w3-center w3-opacity w3-light-grey w3-xlarge\">\n");
      out.write("    <i class=\"fa fa-facebook-official w3-hover-opacity\"></i>\n");
      out.write("  <i class=\"fa fa-instagram w3-hover-opacity\"></i>\n");
      out.write("  <i class=\"fa fa-snapchat w3-hover-opacity\"></i>\n");
      out.write("  <i class=\"fa fa-pinterest-p w3-hover-opacity\"></i>\n");
      out.write("  <i class=\"fa fa-twitter w3-hover-opacity\"></i>\n");
      out.write("  <i class=\"fa fa-linkedin w3-hover-opacity\"></i>\n");
      out.write("  <p class=\"w3-medium\">Powered by <a href=\"https://www.w3schools.com/w3css/default.asp\" target=\"_blank\">fuel.org</a></p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("   //document.getElementById('USERNAME').innerhtml = localStorage.getItem('username');\n");
      out.write("        //document.getElementById('USERNAME').value = localStorage.getItem('username');\n");
      out.write("        function storeme(){\n");
      out.write("          document.getElementById('USERNAME').value = localStorage.getItem('username');\n");
      out.write("          document.getElementById('SUMMERFUELPRICE').value = localStorage.getItem('summer');\n");
      out.write("          document.getElementById('WINTERFUELPRICE').value = localStorage.getItem('winter');\n");
      out.write("          document.getElementById('TXCOST').value = localStorage.getItem('txcost');\n");
      out.write("          document.getElementById('OTHERCOST').value = localStorage.getItem('othercost');\n");
      out.write("          document.getElementById('DISCOUNT').value = localStorage.getItem('discount');\n");
      out.write("        }\n");
      out.write("        //\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
