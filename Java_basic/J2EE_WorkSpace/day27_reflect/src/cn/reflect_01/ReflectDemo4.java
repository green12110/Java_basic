package cn.reflect_01;

import java.lang.reflect.Constructor;

/*
 * ����ͨ�������ȡ˽�й��췽����ʹ��
 * private Person(String name){}
 */

public class ReflectDemo4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class pc = Class.forName("cn.reflect_01.Person");
		
		Constructor con = pc.getDeclaredConstructor(String.class);
		con.setAccessible(true);
		Object obj = con.newInstance("����");
		System.out.println(obj);

	}

}
