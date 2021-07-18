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
<form:form method ="POST" action ="/addnhansu" modelAddtribute ="nhansu">
<label>Tên Nhân Sự : </label>
<input type ="text" id ="tenNhanSu" name ="tenNhanSu"><br>
<label>Năm Sinh : </label>
<input type ="text" id ="namSinh" name ="namSinh"><br>
<label>Chứng Minh Nhân Dân : </label>
<input type ="text" id ="cmnd" name ="cmnd"><br>
<label>Địa chỉ : </label>
<input type ="text" id ="diaChi" name ="diaChi"><br>
<label>Ngày Bắt Đầu : </label>
<input type ="text" id ="ngayBatDau" name ="ngayBatDau"><br>
<label>Ngày Nghỉ Việc : </label>
<input type ="text" id ="ngayNghiViec" name ="nagyNghiViec"><br>
<label>Trình Độ : </label>
<input type ="text" id ="trinhDo" name ="trinhDo"><br>
<label>Ngoại Ngữ : </label>
<input type ="text" id ="ngoaiNgu" name ="ngoaiNgu"><br>
<label>Tin Học: </label>
<input type ="text" id ="tinHoc" name ="tinHoc"><br>
<label>Thành Tích : </label>
<input type ="text" id ="thanhTich" name ="thanhTich"><br>
<label>Phòng Ban ID : </label>
<select name="phongbanid" id="phongbanid">
    <option value="1">CNTT</option>
    <option value="3">TCnguyen</option>
    <option value="5">Kế toán</option>  
  </select><br>

<label>Chức Vụ Id : </label> 
<select name="chucvuid" id="chucvuid">
    <option value="1">nhan vien</option>
    <option value="2">trương phong</option>
    <option value="3">Kế toán</option>
    <option value="7">Audi</option>
  
    <option value="8">kế toan tong hop</option>
    <option value="9">ban hang</option>
    
  </select><br>

<input type = "submit" value ="Save" >

</form:form>
</body>
</html>