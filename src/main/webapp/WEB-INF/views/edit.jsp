<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Details here</title>
</head>
<body>
<form action="editUserData" method="post" modelAttribute="updateDetails" >

<table border="1">
<tr style ="font-size: 13">
<td>First Name</td>
<td>Last Name</td>
<td>DOB</td>
<td>user Name</td>
<td>Password </td>
</tr>

<tr style="font-size: 10">
<input type="hidden" id="id" name="id" value ="${details.id}">
  <td><input type="text" id="firstName" name="firstName" value ="${details.firstName}"></td>
  <td><input type="text" id="lastName" name="lastName" value ="${details.lastName}"></td>
  <td><input type="text" id="dateOfBirth" name="dateOfBirth" value ="${details.dateOfBirth}"></td>
  <td><input type="text" id="userName" name="userName" value ="${details.userName}" readonly="readonly"></td>
  <td><input type="text" id="password" name="password" value ="${details.password}"></td>
  <td><input type="submit" value="update"></td>
</tr>

</table>

</form>


</body>
</html>