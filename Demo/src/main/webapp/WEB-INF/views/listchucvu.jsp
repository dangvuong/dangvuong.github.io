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
	
	<table class="table mt-2 table-striped table-bordered table-hover">
	<thead>
		<tr>
		<th>ID</th>
		<th>Tên Chức Vụ : </th>
		<th>Mã Chức Vụ : </th>
		<th>Chuyên Môn : </th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var = "cv" items ="${chucvu}">
		<tr>
			<td>${cv.id}</td>
			<td>${cv.tenChucVu}</td>
			<td>${cv.maChucVu}</td>
			<td>${cv.chuyenMon}</td>
			<td> 
					<button type="button" class="btn btn-primary mb-1"><a href = "/addchucvu">Add</a></button>
					<button type="button" class="btn btn-secondary mb-1"><a href = "/updatechucvu/${cv.id}">Edit</a></button>
					<button type="button" class="btn btn-danger mb-1"><a href = "/deletechucvu/${cv.id}">Delete</a></button>
					<button type="button" class="btn btn-info" mb-1"><a href ="/viewchucvu/${cv.id}">View</a></button>
					</td>
		
		</tr>
		
		</c:forEach>
		</tbody>
	</table>
	
</div>

</body>
</html>