package cn.itcast_01;

import java.util.ArrayList;
import java.util.List;

/*
 * �洢�Զ�����󲢱���,����ͨforѭ����(size()��get()���)
 */
public class ListDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		
		Student s1 = new Student("���",120);
		Student s2 = new Student("�˽�",90);
		Student s3 = new Student("��ɮ",29);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		for(int i=0;i<list.size();i++){
			Student stu = (Student)list.get(i);
			System.out.println(stu.getName()+"---"+stu.getAge());
			
		}
				

	}

}
