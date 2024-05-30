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
<script type="text/javascript">
   $(function(){
	  //방명록 등록 버튼 
	  $("#btnaddguest").click(function(){
		 let gcontent= $("#gcontent").val();
		 if(gcontent==''){
			 alert("방명록 글을 작성후 등록해주세요");
			 return;
		 }
		 
		 let formData=new FormData();
		 //여러장의 사진들
		 for(let i=0;i<$("#photoupload")[0].files.length;i++){
			 formData.append("upload",$("#photoupload")[0].files[i]);//선택한 모든 사진들
		 }
		 //내용등록
		 formData.append("gcontent",gcontent);
		 $.ajax({
			type:"post",
			dataType:"text",
			url:"./addguest",
			data:formData,
			processData:false,
			contentType:false,
			success:function(){
				//성공후 목록 다시 가져오기
				guest_list();
				//초기화
				$("#gcontent").val("");
				$("#photoupload").val("");
			}
		 });
	  });
   });//close function
   
   //목록 출력하는 일반 함수
   function guest_list()
   {
	   
   }
   </script>
</head>
<body>
<c:if test="${sessionScope.loginok!=null}">
	<div class="guestformarea" style="width: 400px;">
		<textarea style="width: 100%;height: 120px;"
		id="gcontent" class="form-control"></textarea>
		<br>
		<input type="file" id="photoupload" multiple="multiple">
		<button type="button" id="btnaddguest"
		class="btn btn-sm btn-info">등록</button>
	</div>
	<hr>
</c:if>
<div class="guestlistarea">
	방명록 목록이 나올 영역
</div>
</body>
</html>