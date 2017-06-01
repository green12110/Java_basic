package cn.reflect_01;
/*
 * 需求：通过反射去获取该构造方法并使用：
 * public Person(String name, int age, String address)
 */

import java.lang.reflect.Constructor;

public class ReflectDemo3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class pc = Class.forName("cn.reflect_01.Person");
		Constructor con = pc.getConstructor(String.class,int.class,String.class);
		Object obj = con.newInstance("刘毅",23,"北京海淀区");
		System.out.println(obj);
		
		

	}

}
