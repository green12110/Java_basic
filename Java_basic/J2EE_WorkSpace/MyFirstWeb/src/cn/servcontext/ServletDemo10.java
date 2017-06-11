package cn.servcontext;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��ȡWEBӦ�õĳ�ʼ������
 * ��web.xml�ļ������õ�<context-param>
 */
@WebServlet("/ServletDemo10")
public class ServletDemo10 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ServletDemo10() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//�õ� servletcontext
		ServletContext sc = this.getServletContext();
		String name = sc.getInitParameter("data");
		System.out.println(name);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
