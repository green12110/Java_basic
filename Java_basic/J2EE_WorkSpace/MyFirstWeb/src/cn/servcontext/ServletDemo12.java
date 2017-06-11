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
 * 利用servletcontext对象读取资源文件
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
		//得到db。propertye文件
		InputStream in = this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");
		//创建properties对象
		Properties pros = new Properties();
		//加载文件
		pros.load(in);
		//以map形式存储,通过键找值
		String url=pros.getProperty("url");
		String username = pros.getProperty("username");
		String pass = pros.getProperty("pass");
		
		System.out.println(url+"----"+username+"---"+pass);
	}
	
	private void test2() throws IOException {
		//得到db。propertye文件
		InputStream in = this.getServletContext().getResourceAsStream("/WEB-INF/classes/cn/servcontext/db.properties");
		//创建properties对象
		Properties pros = new Properties();
		//加载文件
		pros.load(in);
		//以map形式存储,通过键找值
		String url=pros.getProperty("url");
		String username = pros.getProperty("username");
		String pass = pros.getProperty("pass");
		
		System.out.println(url+"----"+username+"---"+pass);
	}
	
	/**
	 * 读取资源方式二，可以得到资源的其他属性（资源文件名字）
	 * @throws IOException
	 */
	public void test3() throws IOException{
		//通过servletcontext的getRealPath（）方法得到资源文件绝对路径
		//在通过传统流读取资源文件
		String path = this.getServletContext().getRealPath("/WEB-INF/classes/db.properties");
		//得到截取path的开始索引
		int beginIndex = path.lastIndexOf("\\");
		//截取字符串
		String filename = path.substring(beginIndex+1);
		
		System.out.println("绝对路径："+path);
		System.out.println("资源文件名称："+filename);
		//创建FileInputStream对象
		FileInputStream in = new FileInputStream(path);
		Properties pros = new Properties();
		pros.load(in);
		
		String url = pros.getProperty("url");
		String username = pros.getProperty("username");
		String pass = pros.getProperty("pass");
		System.out.println("资源文件内容如下：");
		System.out.println(url+"---"+username+"---"+pass);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
