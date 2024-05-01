<%@page import="data.dto.StudentDto"%>
<%@page import="data.dao.StudentDao"%>
<%@page import="data.dto.SawonDto"%>
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
	//num
	int num=Integer.parseInt(request.getParameter("num"));
	//dao
	StudentDao dao=new StudentDao();
	//dto
	StudentDto dto=dao.getData(num);
	String license = String.valueOf(dto.getLicense());
	
%>
<body>
<div style="margin: 20px;width: 500px">
	<table>
		<caption align="top">
			<h2><b><%=dto.getName() %> 학생정보</b></h2>
		</caption>
		<tr>
			<td>
				<h5>이름: <%=dto.getName() %></h5>
				<h5>혈액형: <%=dto.getBlood() %></h5>
				<h5>운전면혀: <%=String.valueOf(dto.getLicense()).equals("o")?"있음":"없음"%></h5>
				<h5>자바점수: <%=dto.getJava() %></h5>
				<h5>스프링점수: <%=dto.getSpring() %></h5>				
				<h5>HTML점수: <%=dto.getHtml() %></h5>
				<h5>평균: <%=(dto.getJava() + dto.getSpring() + dto.getHtml()) / 3 %></h5>
				<h5>등록일: <%=dto.getWriteday() %></h5>				
			</td>
		</tr>
		<tr height="60">
			<td colspan="2" align="center">
				<button type="button" class="btn btn-sm btn-warning"
				style="width: 80px;"
				onclick="location.href='studentform.jsp'">학생추가</button>
				
				<button type="button" class="btn btn-sm btn-warning"
				style="width: 80px;"
				onclick="location.href='studentlist.jsp'">학생목록</button>
				
				<button type="button" class="btn btn-sm btn-warning"
				style="width: 80px;"
				onclick="location.href='studentupdateform.jsp?num=<%=dto.getNum()%>'">정보수정</button>
				
				<button type="button" class="btn btn-sm btn-warning"
				style="width: 80px;"
				id="delstudent" num="<%=dto.getNum()%>"
				 studentname="<%=dto.getName()%>">학생삭제</button>
			</td>
		</tr>
	</table>
</div>
<script type="text/javascript">
	//사원삭제버튼 이벤트
	$("#delstudent").click(function(){
		let num=$(this).attr("num");
		let studentname=$(this).attr("studentname");
		let a=confirm(studentname+" 학생정보를 삭제할까요?");
		if(a){
			location.href="studentdelete.jsp?num="+num;
		}
	});
</script>
</body>
</html>