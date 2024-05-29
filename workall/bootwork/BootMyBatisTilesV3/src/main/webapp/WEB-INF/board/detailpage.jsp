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
<c:set var="root" value="<%=request.getContextPath() %>"/>
<script type="text/javascript">
	$(function(){
		   //처음 로딩시 댓글 목록 출력
		   answer_list();
		  
		   //댓글 추가 버튼
		  $("#btnansweradd").click(function(){
			  let num=${dto.num};
			  let content=$("#acontent").val();
			  if(content==''){
				  alert("댓글을 입력후 등록해주세요");
				  return;
			  }
			  
			  $.ajax({
				  type:'post',
				  dataType:'text',
				  url:"./ainsert",
				  data:{"num":num,"content":content},
				  success:function(){
					  //댓글 목록 다시 출력
					  answer_list();
					  //초기화
					  $("#acontent").val("");
				  }
			  });
		  });
	});
	
	function answer_list(){
		
	}
	
</script>
<table class="table table-striped" style="width: 500px; margin: 20px;">
	<caption align="top">
		<h2><b>${dto.subject }</b></h2>
		<c:if test="${dto.uploadphoto != 'no' }">
		<h4><img src="${root }/save/${profile_photo}" width="30">${dto.myid }</h5>
		</c:if>
		<c:if test="${dto.uploadphoto == 'no' }">
		<h4><img src="../image/noimage1.png" width="30">${dto.myid }</h4>
		</c:if>
		<h5><fmt:formatDate value="${dto.writeday }" pattern="yyyy-MM-dd HH:mm"/>&nbsp;조회: ${dto.readcount }</h5>
		<h6 align="right"><i class="bi bi-send" style="color: gray;"></i>&nbsp;댓글<span class="answercount">0</span>&nbsp;&nbsp;URL 복사</h6>
		<hr>
	</caption>
	<tr>
		<td><img src="${root }/save/${dto.uploadphoto}" width="100" onerror="this.src='../image/noimage2.png'"><br>${dto.content }</td>
	</tr>
	<c:if test="${dto.myid == sessionScope.loginid and loginok == 'yes' }">
	<tr>
		<td><button type="button" class="btn btn-sm btn-info" onclick="location.href='${root}/board/form'">글쓰기</button>
		&nbsp;<button type="button" class="btn btn-sm btn-info" onclick="location.href='${root }/board/form?num=${dto.num}&regroup=${dto.regroup }&restep=${dto.restep }&relevel=${dto.relevel }&currentPage=${currentPage }'">답글</button>&nbsp;
		<button type="button" class="btn btn-sm btn-info" onclick="del()">삭제</button>&nbsp;
		<button type="button" class="btn btn-sm btn-info" onclick="location.href='${root}/board/updateform?num=${dto.num }&currentPage=${currentPage }'">수정</button>&nbsp;
		<button type="button" class="btn btn-sm btn-info" onclick="history.back()">목록</button></td>
	</tr>
	</c:if>
	
	<c:if test="${sessionScope.loginok != 'yes' or sessionScope.loginid != dto.myid }">
	<tr>
		<td><button type="button" class="btn btn-sm btn-info" onclick="location.href='./form?num=${dto.num}
		&regroup=${dto.regroup }&restep=${dto.restep }&relevel=${dto.relevel }&currentPage=${currentPage }'">답글</button>
		&nbsp;<button type="button" class="btn btn-sm btn-info" onclick="history.back()">목록</button></td>
	</tr>
	</c:if>
	<tr>
		<td>
			<div class="answerlist">
				
			</div>
		</td>
	</tr>
	<c:if test="${sessionScope.loginok!=null}">
		<tr>
			<td>			   
				<b>댓글</b><br>
				<textarea style="width: 80%;height: 60px;" id="acontent"></textarea>
				<button type="button" class="btn btn-outline-success"
				style="height: 65px;position: relative;top:-25px;"
				id="btnansweradd">등록</button>
			</td>
		</tr>
	</c:if>
</table>
<script>
	function del(){
		let num = ${dto.num};
		let currentPage = ${currentPage};
		
		let a = confirm("정말 삭제하시겠습니까?");
		if(a){
			location.href="./delete?num=" + num + "&currentPage=" + currentPage;
		}
	}
</script>
</body>
</html>