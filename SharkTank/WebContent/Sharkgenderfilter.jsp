<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SharkAmoutFilter</title>
<h1 align="center">Shark Tank filter form</h1>
</head>
<body bg color="#4CAF50">
<center>
<p>A user of this web platform, should be able to filter the results/companies by season, investor,
investment amount, entrepreneur gender etc</p>
<form action="GenderFilter" method="post">
ENTER GENDER OF INVERSTORS:<select name="gender">
<option name="Male">Male</option>
<option name="Female">Female</option>
</select>
<input type="submit" value="filter">
</form>
</center>
</body>
</html>