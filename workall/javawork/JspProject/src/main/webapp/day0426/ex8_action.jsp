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
	//한글 encoding
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String pass = request.getParameter("pass");
	String gender = request.getParameter("gender");
	String lic = request.getParameter("lic");
	String blood = request.getParameter("blood");
	String[] ITLang = request.getParameterValues("ITLang");
%>
<body>
	<div style="font-size: 20px">
		이름: <%=name %><br>
		비밀번호: <%=pass %><br>
		성별: <%=gender %><br>
		운전면허: <%=lic==null ? "없음":"있음" %><br>
		혈액형: <%=blood %><br>
		취미: <%
		if(ITLang == null){%>
			<b>스킬이 없어요</b>
		<%}else{
			for(String h : ITLang){%>
			<b>[<%=h %>]</b>
		<%}
		}
		%>
		
	</div>
</body>
</html>