package board.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.dao.SimpleBoardDao;
import data.dto.SimpleBoardDto;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/board/insert")
public class InsertServlet extends HttpServlet {
	SimpleBoardDao dao = new SimpleBoardDao();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		SimpleBoardDto dto = new SimpleBoardDto();
		dto.setWriter(request.getParameter("writer"));
		dto.setSubject(request.getParameter("subject"));
		dto.setAvata(request.getParameter("avata"));
		dto.setContent(request.getParameter("content"));
		dao.insertBoard(dto);
		//목록으로 리다이렉트
		response.sendRedirect("./list");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
