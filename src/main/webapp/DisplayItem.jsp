<%@page import="com.ty.stock.dto.Item"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Item> items=(List<Item>)request.getAttribute("myItem");
%>
<table border="1">
	<tr>
		<th>ID</th>
		<th>Name</th>
	    <th>Brand</th>
		<th>Cost</th>
		<th>Type</th>
		<th>Quantity</th>
		<th>Delete</th>
		<th>Edit</th>
	</tr>
<% 
	
	for(Item item : items) 
	{
			%>
			
			<tr>
				<td><%=item.getId() %></td>
				<td><%=item.getName() %></td>
				<td><%=item.getBrand() %></td>
				<td><%=item.getType() %></td>
				<td><%=item.getCost() %></td>
				<td><%=item.getQuantity() %></td>
				<td>
					<a href="delete?id=<%=item.getId() %>">Delete</a>
				</td>
				<td>
					<a href="get?id=<%=item.getId() %>">Edit</a>
				</td>
			</tr>
			
<%
		}
%>
	
	
</table>
</body>
</html>