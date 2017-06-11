package cn.singlePattern;
/**
 * 单例模式：
 * 1、饿汉式--开发使用--不出问题
 * 2、懒汉式（延迟加载）--面试使用--线程安全问题
 * 
 * 线程安全问题
 * 		a:是否多线程环境	是
 * 		b:是否有共享数据	是
 * 		c:是否有多条语句操作共享数据 	是
 * 
 * 
 * @author Administrator
 *
 */
public class TeacherTest {
	
	public static void main(String[] args) {
		Teacher t1 = Teacher.getTeacher();
		Teacher t2 = Teacher.getTeacher();
		System.out.println(t1==t2);
		
	}

}
