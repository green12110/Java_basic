package cn.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResponseTestServlet
 */
@WebServlet("/ResponseTestServlet")
public class ResponseTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ResponseTestServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// testLocation(request,response);
		//testContextType(request, response);
		//testRefresh(request,response);
		//testContextType(request,response);
		testDisipotion(request, response);
	}

	// Loction ���302ʹ�ã������������������
	public void testLocation(HttpServletRequest request,
			HttpServletResponse response) {
		// ����״̬��
		response.setStatus(302);
		// ������ͷlocation��ֵ
		response.setHeader("location", "index.jsp");

	}

	// Content-Encoding����ѹ��
	public void testContentEncoding() {
		String a = "aaadfdfdff";
		// OutputStream ops = new OutputStream(a);
		// GZIPOutputStream gzip = new GZIPOutputStream(ops);
	}

	// content-typeָ��������������
	public void testContextType(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		response.setHeader("content-type", "image/jpg");
		InputStream in = this.getServletContext().getResourceAsStream(
				"/lin.jpg");

		int len = 0;
		byte b[] = new byte[1024];
		OutputStream out = response.getOutputStream();
		while ((len = in.read(b)) !=-1) {
			out.write(b, 0, len);
		}

	}
	
	//refresh ��ʱˢ��
	public void testRefresh(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		response.setHeader("refresh", "3;url='http://www.sina.com.cn'");
		//response.setHeader("refresh", "3;url='index.jsp'");
		response.getWriter().write("abcd");
		
		
	}
	
	//content-dispositionָ�����������
	
	public void testDisipotion(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		response.setHeader("content-disposition", "attachment;filename=xxx.jpg");
		InputStream in = this.getServletContext().getResourceAsStream("/zhi.jpg");
		int len = 0;
		byte[] b = new byte[1024];
		OutputStream out = response.getOutputStream();
	    while((len = in.read(b))!=-1){
	    	out.write(b, 0, len);
	    }
		
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	
	    	
	}

}
