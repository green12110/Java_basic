package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;
/*
 * 练习：用集合存储5个学生对象，并把学生对象进行遍历。
 */

import cn.itcast_01.Student;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建集合类
		Collection c = new ArrayList();
		
		//创建5个学生类
		Student s1 = new Student("Jack",18);
		Student s2 = new Student("merry",23);
		Student s3= new Student("robert",24);
		Student s4= new Student("lily",21);
		Student s5 = new Student("tom",16);
		
		//添加集合元素
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		//遍历，将集合转成数组,然后遍历
		Object[] obj = c.toArray();
		for(int i=0;i<c.size();i++){
			Student s = (Student)obj[i];
			System.out.println(s.getName()+"---"+s.getAge());
			
		}
		
		

	}

}
