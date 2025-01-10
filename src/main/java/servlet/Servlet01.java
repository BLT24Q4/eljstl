package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.UserVo;

@WebServlet("/01")
public class Servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//	요청 처리, 로직 처리 후 데이터를 JSP로 포워딩
		int iValue = 2025;
		float fValue = 3.14f;
		String sValue = "Hello EL";
		boolean bValue = true;
		Object nullValue = null;
		
		UserVo vo = new UserVo();
		vo.setNo(100);
		vo.setName("홍길동");
		vo.setEmail("hong@hwalbin.org");
		
		//	모델 데이터를 요청에 실어서 JSP 포워딩
		request.setAttribute("iVal", iValue);
		request.setAttribute("fVal", fValue);
		request.setAttribute("sVal", sValue);
		request.setAttribute("bVal", bValue);
		request.setAttribute("nullVal", nullValue);
		request.setAttribute("userVo", vo);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/01.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
