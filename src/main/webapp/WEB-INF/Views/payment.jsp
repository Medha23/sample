<%@page import="com.example.demo.entity.RentalEntity"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>/Your final payment is</title>
</head>
<body>


<%@page import="com.example.demo.controller.RentalController"%>

<%
RentalEntity rentalEntity=new RentalEntity();
new RentalController().onSubmit2(rentalEntity);
System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
%>



<p>payment done</p>
</body>
</html>