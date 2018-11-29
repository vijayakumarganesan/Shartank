<%@ page language="java" import="connectionpackage.*,servletpackage.*,java.util.ArrayList" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>TYRE DETAILES</h1>
<%
ArrayList mylist4=(ArrayList) request.getAttribute("tyrelist");
for(int i=0;i<mylist4.size();i++)
{
	       Tyre t1 = (Tyre) mylist4.get(i);	       	       
%>
<table border='2'>
<tr><th>DATE</th><th>BUSNUMBER</th><th>POSITION</th><th>WORKDETAIL</th><th>STORENAME</th><th>AMOUNT</th></tr>
<tr>
<td><%=t1.getDate() %></td>
<td><%=t1.getBusnumber() %></td>
<td><%=t1.getPosition() %></td>
<td><%=t1.getWorkdetail() %></td>
<td><%=t1.getStorename() %></td>
<td><%=t1.getAmount() %></td>
</tr>
</table>
<%
}
%>
</body>
</html>