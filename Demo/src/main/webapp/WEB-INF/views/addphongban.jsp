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
<form:form method="POST" action = "/addphongban" modelAddtribute="addphongban">

<label>Tên Phòng ban : </label>
<input type ="text" id = "tenPhongBan" name = "tenPhongBan"><br>
<label>Mã Phòng Ban : </label>
<input type = "text" id = "maPhongBan" name = "maPhongBan"><br>	
<label>Số Điện Thoại</label>
<input type = "text" id = "soDienThoai" name ="soDienThoai"><br>
<input type = "submit" value = "Add">

</form:form>

</body>
</html>