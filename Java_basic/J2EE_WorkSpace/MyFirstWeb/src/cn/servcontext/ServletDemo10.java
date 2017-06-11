package cn.servcontext;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 获取WEB应用的初始化参数
 * 在web.xml文件中配置的<context-param>
 */
@WebServlet("/ServletDemo10")
public class ServletDemo10 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ServletDemo10() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//得到 servletcontext
		ServletContext sc = this.getServletContext();
		String name = sc.getInitParameter("data");
		System.out.println(name);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
