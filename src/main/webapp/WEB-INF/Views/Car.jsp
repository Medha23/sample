<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<thead>
<tr>
    <th>Car Name </th>
    <th>Car Price </th>
    
</tr>
</thead>
  <tbody>
  

     
     <c:forEach items="${carList}" var="item">
   
     <tr>
      
        <td> <c:out value="${item.car_model}"/></td>
        <td> <c:out value="${item.car_Price}"/></td>
       
     </tr>
     
         
     </c:forEach>

</tbody>
</table>
</body>
</html>