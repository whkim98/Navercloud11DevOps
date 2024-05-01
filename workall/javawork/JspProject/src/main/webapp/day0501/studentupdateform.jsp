<%@page import="data.dto.StudentDto"%>
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
        
        img.photo{
        	position: absolute;
        	left: 340px;
        	top: 250px;
        	width: 150px;
        	border: 2px solid gray;
        }
    </style>
</head>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	StudentDao dao = new StudentDao();
	StudentDto dto = dao.getData(num);
%>
<body>
<div style="margin: 20px;width: 300px;">
	<form action="./studentupdate.jsp" method="post">
	<input type="hidden" name="num" value="<%=dto.getNum() %>">
		<table class="table table-bordered">
			<caption align="top">
				<h5 class="alert alert-warning">학생정보입력</h5>
			</caption>
			<tr>
				<th width="100" class="table-danger">학생명</th>
				<td>
					<input type="text" name="name" class="form-control"
					required="required" value="<%=dto.getName() %>" autofocus="autofocus">
				</td>
			</tr>
			<tr>
				<th width="100" class="table-danger">혈액형</th>
				<td>
					<select class="form-select" name="blood" id="blood">
						<option <%=dto.getBlood().equals("A") ? "selected":"" %>>A</option>
						<option <%=dto.getBlood().equals("B") ? "selected":"" %>>B</option>
						<option <%=dto.getBlood().equals("AB") ? "selected":"" %>>AB</option>
						<option <%=dto.getBlood().equals("O") ? "selected":"" %>>O</option>
					</select>
				</td>
			</tr>
			<tr>
				<th width="100" class="table-danger">운전면허</th>
				<td>
					<input type="checkbox" name="license" <%=String.valueOf(dto.getLicense()).equals("o") ? "checked" : "" %>>
				</td>
			</tr>
			<tr>
				<th width="100" class="table-danger">자바점수</th>
				<td>
					<input type="text" name="java" class="form-control" value="<%=dto.getJava() %>">
				</td>
			</tr>
			<tr>
				<th width="100" class="table-danger">스프링점수</th>
				<td>
					<input type="text" name="spring" class="form-control" value="<%=dto.getSpring() %>">
				</td>
			</tr>
			<tr>
				<th width="100" class="table-danger">HTML점수</th>
				<td>
					<input type="text" name="html" class="form-control" value="<%=dto.getHtml() %>">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit" class="btn btn-outline-secondary btn-sm"
					style="width: 80px;">정보수정</button>
					
					<button type="button" class="btn btn-outline-secondary btn-sm"
					style="width: 80px;"
					onclick="location.href='studentlist.jsp'">학생목록</button>
				</td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>