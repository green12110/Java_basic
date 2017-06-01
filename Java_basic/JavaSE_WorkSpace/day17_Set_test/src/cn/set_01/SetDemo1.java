package cn.set_01;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		set.add("Hello");
		set.add("world");
		set.add("Java");
		//set.add("Hello");
		/*
		set.add("Hello");
		set.add("world");
		set.add("java");
		set.add("com");
		set.add("photoshop");
		set.add("C++");
		set.add("IOS");
		set.add("Hello");  // 去重
		set.add("photoshop"); //去重
		*/
		
		for(String s:set){
			System.out.println(s);
			
		}
		

	}

}
