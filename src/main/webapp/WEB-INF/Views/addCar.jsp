<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car Rental Agency</title>
</head>
<body>


<div class="col-md-6">
    <form:form method="post" action="addCar">
   <form:errors></form:errors>
   <div class="form-group">
   <label>Car ID</label>
    <form:input path="car_id" cssClass="form-control"/>
    </div>
    
     <div class="form-group">
   <label>Car Model</label>
     <form:input path="car_model" cssClass="form-control"/>
      </div>
      
       <div class="form-group">
   <label>Car Price</label>
     <form:input path="car_Price" cssClass="form-control"/>
      </div>
   
     <div> 
      <input type="submit" value="add">
      </div>
      
    </form:form>
    </div>
</body>
</html>