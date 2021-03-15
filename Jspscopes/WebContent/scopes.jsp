<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="javax.servlet.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

request.setAttribute("name", "request");
RequestDispatcher rd=request.getRequestDispatcher("req");
rd.forward(request, response);

%>
</body>
</html>