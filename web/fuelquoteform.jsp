<%-- 
    Document   : accessTable
    Created on : Nov 29, 2018, 9:44:47 PM
    Author     : Admin
--%>


<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>


<%
    try{
     String url = "jdbc:oracle:thin:@129.7.240.3:1521:ORCL";
        Class.forName ("oracle.jdbc.driver.OracleDriver"); 
// Establish connection //
Connection conn = DriverManager.getConnection(url, "SUNESARAF", "SUNESARAF1");
Statement statement = conn.createStatement ();             
ResultSet resultset = statement.executeQuery ("select * from SEASONALFLUCTUATION");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> <% while (resultset.next()) {%><hr>
        <div>
            <jsp:declaration>
            String summer = "";
            String winter = "";
            </jsp:declaration>
            
            <jsp:scriptlet>
            summer = resultset.getString(1);
            winter = resultset.getString(2);
            
            
            </jsp:scriptlet>

              
           <script>
            var summer = <%= resultset.getString(1) %>;
            localStorage.setItem("summer", summer);
            var winter = <%= resultset.getString(2) %>;
            localStorage.setItem("winter", winter);
        </script>
        <div>
            <% }%>
        
        </table>
    </body>

<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>

<% }catch(Exception e){
out.println("try again!");
}
%>


<% try{
     String url = "jdbc:oracle:thin:@129.7.240.3:1521:ORCL";
        Class.forName ("oracle.jdbc.driver.OracleDriver"); 
// Establish connection //
Connection conn = DriverManager.getConnection(url, "SUNESARAF", "SUNESARAF1");
Statement statements = conn.createStatement ();             
ResultSet resultsets = statements.executeQuery ("select * from TRANSPORTATION");
%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>  <% while (resultsets.next()) {%>       <hr>
        <div>
            <jsp:declaration>
            String txcost = "";
            String othercost = "";
            </jsp:declaration>
            
            <jsp:scriptlet>
            txcost = resultsets.getString(1);
            othercost = resultsets.getString(2);
            
            
            </jsp:scriptlet>

           <script>
            var txcost = <%= resultsets.getString(1) %>;
            localStorage.setItem("txcost", txcost);
            var othercost = <%= resultsets.getString(2) %>;
            localStorage.setItem("othercost", othercost);
        </script>
        <div>
            <% }%>
        
        </table>
    </body>
    
    <% }catch(Exception e){
out.println("try again!");
}
%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
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
    <div id="header">

            <center>
        <h2> Fuel Quote Form </h2> </center>
        </div>
        <div id="sidemenu">
            <form action="fuelquote.jsp" method="post">  
<input id="USERNAME" type="text" name="USERNAME" hidden/><input id="SUMMERFUELPRICE" type="text" name="SUMMERFUELPRICE" hidden/><input id="WINTERFUELPRICE" type="text" name="WINTERFUELPRICE" hidden/>
<input id="TXCOST" type="text" name="TXCOST" hidden/><input id="OTHERCOST" type="text" name="OTHERCOST" hidden/>
              <input id="DISCOUNT" type="text" name="DISCOUNT" hidden/>

              <center>Full Name:<input type="text" name="CLIENTNAME"/><br/><br/></center> 
<center>Address:           <input type="text" name="CLIENTSTREET"/><br/><br/></center>
<center>City:              <input type="text" name="CLIENTCITY"/><br/><br/></center>
<center>State:             <input type="text" name="CLIENTSTATE"/><br/><br/></center>
<center>Zipcode:           <input type="text" name="CLIENTZIPCODE"/><br/><br/></center>
<center>Gallons Requested: <input type="text" name="GALLONSREQUESTED"/><br/><br/></center>
<center>Day:               <input type="text" name="DAY"/><br/><br/></center>
<center>Month:             <input type="text" name="MONTH"/><br/><br/></center>
<center>Year:              <input type="text" name="YEAR"/><br/><br/></center>

<center><input  type="submit" onclick="storeme()" value="SUBMIT"/> </center>
 
