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
ArrayList mylist3=(ArrayList) request.getAttribute("labourlist");
for(int i=0;i<mylist3.size();i++){
	    	Labour s1 = (Labour) mylist3.get(i);
	    
	    	
	   
%>
<table border='2'>
<tr><th>DATE</th><th>BUSNUMBER</th><th>POSITION</th><th>WORKDETAIL</th><th>STORENAME</th><th>AMOUNT</th></tr>
<tr>
<td><%=s1.getDate() %></td>
<td><%=s1.getBusnumber() %></td>
<td><%=s1.getWorkdescription() %></td>
<td><%=s1.getWorkshopname() %></td>
<td><%=s1.getAmount() %></td>

<%
}
%>
</tr>
</table>

</body>
</html>