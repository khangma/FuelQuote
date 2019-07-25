
<%@ page import ="java.sql.*" %>
   <%
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

       %>
      

       
       <%
        Class.forName ("oracle.jdbc.driver.OracleDriver"); // database connection
        Connection conn =DriverManager.getConnection(url, "SUNESARAF", "SUNESARAF1");  
       
        PreparedStatement psrt = conn.prepareStatement("INSERT INTO FUEL_QUOTE VALUES ('"+username+"','"+clientname+"','"+clientstreet+"','"+clientcity+"','"+clientstate+"','"+clientzipcode+"', '"+gallonsrequested+"', '"+day+"','"+Month+"', '"+year+"','"+total+"','"+shipping+"','"+totalcost+"')");
        psrt.execute();
       
        PreparedStatement pst = conn.prepareStatement("DELETE FROM FUEL_EXTRACT");
                     pst.execute();
        
        PreparedStatement pat = conn.prepareStatement("INSERT INTO FUEL_EXTRACT VALUES ('"+username+"','"+clientname+"','"+clientstreet+"','"+clientcity+"','"+clientstate+"','"+clientzipcode+"', '"+gallonsrequested+"', '"+day+"','"+Month+"', '"+year+"','"+total+"','"+shipping+"','"+totalcost+"')");
        pat.execute();
        
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
        %>
        <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Confirmation</title>
    </head>
    <body>
    <center> <div style="padding-top: 30px"  <h2>Order Confirmation</h2></div></center>
<div id="sidemenu">
        <form action="access3.jsp" method="post">
            <% while (resultset.next()) {%>
            <center><div style="padding-left:350px; padding-right:350px;">
            <div class="form-group"><b><%= resultset.getString(1)%></div>
            <div class="form-group"></b>Address: </b></div>
            <div class="form-group"></b></b><%= resultset.getString(2)%></b></div>
            <div class="form-group" style="padding-bottom: 10px;"></b><%= resultset.getString(3)%>, <%= resultset.getString(4)%> <%= resultset.getString(5)%></b></div>
            
            <div class="form-group"><b>Gallons Requested:</b> <%= resultset.getString(6)%> gallons</div>
            
            <div class="form-group"><b>Total:</b>      $<%= resultset.getFloat(7)%></b></div>
            <div class="form-group"><b>Shipping:</b>   $<%= resultset.getFloat(8)%></b></div>
            <div class="form-group"><b>Total Cost:</b> $<%= resultset.getFloat(9)%></b></div>
                </div><br><br></center>
 <center><div class="form-group" style="padding-left:550px; padding-right:550px; padding-bottom: 100px"><input class="form-control" type="submit" style="background-color: green; color:white; "  value="CONFIRM"/></div></center>

            
            <% }%>
            <center><div class="form-group" style="padding-left:550px; padding-right:550px; padding-bottom: 100px"><input class="form-control" type="submit" style="background-color: green; color:white; "  value="CONFIRM"/></div></center>

</form>  
         
        </div>           
        
    </body>

      <%  }
   catch(Exception e){
        
       out.println("Please Try Again");       
       
   }    

        %>
        
    
<!DOCTYPE html>
<html lang="en">
<title>Home</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {font-family: "Lato", sans-serif}
.mySlides {display: none}
.loginbox input[type = "submit"]
{
    background: transparent;
	color: black;
         border: none;
         cursor: pointer;
         outline:none;
	padding-left:5px;
        text-align: left;
        float:left;
    -moz-transition: padding-left .3s ease-in;
    -o-transition: padding-left  .3s ease-in;
    -webkit-transition: padding-left  .3s ease-in;
    transition: padding-left  .3s ease-in;
          	
        }
</style>
<body>
 <script>
        //document.getElementById('USERNAME').innerhtml = localStorage.getItem('username');
        //document.getElementById('USERNAME').value = localStorage.getItem('username');
        function storeme(){
          document.getElementById('USERNAME').value = localStorage.getItem('username');
        }</script>
