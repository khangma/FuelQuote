package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <a href=\"#tour\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">CONTACT</a>\n");
      out.write("    \n");
      out.write("    <a href=\"login.jsp\" class=\"w3-bar-item w3-button w3-padding-large w3-hide-small\">SIGN IN</a>\n");
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
      out.write("<!-- Page content -->\n");
      out.write("<div class=\"w3-content\" style=\"max-width:2000px;margin-top:46px\">\n");
      out.write("\n");
      out.write("  <!-- Automatic Slideshow Images -->\n");
      out.write("  <div class=\"mySlides w3-display-container w3-center\">\n");
      out.write("    <img src=\"home.jpg\" style=\"width:100% ; height: 540px \">\n");
      out.write("    <div class=\"w3-display-bottommiddle w3-container w3-text-white w3-padding-32 w3-hide-small\">\n");
      out.write("      <h3>Save More With Us!</h3>\n");
      out.write("      <p><b>Check our new rates for platinum members.</b></p>   \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("\n");
      out.write("  <!---\n");
      out.write("  <!-- The Band Section -->\n");
      out.write("  <div class=\"w3-container w3-content w3-center w3-padding-64\" style=\"max-width:800px\" id=\"band\">\n");
      out.write("    <h2 class=\"w3-wide\">WHAT WE DO</h2>\n");
      out.write("    <p class=\"w3-opacity\"><i>We sell fuel</i></p>\n");
      out.write("    <p class=\"w3-justify\">We have created a fuel selling website. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip\n");
      out.write("      ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur\n");
      out.write("      adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>\n");
      out.write("    <p></p>\n");
      out.write("    <p></p>\n");
      out.write("    <p></p>\n");
      out.write("    <p></p>\n");
      out.write("  </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- The Contact Section -->\n");
      out.write("  <div class=\"w3-black\" id=\"tour\">\n");
      out.write("\n");
      out.write("  <div class=\"w3-container w3-content w3-padding-64\" style=\"max-width:800px\" id=\"contact\">\n");
      out.write("    <h2 class=\"w3-wide w3-center\">CONTACT</h2>\n");
      out.write("    <p class=\"w3-opacity w3-center\"><i>We are here to help.</i></p>\n");
      out.write("    <div class=\"w3-row w3-padding-32\">\n");
      out.write("      <div class=\"w3-col m6 w3-large w3-margin-bottom\">\n");
      out.write("        <i class=\"fa fa-map-marker\" style=\"width:30px\"></i> Headquarter, US<br>\n");
      out.write("        <i class=\"fa fa-phone\" style=\"width:30px\"></i> Phone: +00 151515<br>\n");
      out.write("        <i class=\"fa fa-envelope\" style=\"width:30px\"> </i> Email: mail@mail.com<br>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"w3-col m6\">\n");
      out.write("        <form action=\"/action_page.php\" target=\"_blank\">\n");
      out.write("          <div class=\"w3-row-padding\" style=\"margin:0 -16px 8px -16px\">\n");
      out.write("            <div class=\"w3-half\">\n");
      out.write("              <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Name\" required name=\"Name\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"w3-half\">\n");
      out.write("              <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Email\" required name=\"Email\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Message\" required name=\"Message\">\n");
      out.write("          <button class=\"w3-button w3-black w3-section w3-right\" type=\"submit\">SEND</button>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("    </div>\n");
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
      out.write("// Automatic Slideshow - change image every 4 seconds\n");
      out.write("var myIndex = 0;\n");
      out.write("carousel();\n");
      out.write("\n");
      out.write("function carousel() {\n");
      out.write("  var i;\n");
      out.write("  var x = document.getElementsByClassName(\"mySlides\");\n");
      out.write("  for (i = 0; i < x.length; i++) {\n");
      out.write("    x[i].style.display = \"none\";  \n");
      out.write("  }\n");
      out.write("  myIndex++;\n");
      out.write("  if (myIndex > x.length) {myIndex = 1}    \n");
      out.write("  x[myIndex-1].style.display = \"block\";  \n");
      out.write("  setTimeout(carousel, 4000);    \n");
      out.write("}\n");
      out.write("\n");
      out.write("// Used to toggle the menu on small screens when clicking on the menu button\n");
      out.write("function myFunction() {\n");
      out.write("  var x = document.getElementById(\"navDemo\");\n");
      out.write("  if (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("    x.className += \" w3-show\";\n");
      out.write("  } else { \n");
      out.write("    x.className = x.className.replace(\" w3-show\", \"\");\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("// When the user clicks anywhere outside of the modal, close it\n");
      out.write("var modal = document.getElementById('ticketModal');\n");
      out.write("window.onclick = function(event) {\n");
      out.write("  if (event.target == modal) {\n");
      out.write("    modal.style.display = \"none\";\n");
      out.write("  }\n");
      out.write("}\n");
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
