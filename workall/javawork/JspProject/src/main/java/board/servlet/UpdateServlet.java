package board.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.dao.SimpleBoardDao;
import data.dto.SimpleBoardDto;


@WebServlet("/board/update")
public class UpdateServlet extends HttpServlet {
	SimpleBoardDao dao = new SimpleBoardDao();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int num=Integer.parseInt(request.getParameter("num"));
		int currentPage=Integer.parseInt(request.getParameter("currentPage"));
		String writer = request.getParameter("writer");
		String avata = request.getParameter("avata");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		SimpleBoardDto dto = new SimpleBoardDto();
		
		dto.setNum(num);
		dto.setWriter(writer);
		dto.setAvata(avata);
		dto.setSubject(subject);
		dto.setContent(content);
		
		dao.updateBoard(dto);
		
		response.sendRedirect("./detail?num="+ num + "&currentPage=" +currentPage);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
