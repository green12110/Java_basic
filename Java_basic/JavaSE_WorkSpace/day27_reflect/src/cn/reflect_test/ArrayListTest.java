package cn.reflect_test;

import java.lang.reflect.Method;
import java.util.ArrayList;
/*
 *
 * 我给你ArrayList<Integer>的一个对象，我想在这个集合中添加一个字符串数据，如何实现呢？
 */

public class ArrayListTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		Class c = array.getClass();
		//通过反射得到add方法，参数是Object.class
		Method addmt = c.getMethod("add", Object.class);
		//调用array对象的addmt方法，参数是Hello
		addmt.invoke(array, "Hello");
		addmt.invoke(array, "Java");
		addmt.invoke(array, "World");
		
		System.out.println(array);
		
		

	}

}
