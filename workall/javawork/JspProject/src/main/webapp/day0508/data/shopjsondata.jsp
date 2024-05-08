<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="data.dto.ShopDto"%>
<%@page import="java.util.List"%>
<%@page import="data.dao.ShopDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ShopDao dao = new ShopDao();
	List<ShopDto> list = dao.getShopDatas();
	
	JSONArray arr = new JSONArray();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	for(ShopDto dto: list){
		JSONObject ob = new JSONObject();
		ob.put("shopidx", dto.getShopidx());
		ob.put("sname", dto.getSname());
		ob.put("sprice", dto.getSprice());
		ob.put("scount", dto.getScount());
		ob.put("scolor", dto.getScolor());
		ob.put("sphoto", dto.getSphoto());
		ob.put("writeday", sdf.format(dto.getWriteday()));
		arr.add(ob);
	}
%>
<%=arr.toString() %>