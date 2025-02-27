package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.UserVo;

@WebServlet("/07")
public class Servlet07 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//변수의 범위 jsp에서 설명
		UserVo vo = new UserVo();
		vo.setNo(20);
		vo.setEmail("hong@hwalbin.org");
		
		//	RequestScope 
		request.setAttribute("userVo", vo);
		
		UserVo vo2 = new UserVo();
		vo2.setNo(30);
		vo2.setEmail("jang@thieves.net");
		
		//	SessioScope
		request.getSession().setAttribute("userVo", vo2);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/07.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
