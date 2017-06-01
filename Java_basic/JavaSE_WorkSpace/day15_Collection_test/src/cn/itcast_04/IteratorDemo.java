package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
/*
 * 迭代器
 */
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("Hello");
		c.add("good");
		c.add("java");
		
		
		System.out.println(c);//不是遍历集合
		Iterator it = c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("*********************");
		//方法二
		for(String s:c){
		   System.out.println(s);
			
		}
		System.out.println("*********************");
		
		
		
	}

}
