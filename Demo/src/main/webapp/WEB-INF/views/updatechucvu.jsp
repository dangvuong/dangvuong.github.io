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
<form:form method="POST" action ="/updatechucvu" modelAddtribute ="updatechucvu">
	<label>ID</label>
	<input type ="text" name = "id" value = "${updatechucvu.id }"><br>
	<label>Tên Chức Vụ : </label>
	<input type ="text" name ="tenChucVu" value ="${updatechucvu.tenChucVu}"><br>
	<label>Mã Chức Vụ : </label>
	<input type ="text" name ="maChucVu" value = "${updatechucvu.maChucVu}"><br>
	<label>Chuyên Môn :</label>
	<input type ="text" name ="chuyenMon" value ="${updatechucvu.chuyenMon}"><br>
	<input type ="submit" value ="save"> 
</form:form>
</body>
</html>