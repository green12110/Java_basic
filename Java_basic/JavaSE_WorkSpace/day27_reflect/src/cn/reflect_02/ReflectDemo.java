package cn.reflect_02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import cn.reflect_01.Person;

/*
 * 通过发生获取成员变量并使用
 */
public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		Class pc = Class.forName("cn.reflect_01.Person");

		/*
		 * Field[] field = pc.getFields(); for(Field f : field){
		 * System.out.println(f);
		 * 
		 * } System.out.println("--------------------------"); Field[] fi =
		 * pc.getDeclaredFields(); for(Field f: fi){ System.out.println(f);
		 * 
		 * } System.out.println("------------------------------");
		 */
		// 获取单个的成员变量
		Field addField = pc.getField("address");
		System.out.println(addField);

		Constructor con = pc.getConstructor();
		Object obj = con.newInstance();

		addField.set(obj, "北京海淀区"); // 为obj对象的 address成员变量赋值
		System.out.println(obj);

		// 获取name并对其赋值
		Field nameField = pc.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(obj, "刘毅");
		System.out.println(obj);

		// 获取age并对其赋值
		Field ageField = pc.getDeclaredField("age");
		//java.lang.IllegalAccessException:
		ageField.setAccessible(true);
		ageField.set(obj, 34);
		System.out.println(obj);

	}

}
