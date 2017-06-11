package cn.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 在Java程序中获取资源文件db.properties
 */
public class UserDao {
	
	public void getResourceFile() throws IOException{
		// 通过类加载器获取资源的路径
		String path = UserDao.class.getClassLoader().getResource("db.properties").getPath();
		System.out.println("资源文件路径："+path);
		FileInputStream in = new FileInputStream(path);
		
		Properties pros = new Properties();
		pros.load(in);
		
		String url = pros.getProperty("url");
		String username = pros.getProperty("username");
		String pass = pros.getProperty("pass");
		System.out.println(url+"--"+username+"--"+pass);
		
	}

}
