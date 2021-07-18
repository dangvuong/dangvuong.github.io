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
<form:form method="POST" action = "/updatephongban" modelAddtribute="updatephongban">
<label>ID</label>
	<input type ="text" name = "id" value = "${updatephongban.id }"><br>
<label>Tên Phòng ban : </label>
<input type ="text" name = "tenPhongBan" value= "${updatephongban.tenPhongBan}"><br>
<label>Mã Phòng Ban : </label>
<input type = "text" name = "maPhongBan" value= "${updatephongban.maPhongBan}"><br>	
<label>Số Điện Thoại</label>
<input type = "text" name = "soDienThoai" value= "${updatephongban.soDienThoai}"><br>
<input type = "submit" value = "Update">

</form:form>
</body>
</html>