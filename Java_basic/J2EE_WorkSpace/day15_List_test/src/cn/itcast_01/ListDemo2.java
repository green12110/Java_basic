package cn.itcast_01;

import java.util.List;
import java.util.ArrayList;

/*
 * List集合的特有功能：
 * A:添加功能
 * 		void add(int index,Object element):在指定位置添加元素
 * B:获取功能
 * 		Object get(int index):获取指定位置的元素
 * C:列表迭代器
 * 		ListIterator listIterator()：List集合特有的迭代器
 * D:删除功能
 * 		Object remove(int index)：根据索引删除元素,返回被删除的元素
 * E:修改功能
 * 		Object set(int index,Object element):根据索引修改元素，返回被修饰的元素
 */

public class ListDemo2 {
	public static void main(String[] args) {
		List li = new ArrayList();
		String s1 = "Hello";
		String s2 = "Gewen";
		String s3 = "Java";
		String s4 = "Easy";
		
		/*li.add(s1);
		li.add(s2);
		li.add(s1);
		li.add(s3);*/
		
		li.add(0,s1);
		li.add(1,s2);
		li.add(1,s3);
		//li.add(1,s1);
		
		System.out.println(li);
		
	}

}
