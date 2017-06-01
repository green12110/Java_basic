package cn.reflect_02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import cn.reflect_01.Person;

/*
 * ͨ��������ȡ��Ա������ʹ��
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
		// ��ȡ�����ĳ�Ա����
		Field addField = pc.getField("address");
		System.out.println(addField);

		Constructor con = pc.getConstructor();
		Object obj = con.newInstance();

		addField.set(obj, "����������"); // Ϊobj����� address��Ա������ֵ
		System.out.println(obj);

		// ��ȡname�����丳ֵ
		Field nameField = pc.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(obj, "����");
		System.out.println(obj);

		// ��ȡage�����丳ֵ
		Field ageField = pc.getDeclaredField("age");
		//java.lang.IllegalAccessException:
		ageField.setAccessible(true);
		ageField.set(obj, 34);
		System.out.println(obj);

	}

}
