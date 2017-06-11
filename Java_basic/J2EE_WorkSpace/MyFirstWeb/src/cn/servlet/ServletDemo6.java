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
		
		    //�õ�ָ����init-param
	       // String name = this.getServletConfig().getInitParameter("path");
	        //�õ����е�init-param
	        Enumeration e = this.getServletConfig().getInitParameterNames();
	        //ö�����͵ı���
	        while(e.hasMoreElements()){
	        	//�õ�init-param������
	        	String name = (String)e.nextElement();
	        	//�õ�init-param��ֵ
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