<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta  http-equiv= "Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<style>
	table{
	border-collapse: collapse
	}

</style>
</head>
<body>
   <h1>Sporty Shoes Home Page </h1>
   <c:choose>
   <c:when test="${ilist.size()>0}">
   <h2>Available Items</h2>
   <table border="1">
   <tr><td>Id</td><td>Name</td><td>Price</td><td>Category</td><td>Quantity</td></tr>
	<c:forEach var="itm" items="${ilist}">
	<tr><td>${itm.id}</td><td>${itm.name}</td><td>${itm.price}</td><td>${itm.category}</td><td>${itm.quantity}</td></tr>
     </c:forEach>
   </table>
   </c:when>
   <c:otherwise>
     <h3> No Items where found</h3>
   </c:otherwise>
   </c:choose>
   <form:form action="placeOrder.obj" modelAttribute="sitem">
   Enter item ID: <form:input path="id" type="text" value=""/>
   <input type="submit" value="Place Order">
   </form:form>
</body>
</html>