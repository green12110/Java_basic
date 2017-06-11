package com.test;

import java.util.List;

public interface IStudentDao {
	public abstract void addStudent(Student student);
	public abstract void deleteStudentById(int id);
	public abstract void updateStudentById(Student student);
	public abstract List<Student> queryAllStudent();
	public abstract List<Student> queryStudentByName(String name);
	public abstract Student queryStudentById(int id);
	/**
	 * 主键利用数据库sequence自动增长
	 * @param student
	 */
	public abstract void addStudentBySequence(Student student);
    

}
