package cn.reflect_01;

import java.lang.reflect.Constructor;

/*
 * 需求：通过反射获取私有构造方法并使用
 * private Person(String name){}
 */

public class ReflectDemo4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class pc = Class.forName("cn.reflect_01.Person");
		
		Constructor con = pc.getDeclaredConstructor(String.class);
		con.setAccessible(true);
		Object obj = con.newInstance("刘毅");
		System.out.println(obj);

	}

}
