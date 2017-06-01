package cn.set_02;

import java.util.HashSet;
import java.util.Set;
/*
 * 需求：存储自定义对象，并保证元素的唯一性
 * 要求：如果两个对象的成员变量值都相同，则为同一个元素。
 * 
 * 
 */

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Student> set = new HashSet<Student>();
		
		Student stu1 = new Student("张三",18);
		Student stu2 = new Student("李四",22);
		Student stu3 = new Student("王五",20);
		Student stu4 = new Student("李丽",24);
		Student stu5 = new Student("张三",18);
		
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		set.add(stu4);
		set.add(stu5);
		
		for(Student s:set){
			System.out.println(s.getName()+"-----"+s.getAge());
		}
		

	}

}
