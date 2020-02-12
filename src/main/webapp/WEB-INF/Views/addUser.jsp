<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SIGN-UP</title>
</head>
<body>
    <form:form method = "post" action = "addUser">
   
   <div>
   <form:errors></form:errors>
   </div>
   
   <div>
   <label>User Id</label>
    <form:input path="userId"/>
    </div>
   
     <div>
   <label>User Name</label> 
     <form:input path="userName"/>
      </div>
      
       <div>
   <label>User Contact</label>
     <form:input path="userMobile"/>
      </div>
   
    <div>
   <label>User Email</label>
     <form:input path="userEmail"/>
      </div>
      
       <div>
   <label>User Address</label>
     <form:input path="userAddress"/>
      </div>
   
     <div>
      <input type="submit" value="Add">
      </div>
     
    </form:form>
</body>
</html>