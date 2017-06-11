package cn.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * ��Java�����л�ȡ��Դ�ļ�db.properties
 */
public class UserDao {
	
	public void getResourceFile() throws IOException{
		// ͨ�����������ȡ��Դ��·��
		String path = UserDao.class.getClassLoader().getResource("db.properties").getPath();
		System.out.println("��Դ�ļ�·����"+path);
		FileInputStream in = new FileInputStream(path);
		
		Properties pros = new Properties();
		pros.load(in);
		
		String url = pros.getProperty("url");
		String username = pros.getProperty("username");
		String pass = pros.getProperty("pass");
		System.out.println(url+"--"+username+"--"+pass);
		
	}

}
