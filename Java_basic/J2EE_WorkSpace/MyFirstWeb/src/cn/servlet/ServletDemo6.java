package cn.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private ServletConfig config;

	public ServletDemo6() {
		super();

	}

/*	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config = config;
	}*/

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		    //得到指定的init-param
	       // String name = this.getServletConfig().getInitParameter("path");
	        //得到所有的init-param
	        Enumeration e = this.getServletConfig().getInitParameterNames();
	        //枚举类型的遍历
	        while(e.hasMoreElements()){
	        	//得到init-param的名字
	        	String name = (String)e.nextElement();
	        	//得到init-param的值
	        	String value = this.getServletConfig().getInitParameter(name);
	        	System.out.println(name+"---"+value);
	        	
	        }
	       /* PrintWriter out = response.getWriter();
	        out.write(name);*/
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
