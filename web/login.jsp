<%-- 
    Document   : index
    Created on : Nov 4, 2018, 4:34:41 PM
    Author     : fehrin
--%>

<head>
<title> LOGIN PAGE </title>
	<link rel = "stylesheet" type = "text/css" href = "style.css">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<body>
<style>
body{
	margin: 0;
	paddding: 0;
	background-image: url("black.jpg");
	background-size: cover;
	background-position: center;
	font-familt: sans-serif;
}
.loginbox{
	width: 320px;
	background: rgba(0,0,0,0.5);
	height: 480px;
	color: #fff;
	top: 50%;
	left: 50%;
	position: absolute;
	transform: translate(-50%, -50%);
	box-sizing: border-box;
        padding: 60px 30px;
}
.loginbox p{
	margin: 0;
	padding: 0;
	font-weight: bold;
}
.loginbox input{
	width: 100%;
	margin-bottom: 20px;
}
.loginbox input[type = "username"], input[type = "password"]
{
	border: none;
	border-bottom: 1px solid #fff;
	background: transparent;
	outline: none;
	height: 40px;
	color: lightgray;
	font-size: 13px;
}
.loginbox input[type = "submit"]
{
	border: none;
	outline: none;
	height: 40px;
	background: green;
	color: #fff;
	font-size: 18px;
	border-radius: 20px;
}
</style>
	<div class = "loginbox">
		<h1> LOGIN </h1>
		<form action="loginprocess.jsp" method="post">
                    <p>   </p>
			<p> Username </p>
			<input id="uname" type = "username" name= "username" placeholder = " " required>
			<p> Password</p>
			<input type = "password" name = "password" placeholder = " " required> <br>
                        <p>   </p>
                        <input type = "submit" style="background:white; color:black;"onclick="savepass()" name = "" value = "Sign In"> <br></form>
		<form action="adduser.jsp" method="post">
                <input type="submit" name = "" value = "Create Account"><br>
                </form>
	</div>
	<script>
            function savepass(){
                localStorage.setItem("username",(document.getElementById("uname").value));
            }
        </script>
	
</body>
</head>