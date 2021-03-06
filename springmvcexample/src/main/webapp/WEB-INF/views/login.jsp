<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%-- <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style.css"/> --%>
<script type="text/javascript">
	function field_focus(field, email) {
		if (field.value == email) {
			field.value = '';
		}
	}

	function field_blur(field, email) {
		if (field.value == '') {
			field.value = email;
		}
	}

	//Fade in dashboard box
	$(document).ready(function() {
		$('.box').hide().fadeIn(1000);
	});

	//Stop click event
	$('a').click(function(event) {
		event.preventDefault();
	});
</script>

<style type="text/css">
body {
	font-family: 'Open Sans', sans-serif;
	background: #3498db;
	margin: 0 auto 0 auto;
	width: 100%;
	text-align: center;
	margin: 20px 0px 20px 0px;
}

p {
	font-size: 12px;
	text-decoration: none;
	color: #ffffff;
}

h1 {
	font-size: 1.5em;
	color: #525252;
}

.box {
	background: white;
	width: 300px;
	border-radius: 6px;
	margin: 150px auto 0 auto;
	padding: 0px 0px 70px 0px;
	border: #2980b9 4px solid;
}

.fields {
	background: #ecf0f1;
	border: #ccc 1px solid;
	border-bottom: #ccc 2px solid;
	padding: 8px;
	width: 250px;
	color: #AAAAAA;
	margin-top: 10px;
	font-size: 1em;
	border-radius: 4px;
}

.password {
	border-radius: 4px;
	background: #ecf0f1;
	border: #ccc 1px solid;
	padding: 8px;
	width: 250px;
	font-size: 1em;
}

.btn {
	background: #2ecc71;
	width: 125px;
	padding-top: 5px;
	padding-bottom: 5px;
	color: white;
	border-radius: 4px;
	border: #27ae60 1px solid;
	margin-top: 20px;
	margin-bottom: 20px;
	float: left;
	margin-left: 16px;
	font-weight: 800;
	font-size: 0.8em;
}

.btn:hover {
	background: #2CC06B;
}

.btn2 {
	float: left;
	background: #3498db;
	width: 125px;
	padding-top: 5px;
	padding-bottom: 5px;
	color: white;
	border-radius: 4px;
	border: #2980b9 1px solid;
	margin-top: 20px;
	margin-bottom: 20px;
	margin-left: 10px;
	font-weight: 800;
	font-size: 0.8em;
}

.btn2:hover {
	background: #3594D2;
}
</style>
</head>
<body>
	<form id="loginForm" modelAttribute="login" action="loginProcess" method="post">
	<!-- <link href='https://fonts.googleapis.com/css?family=Open+Sans:700,600'
		rel='stylesheet' type='text/css' /> -->
		<div class="box">
			<h1>Login</h1>
			<div style="color:red">${message}</div>
			 <input type="text" name="userName" value="User Name" path="userName"
				onFocus="field_focus(this, 'User Name');"
				onblur="field_blur(this, 'User Name');" class="fields" /> 
			
			 <input type="password" name="password" value="password" path="password"
				onFocus="field_focus(this, 'password');"
				onblur="field_blur(this, 'password');" class="fields" /> 
				
			<input type="submit" id="signIn" name="login" class="btn" value="Sign In" /> 
			<input type="submit" id="signup" name="signup" class="btn2" value="Sign Up" /> 
				
			<!-- <a href="#"><div class="btn">Sign In</div></a> 
			<a href="#"><div id="btn2">Sign Up</div></a> -->
		</div>
	</form>

	<p>
		Forgot your password? <u style="color: #f1c40f;">Click Here!</u>
	</p>

	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"
		type="text/javascript"></script>

</body>
</html>