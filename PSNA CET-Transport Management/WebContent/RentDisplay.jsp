<%@ page language="java"import="connectionpackage.*,servletpackage.*,java.util.ArrayList" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
ArrayList mylist1=(ArrayList) request.getAttribute("rentlist");
for(int i=0;i<mylist1.size();i++){
	    	Rent r1 = (Rent) mylist1.get(i);
	    
	    	
%>
<table border='2'>
<tr><th>DATE</th><th>BUSNUMBER</th><th>PLACE</th><th>RENTAMOUNT</th><th>TOTAL AMOUNT</th></tr>
<tr>
<td><%=r1.getDate() %></td>
<td><%=r1.getBusnumber() %></td>
<td><%=r1.getPlace() %></td>
<td><%=r1.getRentamount() %></td>
<td><%=r1.getTollamount() %></td>
</tr>
</table>
<%
}
%>

</body>
</html>