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
		// 设置response字符的编码方式
		response.setCharacterEncoding("UTF-8");
		// 设置response内容的编码方式
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("上次访问时间是：");
		// 或得用户的cookie
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
		// 给用户设置最新的访问时间
		Cookie cookie = new Cookie("lastAceessTime", System.currentTimeMillis()+"");
		//设置cookie的有效期
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
