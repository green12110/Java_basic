package cn.servcontext;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletDemo8")
public class ServletDemo8 extends HttpServlet{
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
        		throws ServletException, IOException {
        	//得到ServletContext
        	ServletContext sc = this.getServletContext();
        	//设置属性值
        	sc.setAttribute("name", "林青霞");
        	
        }
        
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
        	throws ServletException, IOException {
        	doGet(request, response);
        }
	
	

}
