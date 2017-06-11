package cn.servcontext;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletDemo9")
/**
 * 通过servletContext实现与ServletDemo8的数据共享
 * @author Administrator
 *
 */
public class ServletDemo9 extends HttpServlet{
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
        		throws ServletException, IOException {
        	//得到ServletContext
        	ServletContext sc = this.getServletContext();
        	//得到在demo8中设置的ServletContext的属性值
        	String str = (String)sc.getAttribute("name");
        	response.setCharacterEncoding("UTF-8");
        	response.setContentType("text/html; charset=UTF-8");
        	response.getWriter().write(str);
        	
        }
        
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
        	throws ServletException, IOException {
        	doGet(request, response);
        }
	
	

}
