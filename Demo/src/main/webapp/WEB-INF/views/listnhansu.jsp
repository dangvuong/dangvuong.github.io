<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="css/sb-admin-2.min.css" rel="stylesheet">
    <style type="text/css">
    .btn > a{
    	color:#ffff;
    }
    
    </style>
</head>
<body>
<div class="container">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <a class="navbar-brand" href="#">Quản Lý Nhân Sự</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="navbarNav">
	    <ul class="navbar-nav">
	      <li class="nav-item active">
	        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/listphongban">Danh Sách Phòng Ban</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/listchucvu">Danh Sách Chức Vụ</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/listnhansu">Danh Sách Nhân Sự</a>
	      </li>
	    </ul>
	  </div>
	</nav>
	
	<table class="table mt-2 table-striped table-bordered table-hover" >
		<thead>
			<tr>
				<th scope="col">ID</th>
				<th scope="col">Tên Nhân Sư </th>
				<th scope="col">Năm Sinh </th>
				<th scope="col">Chứng Minh Nhân Dân </th>
				<th scope="col">Địa Chỉ </th>
				<th scope="col">Ngày Bắt Đầu </th>
				<th scope="col">Ngày Nghỉ Việc </th>
				<th scope="col">Trình Độ</th>
				<th scope="col">Ngoại Ngữ</th>
				<th scope="col">Tin Học</th>
				<th scope="col">Thành Tích</th>
				<th scope="col">Phòng Ban</th>
				<th scope="col">Chức Vụ</th>
				<th scope="col"> </th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var ="ns" items = "${nhansu}">
			<tr>
				<td>${ns.id}</td>
				<td>${ns.tenNhanSu}</td>
				<td>${ns.namSinh}</td>
				<td>${ns.cmnd}</td>
				<td>${ns.diaChi}</td>
				<td>${ns.ngayBatDau}</td>
				<td>${ns.ngayNghiviec}</td>
				<td>${ns.trinhDo}</td>
				<td>${ns.ngoaiNgu}</td>
				<td>${ns.tinHoc}</td>
				<td>${ns.thanhTich}</td>
				<td>${ns.phongban.tenPhongBan}</td>
				<td>${ns.chucvu.tenChucVu}</td>
				<td> 
					<button type="button" class="btn btn-primary mb-1"><a href = "/addnhansu">Add</a></button>
					<button type="button" class="btn btn-secondary mb-1"><a href = "/updatenhansu/${ns.id}">Edit</a></button>
					<button type="button" class="btn btn-danger mb-1"><a href = "/deletenhansu/${ns.id}">Delete</a></button>
					<button type="button" class="btn btn-info" mb-1"><a href ="/viewnhansu/${ns.id}">View</a></button>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>	
	
</div>

</body>
</html>