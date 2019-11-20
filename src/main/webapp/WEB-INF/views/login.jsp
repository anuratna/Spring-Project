<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<font color="red">${errorMessage}</font>
<font color="red">${Message}</font>
<form action="loginValidate" method="post" modelAttribute="logincredentials" >
      <table>
        <tr>
          <td>Enter User Name</td>
          <td><input id="userName" name="userName"></td>
          </tr>
        <tr>                        
          <td>Enter Password</td>
          <td><input id="password" name="password"></td>
          <td><input type="submit" value="submit"></td>
        </tr>
        <tr>
        <td><a href="${path}/signUpPage">Sign up</a></td>
        </tr>
        
      </table>
    </form>
</body>
</html>