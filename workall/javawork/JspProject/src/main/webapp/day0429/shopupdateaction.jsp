<%@page import="data.dao.ShopDao"%>
<%@page import="data.dto.ShopDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("utf-8");
/* int shopidx = Integer.parseInt(request.getParameter("shopidx")); */
String sname = request.getParameter("sname");
int sprice = Integer.parseInt(request.getParameter("sprice"));
int scount = Integer.parseInt(request.getParameter("scount"));
String scolor = request.getParameter("scolor");
String sphoto = request.getParameter("sphoto");
String writeday = request.getParameter("writeday");

ShopDto dto = new ShopDto(sname, sprice, scount, scolor, sphoto);
ShopDao dao = new ShopDao();


response.sendRedirect("shoplist.jsp");
%>