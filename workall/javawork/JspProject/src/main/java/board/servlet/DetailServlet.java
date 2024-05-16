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
 * Servlet implementation class DetailServlet
 */
@WebServlet("/board/detail")
public class DetailServlet extends HttpServlet {
	SimpleBoardDao dao = new SimpleBoardDao();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		int currentPage = Integer.parseInt(request.getParameter("currentPage"));
		
		System.out.println(num);
		
		dao.updateReadcount(num);
		SimpleBoardDto dto = dao.getData(num);
		
		request.setAttribute("dto", dto);
		request.setAttribute("currentPage", currentPage);
		
		RequestDispatcher rd = request.getRequestDispatcher("../day0514/detail.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
