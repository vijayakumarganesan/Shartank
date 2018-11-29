<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center" pgcolor="#59F87F">
<h1 align="center">TYRE REGISTRATION</h1>
<form action="TyreServlet" method="post">
DATE :<input type="text" name="date" /> <br>
BUS NUMBER:<input type="text" name="busnumber" /> <br>
POSITION OF TYER: <select name="position">
<option value="Front Right">Front Right</option>
<option value="Front Left">Front Left</option>
<option value="Back Right First">Back Right First</option>
<option value="Back Right Second">Back Right Second</option>
<option value="Back Left First">Back Right First</option>
<option value="Back Left Second">Back Left Second</option>
</select><br>
WORK DETAIL:<input type="text" name="workdetail" /><br>
STORE NAME:<input type="text" name="storename" /><br>
AMOUNT:<input type="text" name="amount" /><br> 
<input type="submit" value="REGISTER" />
</body>
</html>