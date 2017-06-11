package cn.singlePattern;
/**
 * 单例模式：保证类在内存内只有一个对象
 * 
 * 如何实现？
 * 1、把构造方法私有，不能创建对象
 * 2、在成员位置创建一个对象
 * 3、与外界通信，通过一个公共方法
 *
 */
public class Student {
	
	private Student(){
		
    }
	
	private static Student stu = new Student();
	
	public static Student getStudent(){
		return stu;
	}
	
	
	

}
