package cn.itcast_02;

import java.util.LinkedList;

/*
 * LinkedList�����й��ܣ�
 * 		A:��ӹ���
 * 			public void addFirst(Object e)
 * 			public void addLast(Object e)
 * 		B:��ȡ����
 * 			public Object getFirst()
 * 			public Obejct getLast()
 * 		C:ɾ������
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
		
		//��ӹ���
		linList.addFirst("First");
		linList.addLast("Last");
		
		System.out.println(linList);
		System.out.println("First:"+linList.getFirst()+"---Last:"+linList.getLast());
		System.out.println("---------------------------------");
		
		//ɾ��
		String s1 = linList.removeFirst();
		String s2 = linList.removeLast();
		System.out.println(linList);
		System.out.println("ɾ����Ԫ�أ�"+s1+"---"+s2);

	}

}
