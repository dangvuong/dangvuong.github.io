<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method = "POST" action ="/login" modelAddtribute ="login">
	<label>Username : </label>
	<input type ="text" id = "username" name = "username" ><br>
	<label>Password : </label>
	<input type = "password" id ="passWord" name = "passWord"><br>
	<input type ="submit" value ="Login">
	<span>${error}</span>
</form:form>
</body>
</html>