<!-- Navbar -->
<div class="w3-top">
  <div class="w3-bar w3-black w3-card">
    <a class="w3-bar-item w3-button w3-padding-large w3-hide-medium w3-hide-large w3-right" href="javascript:void(0)" onclick="myFunction()" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
    <a href="access3.jsp" class="w3-bar-item w3-button w3-padding-large">HOME</a>
    <a href="#band" class="w3-bar-item w3-button w3-padding-large w3-hide-small">ABOUT US</a>
    <a href="#tour" class="w3-bar-item w3-button w3-padding-large w3-hide-small">CONTACT</a>
    
    <div class="w3-dropdown-hover w3-hide-small">
      <button class="w3-padding-large w3-button" title="More">ORDER <i class="fa fa-caret-down"></i></button>     
      <div class="w3-dropdown-content w3-bar-block w3-card-4">
        <a href="fuelquoteform.jsp" class="w3-bar-item w3-button">Fuel Quote</a>
        <div class="loginbox">
        <a class="w3-bar-item w3-button">  <form  class="w3-bar-item w3-botton" action="fuelquotehistory.jsp" method="post"> 
                <input id="USERNAME" type="text" name="USERNAME" hidden/>
                <input type="submit" onclick="storeme()" value="Past Orders"></form></a></div>
        
      </div>
    </div>
    <a href="login.jsp" class="w3-padding-large w3-hover-red w3-hide-small w3-right">LOGOUT</a>
    <a href="javascript:void(0)" class="w3-padding-large w3-hover-red w3-hide-small w3-right"><i class="fa fa-search"></i></a>
  </div>
</div>

<!-- Navbar on small screens (remove the onclick attribute if you want the navbar to always show on top of the content when clicking on the links) -->
<div id="navDemo" class="w3-bar-block w3-black w3-hide w3-hide-large w3-hide-medium w3-top" style="margin-top:46px">

</div>

<script>
   //document.getElementById('USERNAME').innerhtml = localStorage.getItem('username');
        //document.getElementById('USERNAME').value = localStorage.getItem('username');
        function storeme(){
          document.getElementById('USERNAME').value = localStorage.getItem('username');
          document.getElementById('SUMMERFUELPRICE').value = localStorage.getItem('summer');
          document.getElementById('WINTERFUELPRICE').value = localStorage.getItem('winter');
          document.getElementById('TXCOST').value = localStorage.getItem('txcost');
          document.getElementById('OTHERCOST').value = localStorage.getItem('othercost');
          document.getElementById('DISCOUNT').value = localStorage.getItem('discount');
        }
        //
</script>


  
  
<!-- End Page Content -->
</div>


<!-- Footer -->
<footer class="w3-container w3-padding-64 w3-center w3-opacity w3-light-grey w3-xlarge">
    <i class="fa fa-facebook-official w3-hover-opacity"></i>
  <i class="fa fa-instagram w3-hover-opacity"></i>
  <i class="fa fa-snapchat w3-hover-opacity"></i>
  <i class="fa fa-pinterest-p w3-hover-opacity"></i>
  <i class="fa fa-twitter w3-hover-opacity"></i>
  <i class="fa fa-linkedin w3-hover-opacity"></i>
  <p class="w3-medium">Powered by <a href="https://www.w3schools.com/w3css/default.asp" target="_blank">fuel.org</a></p>
</footer>

<script>
   //document.getElementById('USERNAME').innerhtml = localStorage.getItem('username');
        //document.getElementById('USERNAME').value = localStorage.getItem('username');
        function storeme(){
          document.getElementById('USERNAME').value = localStorage.getItem('username');
          document.getElementById('SUMMERFUELPRICE').value = localStorage.getItem('summer');
          document.getElementById('WINTERFUELPRICE').value = localStorage.getItem('winter');
          document.getElementById('TXCOST').value = localStorage.getItem('txcost');
          document.getElementById('OTHERCOST').value = localStorage.getItem('othercost');
          document.getElementById('DISCOUNT').value = localStorage.getItem('discount');
        }
        //
</script>

</body>
</html>


