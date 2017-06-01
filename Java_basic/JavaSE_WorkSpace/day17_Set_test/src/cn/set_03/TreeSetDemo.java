package cn.set_03;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<Student> set = new TreeSet<Student>();
		
		Student stu1 = new Student("张三",18);
		Student stu2 = new Student("李四",22);
		Student stu3 = new Student("王五",20);
		Student stu4 = new Student("李丽",24);
		Student stu5 = new Student("张三",18);
		
		//添加
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		set.add(stu4);
		set.add(stu5);
		
		//遍历
		for(Student s:set){
			System.out.println(s.getName()+"----"+s.getAge());
			
		}
	}

}
