package cn.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollecitonsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建集合对象
		List<Integer> list = new ArrayList<Integer>();

		// 添加元素
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(40);
		
		System.out.println("排序前："+list);
		/*Collections.sort(list);
		System.out.println("排序后：" +list);
		System.out.println("binarySearch:"+Collections.binarySearch(list, 60));
		System.out.println("binarySearch:"+Collections.binarySearch(list, 30));
		System.out.println("max:"+Collections.max(list));
		Collections.reverse(list);
		System.out.println("反转后:"+list);*/
		
		Collections.shuffle(list);
		System.out.println("随机置换："+list);

	}

}
