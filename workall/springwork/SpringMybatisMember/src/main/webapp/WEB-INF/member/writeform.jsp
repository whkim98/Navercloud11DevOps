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
       $("#myfile").change(function(){
           //console.log($(this)[0]);//type 이 file 인경우 배열타입으로 넘어온다
           let reg=/(.*?)\/(jpg|jpeg|png|gif)$/;
           let f=$(this)[0].files[0];
           if(!f.type.match(reg)){
               alert("이미지 파일만 가능합니다");
               return;
           }
           if(f){
               let reader=new FileReader();
               reader.onload=function(e){
                   $("#showimg1").attr("src",e.target.result);
               }
               reader.readAsDataURL($(this)[0].files[0]);
           }
       });
   });
   </script>
</head>
<body>
<h1>입력폼</h1>
</body>
</html>
