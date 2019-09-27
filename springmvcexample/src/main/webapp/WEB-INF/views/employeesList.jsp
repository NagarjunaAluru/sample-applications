<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<style type="text/css">
/* body {
  margin: 200px 0px 0px 500px;
} */
body {
    width: 90%;
    height: 85%;
    padding: 20px;
    border: 10px ridge black;
    text-align: center;
  }
</style>
	<title>Spring MVC</title>
</head>

<body>
	<div style="text-align: right; color :blue">
			Welcome: ${firstname} &nbsp;&nbsp; 
			<a href="${pageContext.servletContext.contextPath}" >Logout</a>
		</div>
	<h2>All Employees in System</h2>

	<table border="1" align="center">
		<tr>
			<th>Employee Id</th>
			<th>First Name</th>
			<th>Last Name</th>
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.firstName}</td>
				<td>${employee.lastName}</td>
			</tr>
		</c:forEach>
	</table>
<p>
<a href="${pageContext.servletContext.contextPath}" >Go Back</a>
</p>

</body>
</html>