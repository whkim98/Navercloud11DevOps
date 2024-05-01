<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="data.dao.SawonDao"%>
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
	SawonDao dao = new SawonDao();
	List<Map<String, String>> list = dao.getBuseoAnalysis();
%>
<body>
<div style="margin: 30px 100px; width: 250px;">
		<table class="table table-bordered" style="width: 100%">
			<caption align="top">
				<h4><b>우리 회사 부서별 분석표</b></h4>
			</caption>
			<tr class="table-danger">
				<th width="100">부서</th>
				<th width="100">인원수</th>
				<th width="100">평균나이</th>
			</tr>
			<%
				for(Map<String, String> map : list){%>
					<tr>
						<td><%=map.get("buseo") %></td>
						<td><%=map.get("count") %></td>
						<td><%=map.get("age") %></td>
					</tr>
				<%}
			%>
			<tr>
				<td colspan="3" align="center">
					<button type="button" class="btn btn-outline-danger" onclick="history.back()">이전으로</button>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>