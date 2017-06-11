package cn.itcast_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 *  问题?
 * 		我有一个集合，如下，请问，我想判断里面有没有"world"这个元素，如果有，我就添加一个"javaee"元素，请写代码实现。
 */

public class ListiteratorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建List集合对象
		List list = new ArrayList();
		// 添加元素
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
