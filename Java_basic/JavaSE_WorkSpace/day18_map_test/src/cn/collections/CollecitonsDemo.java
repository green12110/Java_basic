package cn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollecitonsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������϶���
		List<Integer> list = new ArrayList<Integer>();

		// ���Ԫ��
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(40);
		
		System.out.println("����ǰ��"+list);
		/*Collections.sort(list);
		System.out.println("�����" +list);
		System.out.println("binarySearch:"+Collections.binarySearch(list, 60));
		System.out.println("binarySearch:"+Collections.binarySearch(list, 30));
		System.out.println("max:"+Collections.max(list));
		Collections.reverse(list);
		System.out.println("��ת��:"+list);*/
		
		Collections.shuffle(list);
		System.out.println("����û���"+list);

	}

}
