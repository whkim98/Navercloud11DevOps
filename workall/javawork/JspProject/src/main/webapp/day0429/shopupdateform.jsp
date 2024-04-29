<%@page import="data.dao.ShopDao"%>
<%@page import="data.dto.ShopDto"%>
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
        	left: 320px;
        	top: 100px;
        	width: 150px;
        	border: 3px solid gray;
        }
    </style>
</head>
<%
	int shopidx = Integer.parseInt(request.getParameter("shopidx"));
	ShopDto dto = new ShopDto();
	ShopDao dao = new ShopDao();
	dto = dao.getSangpum(shopidx);
%>
<body>
<form action="./shopupdateaction.jsp" method="post">
	<div style="margin: 10px; width: 300px;">
		<table class="table table-bordered">
		<caption align="top"><b>상품수정</b></caption>
			<tr>
				<th width="100" class="table-danger">상품명</th>
				<td>
					<input type="text" name="sname" class="form-control" value="<%=dto.getSname() %>" required="required">
				</td>
			<tr>
				<th width="100" class="table-danger">상품가격</th>
				<td>
					<input type="text" name="sprice" class="form-control" value="<%=dto.getSprice() %>" required="required">
				</td>
			</tr>
			<tr>
				<th width="100" class="table-danger">상품갯수</th>
				<td>
					<input type="number" name="scount" class="form-control" min="1" max="5" value="<%=dto.getScount() %>">
				</td>
			</tr>
			<tr>
				<th width="100" class="table-danger">상품색상</th>
				<td>
					<input type="color" name="scolor" class="form-control" value="<%=dto.getScolor() %>">
				</td>
			</tr>
			<tr>
				<th width="100" class="table-danger">상품사진</th>
				<td>
					<select name="sphoto" id="sphoto" class="form-select">
						<%
							for(int i = 1; i <= 34; i++){
								String v = "../shop/" + i + "." + (i == 24 ? "gif" : "jpg");
								if(v.equals(dto.getSphoto())){%>
									<option value="<%=v %>" selected>상품번호<%=i %></option>
								<%}else{%>
									<option value="<%=v %>">상품번호<%=i %></option>
								<%}
							}
						%>
					</select>
					<img src="<%=dto.getSphoto() %>" class="photo">
					<script tyoe="text/javascript">
						$('#sphoto').change(function(){
							$(".photo").attr("src",$(this).val());
						});
					</script>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit" class="btn btn-secondary">DB수정</button>
					<button type="button" class="btn btn-secondary" onclick="history.back();">이전으로</button>
				</td>
			</tr>
		</table>
	</div>
</form>
</body>
</html>