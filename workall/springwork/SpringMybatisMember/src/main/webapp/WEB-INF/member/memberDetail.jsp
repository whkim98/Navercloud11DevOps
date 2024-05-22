<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css">
<link href="https://fonts.googleapis.com/css2?family=Caveat:wght@400..700&family=Dancing+Script:wght@400..700&family=East+Sea+Dokdo&family=Jua&family=Gaegu&family=Gamja+Flower&family=Pacifico&family=Single+Day&display=swap" rel="stylesheet">
   <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
   <style>
       body *{
           font-family: 'Jua';
       }
   </style>
</head>
<body>
<table class="table table-bordered" style="width: 800px;">
	<tr>
		<th colspan="8" align="center">[${dto.name }]님의 정보임 ㅋㅋ</th>
	</tr>
	<tr>
		<th>#</th>
		<th>회원명</th>
		<th>아이디</th>
		<th>핸드폰</th>
		<th>주소</th>
		<th>이메일</th>
		<th>생일</th>
		<th>비밀번호</th>
	</tr>
	<tr>
		<td>${dto.num }</td>
		<td><img src="../image/${dto.photo }" style="width: 40px; height: 40px;" class="rounded-circle">${dto.name }</td>
		<td>${dto.myid }</td>
		<td>${dto.hp }</td>
		<td>${dto.addr }</td>
		<td>${dto.email }</td>
		<td>${dto.birthday }</td>
		<td>${dto.passwd }</td>
	</tr>
	<tr>
		<td colspan="8" align="center"><button type="button" onclick="history.back()">뒤로가기</button></td>
	</tr>
</table>
</body>
</html>
