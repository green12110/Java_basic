package cn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestGetServlet
 */
@WebServlet("/TestGetServlet")
public class TestGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.write("server connection success!");
	    System.out.println("aaaaaaaaaaaaaaaaaaaa");
	    System.out.println("getMethod():"+request.getMethod());
	    System.out.println("getParameter():"+request.getParameter("a"));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.write("Post : server connection success!");
	    //System.out.println("aaaaaaaaaaaaaaaaaaaa");
	    System.out.println("getMethod():"+request.getMethod());
	    System.out.println("getParameter(a):"+request.getParameter("a"));
	    System.out.println("getParameter(b):"+request.getParameter("b"));
	    System.out.println("getParameter(c):"+request.getParameter("c"));
	}

}
