<%@ page language="java" import="connectionpackage.*,servletpackage.*,java.util.ArrayList" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList mylist1=(ArrayList) request.getAttribute("rtolist");
for(int i=0;i<mylist1.size();i++){
	Rto r1 = (Rto) mylist1.get(i);
	

%>
<table border='2'>
<tr><th>DATE</th><th>BUSNUMBER</th><th>Work Description</th><th>AMOUNT</th><th>AMOUNT TYPE</th></tr>
<tr>
<td><%=r1.getDate()%></td>
<td><%=r1.getBusnumber() %></td>
<td><%=r1.getDescription()%></td>
<td><%=r1.getAmount()%></td>
<td><%=r1.getAmounttype()%></td>
</tr>
</table>
<%
}
%>

</body>
</html>