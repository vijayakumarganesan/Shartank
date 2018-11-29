<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center" bgcolor"#59F87F">
<h1>PSNA BUS MAINTANANCE SYSTEM</h1>
<h1>BATTERY REGISTRATION</h1>
 <form action="BatteryServlet" method="post">
DATE<input type="text" name="date"><br>
BUS NUMBER<input type="text" name="busnumber"><br>
BATTERY DESCRIPTION:<input type="text" name="batterydescription"><br>
STORE NAME<input type="text" name="storename"><br>
AMOUNT<input type="text" name="amount"><br>
QUANTITY<input type="text" name="quantity"><br>
TOTAL AMOUNT<input type="text" name="totalamount"><br>
<input type="submit" name="Register">
</form>

</body>
</html>