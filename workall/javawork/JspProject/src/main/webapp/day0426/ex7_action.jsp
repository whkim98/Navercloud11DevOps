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
	//post방식
	String home = request.getParameter("home");
	String email = request.getParameter("email");
	
	//체크박스는 배열 (여러 개)
	//선택 안 하면 null값 반환
	String[] hobby = request.getParameterValues("hobby");
%>
<body>
	<h5>나의 주거지: <%=home %></h5>
	<h5>이메일 주소: <%=email %></h5>
	<h5>취미: <%
		if(hobby == null){%>
			<b>취미가 없어요</b>
		<%}else{
			for(String h : hobby){%>
			<b>[<%=h %>]</b>
		<%}
		}
		%>
		</h5>
</body>
</html>