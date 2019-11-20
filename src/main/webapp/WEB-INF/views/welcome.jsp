<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Boot</title>
</head>
<body>
  <h1>Welcome</h1>
  <hr>
  <table>
  <tr>
  <td>
  <h2>${loginUserDetails.userName}</h2></td>
  </tr>
  <tr>
  <td>
  <h2>${loginUserDetails.password}</h2>
  </td>
  </tr>
  <tr>
  <td><h2>${loginUserDetails.dateOfBirth}</h2>
  </td>
  </tr>
  <tr>
  <td><h2>${loginUserDetails.firstName}</h2>
  </td>
  </tr>
  <tr>
  <td><h2>${loginUserDetails.lastName}</h2>
  </td>
  </tr>
  
  <tr>
  <td>
  <a href="delete?name=${loginUserDetails.userName}">Delete</a></td>	
  <td><a href="edit?name=${loginUserDetails.userName}">Edit</a></td>
                
  </tr>
  </table>
</body>
</html>