</form>  
         
        </div>   
    </body>
    
    
    
    ---------------------------------------------------------------------------------------
    
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
    <a href="#" class="w3-bar-item w3-button w3-padding-large">HOME</a>
    <a href="#band" class="w3-bar-item w3-button w3-padding-large w3-hide-small">ABOUT US</a>
    <a href="#tour" class="w3-bar-item w3-button w3-padding-large w3-hide-small">CONTACT</a>
    
    <div class="w3-dropdown-hover w3-hide-small">
      <button class="w3-padding-large w3-button" title="More">ORDER<i class="fa fa-caret-down"></i></button>     
      <div class="w3-dropdown-content w3-bar-block w3-card-4">
        <a href="fuelquoteform.jsp" class="w3-bar-item w3-button">Fuel Quote</a>
        <div class="loginbox">
        <a class="w3-bar-item w3-button">  <form  class="w3-bar-item w3-botton" action="fuelquotehistory.jsp" method="post"> 
                <input id="USERNAME" type="text" name="USERNAME" hidden/>
                <input type="submit" onclick="storeme()" value="Past Orders"></form></a></div>
        
      </div>
    </div>
    <a href="#" class="w3-bar-item w3-button w3-padding-large w3-hide-small">LOGOUT</a>
    <a href="javascript:void(0)" class="w3-padding-large w3-hover-red w3-hide-small w3-right"><i class="fa fa-search"></i></a>
  </div>
</div>

<!-- Navbar on small screens (remove the onclick attribute if you want the navbar to always show on top of the content when clicking on the links) -->
<div id="navDemo" class="w3-bar-block w3-black w3-hide w3-hide-large w3-hide-medium w3-top" style="margin-top:46px">
  <a href="#band" class="w3-bar-item w3-button w3-padding-large" onclick="myFunction()">BAND</a>
  <a href="#tour" class="w3-bar-item w3-button w3-padding-large" onclick="myFunction()">TOUR</a>
  <a href="#contact" class="w3-bar-item w3-button w3-padding-large" onclick="myFunction()">CONTACT</a>
  <a href="#" class="w3-bar-item w3-button w3-padding-large" onclick="myFunction()">MERCH</a>
</div>






<!-- Ticket Modal -->
  <div id="ticketModal" class="w3-modal">
   <div class="w3-container w3-content w3-padding-64" style="max-width:800px" id="contact">
    <h2 class="w3-wide w3-center">CONTACT</h2>
    
      <div class="w3-col m6">
        <form action="fuelquote.jsp" method="post">
          
             Full Name: <input class="w3-input w3-border" type="text" placeholder="" required name="CLIENTNAME">
             Address:  <input class="w3-input w3-border" type="text" placeholder="" required name="CLIENTSTREET">
             City:  <input class="w3-input w3-border" type="text" placeholder="" required name="CLIENTCITY"> 
              
             <div class="w3-row-padding" style="margin:0 -16px 8px -16px"> 
            <div class="w3-half">
             State: <input class="w3-input w3-border" type="text" placeholder="" required name="CLIENTSTATE">
            </div>
            <div class="w3-half">
             Zipcode: <input class="w3-input w3-border" type="text" placeholder="" required name="CLIENTZICODE">
            </div>
          </div>
            Gallons Requested: <input class="w3-input w3-border" type="text" placeholder="Message" required name="GALLONSREQUESTED">
          <div class="w3-row-padding" style="margin:0 -16px 8px -16px"> 
            <div class="w3-half">
             Day: <input class="w3-input w3-border" type="text" placeholder="" required name="DAY">
            </div>
            <div class="w3-half">
             Month: <input class="w3-input w3-border" type="text" placeholder="" required name="MONTH">
            </div>
             
            <div class="w3-half">
             Year: <input class="w3-input w3-border" type="text" placeholder="" required name="YEAR">
            </div>
          </div>
          <button class="w3-button w3-black w3-section w3-right" onclick="storeme()" type="submit">SEND</button>
        </form>
      </div>
    </div>
  </div>
  </div>
  
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
