<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="dto" class="data.dto.StudentDto"/>
<jsp:useBean id="dao" class="data.dao.StudentDao"/>
<jsp:setProperty name="dto" property="*"/>

<%
	dao.updateStudent(dto);
	response.sendRedirect("studentdetail.jsp?num="+dto.getNum());
%>
