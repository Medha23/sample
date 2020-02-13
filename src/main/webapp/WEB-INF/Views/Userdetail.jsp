<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#ffffcc">

${payment}
	<form action="payment.jsp" method="get">
		<TABLE style="background-color: #ECE5B6;" WIDTH="50%">
			<tr width="100%">
				<td>Rental Detail</td>
				
			</tr>

			<%--  <c:forEach items="${carList}" var="item"> --%>

			<tr>
				<td width="20%">Car Models</td>
				<td width="25%"><input type="radio" name="car_model"
					value="Mini">Mini</td>
				<td width="30%"><input type="radio" name="car_model"
					value="Micro">Micro</td>
				<td width="25%"><input type="radio" name="car_model"
					value="Prime">Prime</td>
			</tr>
			<tr>
				<td>Driver</td>
				<td><input type="radio" name="driverenum" value="With Driver">With
					Driver</td>
				<td><input type="radio" name="driverenum"
					value="Without Driver"> Without Driver</td>

			</tr>
			<tr>
				<td>Location

				<select name="Source">
				<option value="city">Source</option>
					<option value="city">Pune</option>
					<option value="city">Mumbai</option>
					<option value="city">Bangalore</option> 
					<option value="city">Delhi</option> 
					<option value="city">chennai</option> 
				</select>
				
				
				<select name="Destination">
				<option value="city">Destination</option>
					<option value="city">Pune</option>
					<option value="city">Mumbai</option>
					<option value="city">Bangalore</option> 
					<option value="city">Delhi</option> 
					<option value="city">chennai</option> 
				</select>


				<!-- <td><input type="radio" name="course" value="Regular" checked>
					Regular</td>
				<td><input type="radio" name="course" value="Correspondance">
					Correspondance</td>
				<td><input type="radio" name="course" value="Online">
			</td>		Online</td> -->
			</td>
			
			<tr>
			<td>
			<jsp:include page="submit.jsp"/>
			</td>
			</tr>
			
			</tr>
			<!-- <tr>

				<td><input type="submit" name="submit" value="submit"></td>
			</tr> -->
			
			
			
			
			
		</TABLE>
	</form>





</body>


</html>