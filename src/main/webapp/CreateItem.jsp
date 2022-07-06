<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="create">

Name :<input type="text" name="itemName"><br>
Cost:<input type="number" name="itemCost"><br>
Quantity:<input type="number" name="itemQuantity"><br>
<div>Brand: <select name="itemBrand">
<option value="Samsung">Samsung</option>
<option value="Oneplus">Oneplus</option>
<option value="MI">MI</option>
<option value="Lenovo">Lenovo</option>
</select ></div>


<div>Type: <select name="itemType">
<option value="Mobile">Mobile</option>
<option value="earphones">earphones</option>
<option value="Tv">Tv</option>
<option value="Laptap">Laptap</option>
</select ></div>

<input type="submit" value="submit">
</form>
</body>
</html>