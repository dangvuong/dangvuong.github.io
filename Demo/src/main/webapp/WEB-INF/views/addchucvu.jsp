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
<form:form method ="POST" action ="/addchucvu" modelAddtribute ="chucvu">
	<label>Tên Chức Vụ : </label>
	<input type = "text" id ="tenChucVu" name ="tenChucVu"><br>
	<label>Mã Chức Vụ : </label>
	<input type ="text" id ="maChucVu" name ="maChucVu"><br>
	<label>Chuyên Môn</label>
	<input type ="text" id = "chuyenMon" name ="chuyenMon"><br>
	<input type ="submit" value ="Add">
	
</form:form>
</body>
</html>