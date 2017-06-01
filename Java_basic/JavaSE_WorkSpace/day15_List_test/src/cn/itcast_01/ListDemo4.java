package cn.itcast_01;

import java.util.ArrayList;
import java.util.List;

/*
 * 存储自定义对象并遍历,用普通for循环。(size()和get()结合)
 */
public class ListDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		
		Student s1 = new Student("悟空",120);
		Student s2 = new Student("八戒",90);
		Student s3 = new Student("唐僧",29);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for(int i=0;i<list.size();i++){
			Student stu = (Student)list.get(i);
			System.out.println(stu.getName()+"---"+stu.getAge());
			
		}
				

	}

}
