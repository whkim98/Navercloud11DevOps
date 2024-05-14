<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
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
<button type="button" class="btn btn-sm btn-outline-success"
onclick="location.href='./form'">
	<i class="bi bi-pencil-fill"></i>
	글쓰기
</button>
<div style="margin: 20px; font-size: 25px;">
	총 ${totalCount}개의 게시글이 있습니다.
</div>
<table class="table table-striped" style="width: 600px;">
	<tr class="table-danger">
		<th width="50">번호</th>
		<th width="280">제목</th>
		<th width="100">작성자</th>
		<th width="110">작성일</th>
		<th>조회</th>
	</tr>
	<c:if test="${totalCount == 0 }">
		<tr height="70">
			<td colspan="5" align="center" valign="middle">
				<h4>등록된 게시글이 없습니다</h4>
			</td>
		</tr>
	</c:if>
	<c:if test="${totalCount > 0 }">
		<c:forEach var="dto" items="${list }">
			<tr>
				<td>${no }</td>
				<c:set var="no" value="${no-1 }"/>
				<td>
					<a href="./detail?num=${dto.num }" style="text-decoration: none; color: black;">
						${dto.subject}
					</a>
				</td>
				<td>${dto.writer }</td>
				<td>
					<fmt:formatDate value="${dto.writeday }" pattern="yyyy-MM-dd"/>
				</td>
				<td>${dto.readcount }</td>
			</tr>
		</c:forEach>
	</c:if>
</table>
<div style="width: 600px; text-align: center; font-size: 22px;">
	<c:forEach var="pp" begin="${startPage }" end="${endPage }">
		<a href="./list?currentPage=${pp}" style="text-decoration: none; color: ${currentPage == pp ? 'red' : 'black'}">${pp}</a>&nbsp;
	</c:forEach>
</div>
</body>
</html>