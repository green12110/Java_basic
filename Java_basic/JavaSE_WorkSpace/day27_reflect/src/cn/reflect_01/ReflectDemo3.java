package cn.reflect_01;
/*
 * ����ͨ������ȥ��ȡ�ù��췽����ʹ�ã�
 * public Person(String name, int age, String address)
 */

import java.lang.reflect.Constructor;

public class ReflectDemo3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class pc = Class.forName("cn.reflect_01.Person");
		Constructor con = pc.getConstructor(String.class,int.class,String.class);
		Object obj = con.newInstance("����",23,"����������");
		System.out.println(obj);
		
		

	}

}
