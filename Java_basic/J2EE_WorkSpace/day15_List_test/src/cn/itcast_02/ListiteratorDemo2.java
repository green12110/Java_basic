package cn.itcast_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 *  ����?
 * 		����һ�����ϣ����£����ʣ������ж�������û��"world"���Ԫ�أ�����У��Ҿ����һ��"javaee"Ԫ�أ���д����ʵ�֡�
 */

public class ListiteratorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����List���϶���
		List list = new ArrayList();
		// ���Ԫ��
		list.add("hello");
		list.add("world");
		list.add("java");
		boolean flag = false;
		Iterator it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			if ("world".equals(s)) {
				flag = true;
			}

		}
		if (flag) {
			list.add("javaee");
		}

		System.out.println("list:" + list);

	}

}
