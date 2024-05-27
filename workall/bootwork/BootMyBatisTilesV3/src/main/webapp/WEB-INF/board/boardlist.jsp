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
<h5>총 ${totalCount }개의 글이 있습니다</h5>
<table class="table table-striped" style="width: 600px;">
	<tr class="table-danger">
		<th width="50">번호</th>
		<th width="270">제목</th>
		<th width="100">작성자</th>
		<th width="120">작성일</th>
		<th>조회</th>
	</tr>
	<c:if test="${totalCount==0 }">
		<tr height="60">
			<td colspan="5" align="center" valign="middle">
				<b style="font-size: 20px;">
					등록된 글이 없습니다
				</b>
			</td>
		</tr>
	</c:if>
</table>
<c:if test="${sessionScope.loginok != null }">
	<button type="button" class="btn btn-outline-success" style="width: 100px; margin-left: 100px;" onclick="location.href='./form'">글쓰기</button>
</c:if>
</body>
</html>