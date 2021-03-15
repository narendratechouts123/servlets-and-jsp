<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="myerrors.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 
String driver=application.getInitParameter("driver");
 
String url=application.getInitParameter("url");
String username=application.getInitParameter("username");
String password=application.getInitParameter("password");
 
  %>   
 <br>
<%
Class.forName(driver);
Connection con=DriverManager.getConnection(url,username,password);
out.println("connection is"+con);
 

%>
</body>
</html>