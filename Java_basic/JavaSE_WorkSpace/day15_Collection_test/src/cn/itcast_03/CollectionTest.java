package cn.itcast_03;

import java.util.ArrayList;
import java.util.Collection;
/*
 * ��ϰ���ü��ϴ洢5��ѧ�����󣬲���ѧ��������б�����
 */

import cn.itcast_01.Student;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����������
		Collection c = new ArrayList();
		
		//����5��ѧ����
		Student s1 = new Student("Jack",18);
		Student s2 = new Student("merry",23);
		Student s3= new Student("robert",24);
		Student s4= new Student("lily",21);
		Student s5 = new Student("tom",16);
		
		//��Ӽ���Ԫ��
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		c.add(s5);
		
		//������������ת������,Ȼ�����
		Object[] obj = c.toArray();
		for(int i=0;i<c.size();i++){
			Student s = (Student)obj[i];
			System.out.println(s.getName()+"---"+s.getAge());
			
		}
		
		

	}

}
