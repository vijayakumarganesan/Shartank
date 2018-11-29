<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RENT AND TOLL</title>
</head>
<body align="center" bgcolor="#59F87F">
<h1>PSNA BUS MAINTANANCE SYTEM</h1>
<h1 align="center">RENT REGISTRAION</h1>
<form action="RentServlet" method="post">
DATE:<input type="text" name="date"><br>
BUS NUMBER:<input type="text" name="busnumber"><br>
PLACE:<input type="text" name="place"><br>
RENT AMOUNT<input type="text" name="rentamount"><br>
TOLL AMOUNT<input type="text" name="tollamount">
<input type="submit" name="Register">
</body>
</html>