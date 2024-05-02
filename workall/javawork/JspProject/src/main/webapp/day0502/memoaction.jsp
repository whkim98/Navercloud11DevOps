<%@page import="data.dao.MemoDao"%>
<%@page import="data.dto.MemoDto"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int uploadSize = 1024 * 1024 * 5; //5mb
	//실제 업로드되는 경로 구하기
	//코드가 있는 프로젝트로 업로드 되는 것이 아니라 
	//톰캣 서버에 배포된 프로젝트 안에 save폴더에 업로드가 됨
	ServletContext context = getServletContext();
	String realFolder = context.getRealPath("/save");
	System.out.println("realFolder="+realFolder); //실제 업로드되는 save 폴더의 경로
	MultipartRequest multi = null;
	
	try{
		multi = new MultipartRequest(request, realFolder, uploadSize, "utf-8", new DefaultFileRenamePolicy());
		String title = multi.getParameter("title");
		String content = multi.getParameter("content");
		String uploadphoto = multi.getFilesystemName("upload");
		
		MemoDto dto = new MemoDto();
		dto.setTitle(title);
		dto.setUploadphoto(uploadphoto);
		dto.setContent(content);
		MemoDao dao = new MemoDao();
		dao.insertMemo(dto);
		response.sendRedirect("memolist.jsp");
	}catch(Exception e){%>
		<script>
			alert("파일 업로드 오류:" + e.getMessage());
		</script>
	<%}
%>