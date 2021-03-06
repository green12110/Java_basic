package cn.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletDemo7")
public class ServletDemo7 extends HttpServlet{
	

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//得到ServletContext对象方式一
		//ServletContext sc = this.getServletConfig().getServletContext();
		
		//得到ServletContext对象方式二
		ServletContext sc = this.getServletContext();
		int a = sc.getMajorVersion();
		int b = sc.getMinorVersion();
		System.out.println(a+"---"+b);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
