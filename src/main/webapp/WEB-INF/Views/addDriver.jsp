<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.example.demo.enums.DriverEnum" %> 
  <%@ page import="com.example.demo.entity.Driver" %> 
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Driver Details</title>
</head>
<body>
    <form:form method = "post" action = "addDriver">
   
   <div>
   <form:errors></form:errors>
   </div>
   <div>
   <label>Driver Id</label>
     <form:input path="driverId"/>
      </div>
       <div>
   <label>Driver Name</label>
    <form:input path="driverName"/>
    </div>
     <div>
   <label>Driver MobileNo</label>
    <form:input path="driverMobile"/>
    </div>
   
   
   <div>
   <label>Driver Address</label>
    <form:input path="driverAddress"/>
    </div>
   
     <div>
   <label>Driver Email</label>
     <form:input path="driverEmail"/>
      </div>
      
       <div>
   <label>Driver Price</label>
    <form:input path="driverPrice"/>
    </div>
    
     <div>
     
   <label>Driver Rating</label>
    <form:input path="rating"/>
    </div>
  
   

     <div>
      <input type="submit" value="Add">
      </div>
     
    </form:form>
</body>
</html>