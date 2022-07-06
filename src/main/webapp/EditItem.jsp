<%@page import="com.ty.stock.dto.Item"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ include file="Navbar.jsp" %>
<%Item item=(Item) request.getAttribute ("myItem");  %>
<h1>Edit Item</h1>

<form action="edit" >

Id :<input type="text" name="id" readonly="readonly" value="<%=item.getId() %>"><br>
Name :<input type="text" name="itemName" value="<%=item.getName() %>"><br>
Cost:<input type="number" name="itemCost" value="<%=item.getCost() %>"><br>
Quantity:<input type="number" name="itemQuantity" value="<%=item.getQuantity() %>"><br>
<div>Brand: <select name="itemBrand" value="<%=item.getBrand() %>">
<option value="Samsung">Samsung</option>
<option value="Oneplus">Oneplus</option>
<option value="MI">MI</option>
<option value="Lenovo">Lenovo</option>
</select ></div>


<div>Type: <select name="itemType" value="<%=item.getType() %>">
<option value="Mobile">Mobile</option>
<option value="earphones">earphones</option>
<option value="Tv">Tv</option>
<option value="Laptap">Laptap</option>
</select ></div>

<input type="submit" value="submit">
</form>
</body>
</html>