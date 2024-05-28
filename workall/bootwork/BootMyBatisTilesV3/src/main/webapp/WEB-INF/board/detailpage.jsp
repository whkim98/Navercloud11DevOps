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
<c:set var="root" value="<%=request.getContextPath() %>"/>
<table class="table table-striped" style="width: 500px; margin: 20px;">
	<caption align="top">
		<h2><b>${dto.subject }</b></h2>
		<c:if test="${dto.uploadphoto != 'no' }">
		<h4><img src="${root }/save/${dto.uploadphoto}" width="30">${dto.myid }</h5>
		</c:if>
		<c:if test="${dto.uploadphoto == 'no' }">
		<h4><img src="../image/noimage1.png" width="30">${dto.myid }</h4>
		</c:if>
		<h5><fmt:formatDate value="${dto.writeday }" pattern="yyyy-MM-dd HH:mm"/>&nbsp;조회: ${dto.readcount }</h5>
		<h6 align="right"><i class="bi bi-send" style="color: gray;"></i>&nbsp;댓글</h6>
		<hr>
	</caption>
	<tr>
		<td><img src="${root }/save/${profile_photo}" width="100"><br>${dto.content }</td>
	</tr>
	<c:if test="${dto.myid == sessionScope.loginid and loginok == 'yes' }">
	<tr>
		<td><button type="button" class="btn btn-sm btn-info" onclick="location.href='${root}/board/form'">글쓰기</button>&nbsp;<button type="button" class="btn btn-sm btn-info">답글</button>&nbsp;<button type="button" class="btn btn-sm btn-info">삭제</button>&nbsp;<button type="button" class="btn btn-sm btn-info">수정</button>&nbsp;<button type="button" class="btn btn-sm btn-info" onclick="history.back()">목록</button></td>
	</tr>
	</c:if>
	
	<c:if test="${sessionScope.loginok != 'yes' or sessionScope.loginid != dto.myid }">
	<tr>
		<td><button type="button" class="btn btn-sm btn-info">답글</button>&nbsp;<button type="button" class="btn btn-sm btn-info" onclick="history.back()">목록</button></td>
	</tr>
	</c:if>
</table>
</body>
</html>