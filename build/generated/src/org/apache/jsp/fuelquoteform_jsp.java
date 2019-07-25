package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.sql.*;
import java.io.*;

public final class fuelquoteform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            String summer = "";
            String winter = "";
            

            String txcost = "";
            String othercost = "";
            
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

    try{
     String url = "jdbc:oracle:thin:@129.7.240.3:1521:ORCL";
        Class.forName ("oracle.jdbc.driver.OracleDriver"); 
// Establish connection //
Connection conn = DriverManager.getConnection(url, "SUNESARAF", "SUNESARAF1");
Statement statement = conn.createStatement ();             
ResultSet resultset = statement.executeQuery ("select * from SEASONALFLUCTUATION");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body> ");
 while (resultset.next()) {
      out.write("<hr>\n");
      out.write("        <div>\n");
      out.write("            ");
      out.write("\n");
      out.write("            \n");
      out.write("            ");

            summer = resultset.getString(1);
            winter = resultset.getString(2);
            
            
            
      out.write("\n");
      out.write("\n");
      out.write("              \n");
      out.write("           <script>\n");
      out.write("            var summer = ");
      out.print( resultset.getString(1) );
      out.write(";\n");
      out.write("            localStorage.setItem(\"summer\", summer);\n");
      out.write("            var winter = ");
      out.print( resultset.getString(2) );
      out.write(";\n");
      out.write("            localStorage.setItem(\"winter\", winter);\n");
      out.write("        </script>\n");
      out.write("        <div>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 }catch(Exception e){
out.println("try again!");
}

      out.write("\n");
      out.write("\n");
      out.write("\n");
 try{
     String url = "jdbc:oracle:thin:@129.7.240.3:1521:ORCL";
        Class.forName ("oracle.jdbc.driver.OracleDriver"); 
// Establish connection //
Connection conn = DriverManager.getConnection(url, "SUNESARAF", "SUNESARAF1");
Statement statements = conn.createStatement ();             
ResultSet resultsets = statements.executeQuery ("select * from TRANSPORTATION");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>  ");
 while (resultsets.next()) {
      out.write("       <hr>\n");
      out.write("        <div>\n");
      out.write("            ");
      out.write("\n");
      out.write("            \n");
      out.write("            ");

            txcost = resultsets.getString(1);
            othercost = resultsets.getString(2);
            
            
            
      out.write("\n");
      out.write("\n");
      out.write("           <script>\n");
      out.write("            var txcost = ");
      out.print( resultsets.getString(1) );
      out.write(";\n");
      out.write("            localStorage.setItem(\"txcost\", txcost);\n");
      out.write("            var othercost = ");
      out.print( resultsets.getString(2) );
      out.write(";\n");
      out.write("            localStorage.setItem(\"othercost\", othercost);\n");
      out.write("        </script>\n");
      out.write("        <div>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    ");
 }catch(Exception e){
out.println("try again!");
}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("   <script>\n");
      out.write("        //document.getElementById('USERNAME').innerhtml = localStorage.getItem('username');\n");
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
      out.write("    </script>\n");
      out.write("    <div id=\"header\">\n");
      out.write("\n");
      out.write("            <center>\n");
      out.write("        <h2> Fuel Quote Form </h2> </center>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"sidemenu\">\n");
      out.write("            <form action=\"fuelquote.jsp\" method=\"post\">  \n");
      out.write("<input id=\"USERNAME\" type=\"text\" name=\"USERNAME\" hidden/><input id=\"SUMMERFUELPRICE\" type=\"text\" name=\"SUMMERFUELPRICE\" hidden/><input id=\"WINTERFUELPRICE\" type=\"text\" name=\"WINTERFUELPRICE\" hidden/>\n");
      out.write("<input id=\"TXCOST\" type=\"text\" name=\"TXCOST\" hidden/><input id=\"OTHERCOST\" type=\"text\" name=\"OTHERCOST\" hidden/>\n");
      out.write("              <input id=\"DISCOUNT\" type=\"text\" name=\"DISCOUNT\" hidden/>\n");
      out.write("\n");
      out.write("              <center>Full Name:<input type=\"text\" name=\"CLIENTNAME\"/><br/><br/></center> \n");
      out.write("<center>Address:           <input type=\"text\" name=\"CLIENTSTREET\"/><br/><br/></center>\n");
      out.write("<center>City:              <input type=\"text\" name=\"CLIENTCITY\"/><br/><br/></center>\n");
      out.write("<center>State:             <input type=\"text\" name=\"CLIENTSTATE\"/><br/><br/></center>\n");
      out.write("<center>Zipcode:           <input type=\"text\" name=\"CLIENTZIPCODE\"/><br/><br/></center>\n");
      out.write("<center>Gallons Requested: <input type=\"text\" name=\"GALLONSREQUESTED\"/><br/><br/></center>\n");
      out.write("<center>Day:               <input type=\"text\" name=\"DAY\"/><br/><br/></center>\n");
      out.write("<center>Month:             <input type=\"text\" name=\"MONTH\"/><br/><br/></center>\n");
      out.write("<center>Year:              <input type=\"text\" name=\"YEAR\"/><br/><br/></center>\n");
      out.write("\n");
      out.write("<center><input  type=\"submit\" onclick=\"storeme()\" value=\"SUBMIT\"/> </center>\n");
      out.write(" \n");
      out.write("</form>  \n");
      out.write("         \n");
      out.write("        </div>   \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ---------------------------------------------------------------------------------------\n");
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
      out.write("    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">HOME</a>\n");
      out.write("    <a href=\"#band\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">ABOUT US</a>\n");
      out.write("    <a href=\"#tour\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">CONTACT</a>\n");
      out.write("    \n");
      out.write("    <div class=\"w3-dropdown-hover w3-hide-small\">\n");
      out.write("      <button class=\"w3-padding-large w3-button\" title=\"More\">ORDER<i class=\"fa fa-caret-down\"></i></button>     \n");
      out.write("      <div class=\"w3-dropdown-content w3-bar-block w3-card-4\">\n");
      out.write("        <a href=\"fuelquoteform.jsp\" class=\"w3-bar-item w3-button\">Fuel Quote</a>\n");
      out.write("        <div class=\"loginbox\">\n");
      out.write("        <a class=\"w3-bar-item w3-button\">  <form  class=\"w3-bar-item w3-botton\" action=\"fuelquotehistory.jsp\" method=\"post\"> \n");
      out.write("                <input id=\"USERNAME\" type=\"text\" name=\"USERNAME\" hidden/>\n");
      out.write("                <input type=\"submit\" onclick=\"storeme()\" value=\"Past Orders\"></form></a></div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">LOGOUT</a>\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"w3-padding-large w3-hover-red w3-hide-small w3-right\"><i class=\"fa fa-search\"></i></a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Navbar on small screens (remove the onclick attribute if you want the navbar to always show on top of the content when clicking on the links) -->\n");
      out.write("<div id=\"navDemo\" class=\"w3-bar-block w3-black w3-hide w3-hide-large w3-hide-medium w3-top\" style=\"margin-top:46px\">\n");
      out.write("  <a href=\"#band\" class=\"w3-bar-item w3-button w3-padding-large\" onclick=\"myFunction()\">BAND</a>\n");
      out.write("  <a href=\"#tour\" class=\"w3-bar-item w3-button w3-padding-large\" onclick=\"myFunction()\">TOUR</a>\n");
      out.write("  <a href=\"#contact\" class=\"w3-bar-item w3-button w3-padding-large\" onclick=\"myFunction()\">CONTACT</a>\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\" onclick=\"myFunction()\">MERCH</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Ticket Modal -->\n");
      out.write("  <div id=\"ticketModal\" class=\"w3-modal\">\n");
      out.write("   <div class=\"w3-container w3-content w3-padding-64\" style=\"max-width:800px\" id=\"contact\">\n");
      out.write("    <h2 class=\"w3-wide w3-center\">CONTACT</h2>\n");
      out.write("    \n");
      out.write("      <div class=\"w3-col m6\">\n");
      out.write("        <form action=\"fuelquote.jsp\" method=\"post\">\n");
      out.write("          \n");
      out.write("             Full Name: <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"\" required name=\"CLIENTNAME\">\n");
      out.write("             Address:  <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"\" required name=\"CLIENTSTREET\">\n");
      out.write("             City:  <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"\" required name=\"CLIENTCITY\"> \n");
      out.write("              \n");
      out.write("             <div class=\"w3-row-padding\" style=\"margin:0 -16px 8px -16px\"> \n");
      out.write("            <div class=\"w3-half\">\n");
      out.write("             State: <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"\" required name=\"CLIENTSTATE\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"w3-half\">\n");
      out.write("             Zipcode: <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"\" required name=\"CLIENTZICODE\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("            Gallons Requested: <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Message\" required name=\"GALLONSREQUESTED\">\n");
      out.write("          <div class=\"w3-row-padding\" style=\"margin:0 -16px 8px -16px\"> \n");
      out.write("            <div class=\"w3-half\">\n");
      out.write("             Day: <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"\" required name=\"DAY\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"w3-half\">\n");
      out.write("             Month: <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"\" required name=\"MONTH\">\n");
      out.write("            </div>\n");
      out.write("             \n");
      out.write("            <div class=\"w3-half\">\n");
      out.write("             Year: <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"\" required name=\"YEAR\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <button class=\"w3-button w3-black w3-section w3-right\" onclick=\"storeme()\" type=\"submit\">SEND</button>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("<!-- End Page Content -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"w3-container w3-padding-64 w3-center w3-opacity w3-light-grey w3-xlarge\">\n");
      out.write("  <i class=\"fa fa-facebook-official w3-hover-opacity\"></i>\n");
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
