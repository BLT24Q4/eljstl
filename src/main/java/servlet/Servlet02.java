package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.UserVo;

@WebServlet("/02")
public class Servlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//	모델 전송
		int iValue = 10;
		float fValue = 3.14f;
		
		request.setAttribute("iVal", iValue);
		request.setAttribute("fVal", fValue);
		
		request.setAttribute("reqVal", "abcdefgh");
		
		Object nullValue = null;
		UserVo vo = new UserVo();
		vo.setName("홍길동");
		
		request.setAttribute("nullVal", nullValue);
		request.setAttribute("userVo", vo);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/02.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
