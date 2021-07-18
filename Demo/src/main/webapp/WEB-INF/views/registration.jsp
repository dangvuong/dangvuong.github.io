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
<form:form method = "POST" action ="/registration" modelAddtribute ="registration">
	<label>Username : </label>
	<input type ="text" id = "userName" name ="userName"><br>
	<label>Passord : </label>
	<input type ="password" id ="passWord" name ="passWord"><br>
	<label> Địa Chỉ : </label>
	<input type ="text" id ="diaChi" name ="diaChi"><br>
	<label> Số Điện Thoại : </label>
	<input type ="text" id = "soDienThoai" name ="soDienThoai"><br>
	<input type ="submit" value ="Registration"><br>
	<span>${username}</span>
	<span>${Username} </span>
		
</form:form>
</body>
</html>