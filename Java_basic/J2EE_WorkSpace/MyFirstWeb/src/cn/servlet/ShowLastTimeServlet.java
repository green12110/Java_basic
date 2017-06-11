package cn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowLastTimeServlet
 */
@WebServlet("/ShowLastTimeServlet")
public class ShowLastTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowLastTimeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// ����response�ַ��ı��뷽ʽ
		response.setCharacterEncoding("UTF-8");
		// ����response���ݵı��뷽ʽ
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("�ϴη���ʱ���ǣ�");
		// ����û���cookie
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if (c.getName().equals("lastAceessTime")) {
					Long lastTime = Long.parseLong(c.getValue());
					Date date = new Date(lastTime);
					out.print(date.toString());
				}
			}
		}
		// ���û��������µķ���ʱ��
		Cookie cookie = new Cookie("lastAceessTime", System.currentTimeMillis()+"");
		//����cookie����Ч��
		cookie.setMaxAge(3600);
		//cookie.setPath("/MyFirstWeb");
		response.addCookie(cookie);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		

	}

}
