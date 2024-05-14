package board.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.dao.SimpleBoardDao;
import data.dto.SimpleBoardDto;

@WebServlet("/board/list")
public class ListServlet extends HttpServlet {
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SimpleBoardDao dao = new SimpleBoardDao();
		int totalCount = dao.getTotalCount();
		List<SimpleBoardDto> list = null;
		list = dao.getAllDatas(0, 10);
		
		request.setAttribute("totalCount", totalCount);
		request.setAttribute("list", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("../day0514/boardlist.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
