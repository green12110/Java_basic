package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/*
 * 练习：用集合存储5个学生对象，并把学生对象进行遍历。用迭代器遍历。
 * 
 * 注意：
 * 		A:自己的类名不要和我们学习的要使用的API中的类名相同。
 * 		B:复制代码的时候，很容易把那个类所在的包也导入过来，容易出现不能理解的问题。
 *
 */

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection c = new ArrayList();
		Student st1 = new Student("Jack",18);
		Student st2 = new Student("merry",23);
		Student st3 = new Student("robert",24);
		Student st4 = new Student("lily",21);
		Student st5  = new Student("tom",16);
		c.add(st1);
		c.add(st2);
		c.add(st3);
		c.add(st4);
		c.add(st5);
		
		Iterator it = c.iterator();
		while(it.hasNext()){
			Student s = (Student)it.next();
			System.out.println(s.getName()+"---"+s.getName());
			
		}
		

	}

}
