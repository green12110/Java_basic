package cn.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class XmlFileServlet
 */
@WebServlet("/XmlFileServlet")
public class XmlFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/xml; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<china>");
		out.println("<province name='吉林省'>");
		out.println("<city>长春</city>");
		out.println("<city>吉林市</city>");
		out.println("<city>四平</city>");
		out.println("<city>松原</city>");	
		out.println("<city>通化</city>");
		out.println("</province>");
		out.println("<province name='辽宁省'>");
		out.println("<city>沈阳</city>");
		out.println("<city>大连</city>");
		out.println("<city>鞍山</city>");
		out.println("<city>抚顺</city>");
		out.println("<city>铁岭</city>");
		out.println("</province>");
		out.println(" <province name='山东省'>");
		out.println("<city>济南</city>");
		out.println("<city>青岛</city>");
		out.println("<city>威海</city>");
		out.println("<city>烟台</city>");
		out.println("<city>潍坊</city>");
		out.println("</province>");
		out.println(" </china>");
		/*
		 * <china>
	       <province name="吉林省">
		     <city>长春</city>
		     <city>吉林市</city>
		     <city>四平</city>
		     <city>松原</city>
		     <city>通化</city>
	       </province>
	       <province name="辽宁省">
		      <city>沈阳</city>
		      <city>大连</city>
		      <city>鞍山</city>
		      <city>抚顺</city>
		      <city>铁岭</city>
	       </province>
	      <province name="山东省">
		     <city>济南</city>
		     <city>青岛</city>
		     <city>威海</city>
		     <city>烟台</city>
		     <city>潍坊</city>
	      </province>
         </china>	
		 */
	}

}
