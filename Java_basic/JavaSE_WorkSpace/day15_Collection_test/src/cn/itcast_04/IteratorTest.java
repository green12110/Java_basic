package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/*
 * ��ϰ���ü��ϴ洢5��ѧ�����󣬲���ѧ��������б������õ�����������
 * 
 * ע�⣺
 * 		A:�Լ���������Ҫ������ѧϰ��Ҫʹ�õ�API�е�������ͬ��
 * 		B:���ƴ����ʱ�򣬺����װ��Ǹ������ڵİ�Ҳ������������׳��ֲ����������⡣
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
