<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up Here !</title>
</head>
<body>
<form action="signUpUser" method="post" modelAttribute="signUpDetails" >

<table>
<tr>
  <td> Enter First Name : </td>
  <td><input id="firstName" name="firstName"></td>
</tr>
<tr>
  <td>Enter Last Name : </td>
  <td><input id="lastName" name="lastName"></td>
</tr>
<tr>
  <td>Enter DOB : </td>
  <td><input id="dateOfBirth" name="dateOfBirth"></td>
</tr>
<tr>
  <td>Enter User Name : </td>
  <td><input id="userName" name="userName"></td>
</tr>
<tr>
  <td>Enter Password : </td>
  <td><input id="password" name="password"></td>
</tr>
<tr>
  <td><input type="submit" value="submit"></td>
</tr>

</table>
</form>

</body>
</html>