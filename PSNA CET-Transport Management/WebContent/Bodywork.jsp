<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center" pgcolor="#59F87F">
<h1>PSNA BUS MAINTANANCE SYSTEM</h1>
<h1 align="center">BODY WORK REGISTRATION</h1>
<form action="BodyworkServlet" method="post">
DATE<input type="text" name="date"><br>
BUS NUMBER<input type="text" name="busnumber"><br>
DESCRIPTION<input type="text" name="description"><br>
AMOUNT<input type="text" name="amount"><br>
AMOUNT TYPE:<select name="amounttype" value="amounttype"><br>
<option value=dd>DD</option>
<option value=cash>Cash</option>
<option value=voucher>Voucher</option>
</select><br>
<input type="submit" name="Register">
</form>

</body>
</html>