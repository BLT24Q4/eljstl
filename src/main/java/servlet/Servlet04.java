package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vo.UserVo;

@WebServlet("/04")
public class Servlet04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//	RequestScope
		UserVo userVo = new UserVo(1, "박명수", "park", "1234", "male");
		request.setAttribute("vo", userVo);
		
		request.setAttribute("num", 1);
		request.setAttribute("str", "안녕하세요");
		
		//	SessionScope
		UserVo userVo2 = new UserVo(2, "홍길동", "hong", "4567", "male");
		HttpSession session = request.getSession();
		session.setAttribute("vo", userVo2);
		
		//	ApplicationScope
		UserVo userVo3 = new UserVo(3, "장길산", "jang", "9876", "male");
		request.getServletContext().setAttribute("vo", userVo3);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/04.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
