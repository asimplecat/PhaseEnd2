<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Thank you for logging in</title>
</head>
<body>
	<h1>Hi! welcome to your dashboard <%= session.getAttribute("uname") %></h1>
	<form method="post" action="LogoutServlet">
		<button type="submit">Logout</button>
	</form>
</body>
</html>