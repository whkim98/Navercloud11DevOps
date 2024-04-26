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
<body>
	<h5>폼태그 읽기</h5>
	<form action="./ex8_action.jsp" method="post">
		<table class="table table-bordered" style="width: 400px;">
		<tr>
			<th class="table-info" width="100">이름</th>
			<td>
				<input type="text" name="name" class="form-control" required autofocus>
			</td>
		</tr>
		<tr>
			<th class="table-info" width="100">비밀번호</th>
			<td>
				<input type="password" name="pass" class="form-control" required>
			</td>
		</tr>
		<tr>
			<th class="table-info" width="100">성별</th>
			<td>
				<input type="radio" name="gender" value="여자">여자
				<input type="radio" name="gender" value="남자">남자
			</td>
		</tr>
		<tr>
			<th class="table-info" width="100">운전면허</th>
			<td>
				<input type="checkbox" name="lic">
			</td>
		</tr>
		<tr>
			<th class="table-info" width="100">혈액형</th>
			<td>
				<select name="blood" class="form-select">
					<option value="A">A</option>
					<option value="B">B</option>
					<option value="AB">AB</option>
					<option value="O">O</option>
				</select>
			</td>
		</tr>
		<tr>
			<th class="table-info" width="100">Skills</th>
			<td>
				<select name="IT Lang" class="form-select" multiple="multiple" size="4">
					<option value="자바">자바</option>
					<option value="스프링">스프링</option>
					<option value="자바스크립트">자바스크립트</option>
					<option value="파이썬">파이썬</option>
				</select>
			</td>
		</tr>
		</table>
	</form>
</body>
</html>