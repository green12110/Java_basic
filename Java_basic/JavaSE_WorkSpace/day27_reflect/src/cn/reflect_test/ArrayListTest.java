package cn.reflect_test;

import java.lang.reflect.Method;
import java.util.ArrayList;
/*
 *
 * �Ҹ���ArrayList<Integer>��һ������������������������һ���ַ������ݣ����ʵ���أ�
 */

public class ArrayListTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		Class c = array.getClass();
		//ͨ������õ�add������������Object.class
		Method addmt = c.getMethod("add", Object.class);
		//����array�����addmt������������Hello
		addmt.invoke(array, "Hello");
		addmt.invoke(array, "Java");
		addmt.invoke(array, "World");
		
		System.out.println(array);
		
		

	}

}
