<%@page import="data.dto.StudentDto"%>
<%@page import="java.util.List"%>
<%@page import="data.dao.StudentDao"%>
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
	StudentDao dao = new StudentDao();
	List<StudentDto> list = dao.getAllstudent();
%>
<body>
<div style="margin: 20px; width: 500px;">
	<div class="input-group">
		<h5 class="alert alert-danger" style="width: 400px";>총 <%=list.size() %>명의 학생이 있어요</h5>
		<button type="button" class="btn btn-sm btn-info"
		onclick="location.href='studentform.jsp'"
		style="margin-left: 10px;height: 50px;">학생추가</button>
	</div>
</div>
 <%
	  for(StudentDto dto:list)
	  {%>
		<div class="list">
			<br><%=dto.getName()%>
			<br>
			<button type="button" class="btn btn-sm btn-outline-danger"
			onclick="location.href='studentdetail.jsp?num=<%=dto.getNum()%>'">상세보기</button>
		</div>  
	  <%}
	  
	  %>
</body>
</html>