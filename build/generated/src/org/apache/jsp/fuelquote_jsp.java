package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class fuelquote_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   ");

try{
    String url = "jdbc:oracle:thin:@129.7.240.3:1521:ORCL";
        String username = request.getParameter("USERNAME");
        String clientname = request.getParameter("CLIENTNAME");
        String clientstreet = request.getParameter("CLIENTSTREET");
        String clientcity = request.getParameter("CLIENTCITY");
        String clientstate = request.getParameter("CLIENTSTATE");
        String clientzipcode = request.getParameter("CLIENTZIPCODE");
        String gallonsrequested = request.getParameter("GALLONSREQUESTED");
        String day = request.getParameter("DAY");
        String Month = request.getParameter("MONTH");
        String year = request.getParameter ("YEAR");
        String deliverydate = request.getParameter("REQUESTEDDATE");
        String summerfuelprice = request.getParameter("SUMMERFUELPRICE");
        String winterfuelprice = request.getParameter("WINTERFUELPRICE");
        String txcost = request.getParameter("TXCOST");
        String othercost = request.getParameter("OTHERCOST");
        
        
        float gallonsrequested1= Float.parseFloat(gallonsrequested);
        float summerfuelprice1 = Float.parseFloat(summerfuelprice);
        float winterfuelprice1 = Float.parseFloat(winterfuelprice);
        float txcost1 = Float.parseFloat(txcost);
        float othercost1 = Float.parseFloat(othercost);
        float shipping = 1.22f;
        float total = 1.22f;
        float totalcost = 1.22f;
        if (clientstate == "TX"){
             shipping = txcost1;
        } else {
             shipping = othercost1;
             //return shipping;
        }
        
        if (Month == "Mar" || Month == "Apr" || Month == "May" || Month == "Jun" || Month == "Jul" || Month == "Aug"){
          
            total = (gallonsrequested1*summerfuelprice1);
            totalcost = total + shipping;
            
        } else {
           total = (gallonsrequested1*winterfuelprice1);
           totalcost = total + shipping;
           
       }
       
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("       \n");

        Class.forName ("oracle.jdbc.driver.OracleDriver"); // database connection
        Connection conn =DriverManager.getConnection(url, "SUNESARAF", "SUNESARAF1");  
       
        PreparedStatement psrt = conn.prepareStatement("INSERT INTO FUEL_QUOTE VALUES ('"+username+"','"+clientname+"','"+clientstreet+"','"+clientcity+"','"+clientstate+"','"+clientzipcode+"', '"+gallonsrequested+"', '"+day+"','"+Month+"', '"+year+"','"+total+"','"+shipping+"','"+totalcost+"')");
        psrt.execute();
               out.println(clientname);
        out.println (clientstreet);
        out.println(clientcity);
        out.println (clientstate);
        out.println(clientzipcode);
        out.println (gallonsrequested);
        out.println(total);
        out.println (shipping);
        out.println (totalcost);
        PreparedStatement pst = conn.prepareStatement("DELETE FROM FUEL_EXTRACT");
                     pst.execute();
        
        PreparedStatement pat = conn.prepareStatement("INSERT INTO FUEL_EXTRACT VALUES ('"+username+"','"+clientname+"','"+clientstreet+"','"+clientcity+"','"+clientstate+"','"+clientzipcode+"', '"+gallonsrequested+"', '"+day+"','"+Month+"', '"+year+"','"+total+"','"+shipping+"','"+totalcost+"')");
        pat.execute();
                out.println(clientname);
        out.println (clientstreet);
        out.println(clientcity);
        out.println (clientstate);
        out.println(clientzipcode);
        out.println (gallonsrequested);
        out.println(total);
        out.println (shipping);
        out.println (totalcost);
        PreparedStatement ptt = conn.prepareStatement("Select clientname, clientstreet, clientcity, clientstate, clientzipcode, gallonsrequested, total, shipping, totalcost From FUEL_EXTRACT");
        ResultSet resultset = ptt.executeQuery();
        out.println(clientname);
        out.println (clientstreet);
        out.println(clientcity);
        out.println (clientstate);
        out.println(clientzipcode);
        out.println (gallonsrequested);
        out.println(total);
        out.println (shipping);
        out.println (totalcost);
        
      out.write("\n");
      out.write("        \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Order Confirmation</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div id=\"header\">\n");
      out.write("        <div style=\"padding-top: 60px;\"></div>\n");
      out.write("        <center>\n");
      out.write("        <h2> ORDER CONFIRMATION </h2> </center>\n");
      out.write("        <div style=\"padding-bottom: 30px;\"></div>\n");
      out.write("        </div>\n");
      out.write("<div id=\"sidemenu\">\n");
      out.write("        <form action=\"access3.jsp\" method=\"post\">\n");
      out.write("            ");
 while (resultset.next()) {
      out.write("\n");
      out.write("            <div style=\"padding-left:40%;\">\n");
      out.write("            <div class=\"form-group\"><b>");
      out.print( resultset.getString(1));
      out.write("</div>\n");
      out.write("            <div class=\"form-group\"></b>Address: </b></div>\n");
      out.write("            <div class=\"form-group\"></b></b>");
      out.print( resultset.getString(2));
      out.write("</b></div>\n");
      out.write("            <div class=\"form-group\" style=\"padding-bottom: 10px;\"></b>");
      out.print( resultset.getString(3));
      out.write(',');
      out.write(' ');
      out.print( resultset.getString(4));
      out.write(' ');
      out.print( resultset.getString(5));
      out.write("</b></div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\"><b>Gallons Requested: </b> ");
      out.print( resultset.getString(6));
      out.write(" gallons</div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\"><b>Total: </b>      $");
      out.print( resultset.getFloat(7));
      out.write("</b></div>\n");
      out.write("            <div class=\"form-group\"><b>Shipping: </b>   $");
      out.print( resultset.getFloat(8));
      out.write("</b></div>\n");
      out.write("            <div class=\"form-group\"><b>Total Cost: </b> $");
      out.print( resultset.getFloat(9));
      out.write("</b></div>\n");
      out.write("                </div><br><br>\n");
      out.write("                \n");
      out.write(" <center><div class=\"form-group\" style=\"padding-left:550px; padding-right:550px; padding-bottom: 100px\"><input class=\"form-control\" type=\"submit\" style=\"background-color: green; color:white; \"  value=\"CONFIRM\"/></div></center>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            ");
 }
      out.write("\n");
      out.write("          \n");
      out.write("</form>  \n");
      out.write("         \n");
      out.write("        </div>           \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("      ");
  }
   catch(Exception e){
        
       out.println("Please Try Again");       
       
   }    

        
      out.write("\n");
      out.write("        \n");
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
      out.write("    <a href=\"access3.jsp\" class=\"w3-bar-item w3-button w3-padding-large\">HOME</a>\n");
      out.write("    <div class=\"w3-dropdown-hover w3-hide-small\">\n");
      out.write("      <button class=\"w3-padding-large w3-button\" title=\"More\">ORDER <i class=\"fa fa-caret-down\"></i></button>     \n");
      out.write("      <div class=\"w3-dropdown-content w3-bar-block w3-card-4\">\n");
      out.write("        <a href=\"fuelquoteform.jsp\" class=\"w3-bar-item w3-button\">Fuel Quote</a>\n");
      out.write("        <div class=\"loginbox\">\n");
      out.write("        <a class=\"w3-bar-item w3-button\">  <form  class=\"w3-bar-item w3-botton\" action=\"fuelquotehistory.jsp\" method=\"post\"> \n");
      out.write("                <input id=\"USERNAME\" type=\"text\" name=\"USERNAME\" hidden/>\n");
      out.write("                <input type=\"submit\" onclick=\"storeme()\" value=\"Past Orders\"></form></a></div>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <a href=\"#band\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">ABOUT US</a>\n");
      out.write("    <a href=\"#tour\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">CONTACT</a>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <a href=\"login.jsp\" class=\"w3-padding-large w3-hover-red w3-hide-small w3-right\">LOGOUT</a>\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"w3-padding-large w3-hover-red w3-hide-small w3-right\"><i class=\"fa fa-search\"></i></a>\n");
      out.write("  </div>\n");
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
