<html>
<head>
<title>Welcome</title>
<style type="text/css">
body {
    width: 90%;
    height: 85%;
    padding: 20px;
    border: 10px ridge black;
  }
</style>
</head>
<body>
	<br>
	<div style="text-align: right; color :blue">
		Welcome: ${firstname} &nbsp;&nbsp; 
		<a href="${pageContext.servletContext.contextPath}" >Logout</a>
	</div>
	<div style="text-align: center">
		<h2>
			Welcome to Employee Management System<br> <br>
		</h2>
		<h3>
			<a href="${pageContext.servletContext.contextPath}/employee/getAllEmployees">
			Click here to See Employee Details... </a>
			<br/>
		</h3>
	</div>
</body>
</html>