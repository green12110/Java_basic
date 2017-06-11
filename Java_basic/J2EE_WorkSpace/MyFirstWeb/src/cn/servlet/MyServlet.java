package cn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(
		urlPatterns = { "/MyServlet" }, 
		initParams = { 
				@WebInitParam(name = "path", value = "index.jsp")
		})
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletConfig config;
    
    public MyServlet() {
        super();
    }
     
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	this.config = config;
    }
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//PrintWriter out = response.getWriter();
		//out.write("Hello Servlet!!");
		String name = config.getInitParameter("path");
		response.sendRedirect(name);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
