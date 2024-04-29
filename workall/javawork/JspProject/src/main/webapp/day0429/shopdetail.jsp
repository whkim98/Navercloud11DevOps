<%@page import="java.text.SimpleDateFormat"%>
<%@page import="data.dto.ShopDto"%>
<%@page import="data.dao.ShopDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<%
	//shopidx int 타입 읽기
	int shopidx = Integer.parseInt(request.getParameter("shopidx"));
	ShopDao dao = new ShopDao();
	ShopDto dto = dao.getSangpum(shopidx);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm");
%>
<body>
	<div style="margin: 10px; width: 500px;">
		<h2><b>상품명: <%=dto.getSname() %></b></h2>
		<span style="font-size: 14px; color: gray;">
			등록일: <%=sdf.format(dto.getWriteday()) %>
		</span>
		<table>
			<tr>
				<td width="300">
					<img src="<%=dto.getSphoto() %>" style="border: 10px groove orange; margin: 10px; width:230px;">
				</td>
				<td>
					<h5>가격: <%=dto.getSprice() %>원</h5>
					<h5 style="background-color: <%=dto.getScolor() %>">
						색상: <%=dto.getScolor() %>
					</h5>
					<h5>수량: <%=dto.getScount() %>개</h5>
					<h5>총금액: <%=dto.getScount() * dto.getSprice() %>원</h5>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="button" class="btn btn-outline-danger" style="width: 80px;" onclick="location.href='shoplist.jsp'">목록</button>
					<button type="button" class="btn btn-outline-danger" style="width: 80px;" onclick="location.href='shopupdateform.jsp?shopidx=<%=dto.getShopidx() %>'">수정</button>
					<button type="button" class="btn btn-outline-danger" style="width: 80px;" onclick="location.href='shopdelete.jsp?shopidx=<%=dto.getShopidx() %>'">삭제</button>
					<button type="button" class="btn btn-outline-danger" style="width: 80px;" onclick="location.href='shopform.jsp'">추가</button>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>