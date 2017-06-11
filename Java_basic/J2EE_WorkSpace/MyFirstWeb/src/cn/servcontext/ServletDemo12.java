package cn.servcontext;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.dao.UserDao;

/**
 * ����servletcontext�����ȡ��Դ�ļ�
 */
@WebServlet("/ServletDemo12")
public class ServletDemo12 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao dao = new UserDao();
    
    public ServletDemo12() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//test1();
		
		//test2();
		
		//test3();
		
		dao.getResourceFile();
	
	}


	private void test1() throws IOException {
		//�õ�db��propertye�ļ�
		InputStream in = this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");
		//����properties����
		Properties pros = new Properties();
		//�����ļ�
		pros.load(in);
		//��map��ʽ�洢,ͨ������ֵ
		String url=pros.getProperty("url");
		String username = pros.getProperty("username");
		String pass = pros.getProperty("pass");
		
		System.out.println(url+"----"+username+"---"+pass);
	}
	
	private void test2() throws IOException {
		//�õ�db��propertye�ļ�
		InputStream in = this.getServletContext().getResourceAsStream("/WEB-INF/classes/cn/servcontext/db.properties");
		//����properties����
		Properties pros = new Properties();
		//�����ļ�
		pros.load(in);
		//��map��ʽ�洢,ͨ������ֵ
		String url=pros.getProperty("url");
		String username = pros.getProperty("username");
		String pass = pros.getProperty("pass");
		
		System.out.println(url+"----"+username+"---"+pass);
	}
	
	/**
	 * ��ȡ��Դ��ʽ�������Եõ���Դ���������ԣ���Դ�ļ����֣�
	 * @throws IOException
	 */
	public void test3() throws IOException{
		//ͨ��servletcontext��getRealPath���������õ���Դ�ļ�����·��
		//��ͨ����ͳ����ȡ��Դ�ļ�
		String path = this.getServletContext().getRealPath("/WEB-INF/classes/db.properties");
		//�õ���ȡpath�Ŀ�ʼ����
		int beginIndex = path.lastIndexOf("\\");
		//��ȡ�ַ���
		String filename = path.substring(beginIndex+1);
		
		System.out.println("����·����"+path);
		System.out.println("��Դ�ļ����ƣ�"+filename);
		//����FileInputStream����
		FileInputStream in = new FileInputStream(path);
		Properties pros = new Properties();
		pros.load(in);
		
		String url = pros.getProperty("url");
		String username = pros.getProperty("username");
		String pass = pros.getProperty("pass");
		System.out.println("��Դ�ļ��������£�");
		System.out.println(url+"---"+username+"---"+pass);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
