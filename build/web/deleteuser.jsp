<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    </head>
    <body style="background-color:white;">
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
            <div style="padding-top:90px;"></div>
                 
        <h2> DELETE USER </h2> </center>
        </div>
        <div id="sidemenu">
            <form action="delete.jsp" method="post">  
            
        <div style="padding-left:350px; padding-right:350px;">
            <div class="form-group"><b>Username:</b><input class="form-control" type="text" name="USERNAME" required/></div>
           
            
        </div><br><br>
<center><div class="form-group" style="padding-left:550px; padding-right:550px; padding-bottom: 100px"><input class="form-control" type="submit" style="background-color: green; color:white; " onclick="storeme()" value="SUBMIT"/></div></center>

</form>  
         
        </div>   
   
    </body>
    

   
    
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
    <a href="index.jsp" class="w3-bar-item w3-button w3-padding-large">HOME</a>
     <div class="w3-dropdown-hover w3-hide-small">
      <button class="w3-padding-large w3-button" title="More">RATES <i class="fa fa-caret-down"></i></button>     
      <div class="w3-dropdown-content w3-bar-block w3-card-4">
        <a href="seasonalfluction.jsp" class="w3-bar-item w3-button">Fuel Rates</a>
        <a href="transportation.jsp" class="w3-bar-item w3-button">Transportation Rates</a>
      </div>
    </div>
    <div class="w3-dropdown-hover w3-hide-small">
      <button class="w3-padding-large w3-button" title="More">USERS <i class="fa fa-caret-down"></i></button>     
      <div class="w3-dropdown-content w3-bar-block w3-card-4">
        <a href="accessTable.jsp" class="w3-bar-item w3-button">Current Users</a>
        <a href="adduser.jsp" class="w3-bar-item w3-button">Add Users</a>
        <a href="deleteuser.jsp" class="w3-bar-item w3-button">Delete Users</a>
      </div>
    </div>
    <a href="orders.jsp" class="w3-bar-item w3-button w3-padding-large w3-hide-small">ORDERS </a>
    <a href="#band" class="w3-bar-item w3-button w3-padding-large w3-hide-small">ABOUT US</a>
    <a href="#tour" class="w3-bar-item w3-button w3-padding-large w3-hide-small">CONTACT</a>
    
   
    <a href="login.jsp" class="w3-padding-large w3-hover-red w3-hide-small w3-right">LOGOUT</a>
    <a href="javascript:void(0)" class="w3-padding-large w3-hover-red w3-hide-small w3-right"><i class="fa fa-search"></i></a>
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









