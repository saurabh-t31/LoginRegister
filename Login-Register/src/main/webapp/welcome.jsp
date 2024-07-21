<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
<%
HttpSession session1 = request.getSession();

String username = (String) session1.getAttribute("username");
%>
<h1>Hello Welcome to Welcome Page ,<%= username  %></h1>

<a href="logout"> LOGOUT </a>
</body>
</html>