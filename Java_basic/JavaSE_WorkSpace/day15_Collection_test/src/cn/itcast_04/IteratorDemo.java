package cn.itcast_04;

import java.util.ArrayList;
import java.util.Collection;
/*
 * ������
 */
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("Hello");
		c.add("good");
		c.add("java");
		
		
		System.out.println(c);//���Ǳ�������
		Iterator it = c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("*********************");
		//������
		for(String s:c){
		   System.out.println(s);
			
		}
		System.out.println("*********************");
		
		
		
	}

}
