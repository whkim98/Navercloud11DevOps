package board.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.dao.SimpleBoardDao;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/board/delete")
public class DeleteServlet extends HttpServlet {
	
	SimpleBoardDao dao = new SimpleBoardDao();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		int currentPage = Integer.parseInt(request.getParameter("currentPage"));
		dao.deleteBoard(num);
		response.sendRedirect("./list");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
