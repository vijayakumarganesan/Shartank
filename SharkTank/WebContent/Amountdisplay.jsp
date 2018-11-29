<%@ page language="java" import="connectionpackage.*,servletpackage.*,java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>sharktankdisplay</title>
</head>
<body bgcolor="#4CAF50">
<center>
<h1>SHARKTANK DISPLAY DETAILS</h1>
<%
ArrayList mylist1=(ArrayList) request.getAttribute("mylist");
for(int i=0;i<mylist1.size();i++){
	Amount s1 = (Amount) mylist1.get(i);
%>
<table border='2'>
<tr><th>Row</th><th>Season</th><th>Series</th><th></th><th>Company</th><th>Deal</th><th>Industry</th><th>Gender</th><th>Amount</th><th>Equity</th></tr>
<tr>
<td><%=s1.getRow() %></td>
<td><%=s1.getSeason() %></td>
<td><%=s1.getSeries() %></td>
<td><%=s1.getCompany()%></td>
<td><%=s1.getDeal() %></td>
<td><%=s1.getIndustory() %></td>
<td><%=s1.getGender() %></td>
<td><%=s1.getAmount() %></td>
<td><%=s1.getEquity() %></td>
</tr>
</table>
<%} %>
</center>

</body>
</html>