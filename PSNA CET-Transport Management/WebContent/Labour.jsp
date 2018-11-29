<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center" bgcolor="#59F87F">
<h1>PSNA BUS MAINTANANCE SYSTEM</h1>
<h1>LABOUR REGISTRATION</h1>
<form action="LabourServlet " method="post">
DATE :<input type="text" name="date" /><br>
BUS NUMBER:<input type="text" name="busnumber" /><br>
WORK DESCRIPTIION:<input type="text" name="workdescription" /><br>
WORKSHOP NAME:<input type="text" name="workshopname" /><br>
AMOUNT:<input type="text" name="amount" /><br>
<input type="submit" value="REGISTER" />
</form>

</body>
</html>