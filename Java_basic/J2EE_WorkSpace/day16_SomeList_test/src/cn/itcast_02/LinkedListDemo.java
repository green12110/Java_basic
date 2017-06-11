package cn.itcast_02;

import java.util.LinkedList;

/*
 * LinkedList的特有功能：
 * 		A:添加功能
 * 			public void addFirst(Object e)
 * 			public void addLast(Object e)
 * 		B:获取功能
 * 			public Object getFirst()
 * 			public Obejct getLast()
 * 		C:删除功能
 * 			public Object removeFirst()
 * 			public Object removeLast()
 */

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linList = new LinkedList<String>();
		linList.add("Hello");
		linList.add("Java");
		linList.add("easy");
		
		System.out.println(linList);
		System.out.println("First:"+linList.getFirst()+"---Last:"+linList.getLast());
		System.out.println("----------------------");
		
		//添加功能
		linList.addFirst("First");
		linList.addLast("Last");
		
		System.out.println(linList);
		System.out.println("First:"+linList.getFirst()+"---Last:"+linList.getLast());
		System.out.println("---------------------------------");
		
		//删除
		String s1 = linList.removeFirst();
		String s2 = linList.removeLast();
		System.out.println(linList);
		System.out.println("删除的元素："+s1+"---"+s2);

	}

}
