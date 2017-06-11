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
		out.println("<province name='����ʡ'>");
		out.println("<city>����</city>");
		out.println("<city>������</city>");
		out.println("<city>��ƽ</city>");
		out.println("<city>��ԭ</city>");	
		out.println("<city>ͨ��</city>");
		out.println("</province>");
		out.println("<province name='����ʡ'>");
		out.println("<city>����</city>");
		out.println("<city>����</city>");
		out.println("<city>��ɽ</city>");
		out.println("<city>��˳</city>");
		out.println("<city>����</city>");
		out.println("</province>");
		out.println(" <province name='ɽ��ʡ'>");
		out.println("<city>����</city>");
		out.println("<city>�ൺ</city>");
		out.println("<city>����</city>");
		out.println("<city>��̨</city>");
		out.println("<city>Ϋ��</city>");
		out.println("</province>");
		out.println(" </china>");
		/*
		 * <china>
	       <province name="����ʡ">
		     <city>����</city>
		     <city>������</city>
		     <city>��ƽ</city>
		     <city>��ԭ</city>
		     <city>ͨ��</city>
	       </province>
	       <province name="����ʡ">
		      <city>����</city>
		      <city>����</city>
		      <city>��ɽ</city>
		      <city>��˳</city>
		      <city>����</city>
	       </province>
	      <province name="ɽ��ʡ">
		     <city>����</city>
		     <city>�ൺ</city>
		     <city>����</city>
		     <city>��̨</city>
		     <city>Ϋ��</city>
	      </province>
         </china>	
		 */
	}

}
