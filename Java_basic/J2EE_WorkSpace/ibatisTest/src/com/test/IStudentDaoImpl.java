package com.test;
/**
 * 借助SqlMapClient中的方法进行CRUD
 * queryForObject  返回对象
 * queryForList    返回LIst
 * insert
 * delete
 * update
 */
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

public class IStudentDaoImpl implements IStudentDao {
	
	private static SqlMapClient sqlMapClient;
	
	static{
		//读取配置文件
		 try {
			//System.out.println("static code block");
			Reader reader  = com.ibatis.common.resources.Resources.getResourceAsReader("config/SqlMapConfig.xml");
			sqlMapClient = com.ibatis.sqlmap.client.SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStudentById(int id) {
	}

	@Override
	public void updateStudentById(Student student) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> queryAllStudent() {
		List<Student> stuList = null;
		try {
	       stuList = sqlMapClient.queryForList("selectAllStudent");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
		return stuList;
	}

	@Override
	public List<Student> queryStudentByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student queryStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addStudentBySequence(Student student) {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		IStudentDao studentDao = new IStudentDaoImpl();
		for(Student s:studentDao.queryAllStudent()){
			System.out.println(s.toString());
		}
		
	}

}
