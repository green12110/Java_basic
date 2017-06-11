package cn.reflect_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
 * дһ��������
public void setProperty(Object obj, String propertyName, Object value){}��
�˷����ɽ�obj��������ΪpropertyName�����Ե�ֵ����Ϊvalue��

 */

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Person p = new Person();
		Dog d = new Dog();
		
		ReflectDemo rf = new ReflectDemo();
		rf.setProperty(p, "name", "��˼��");
		rf.setProperty(d, "age", 5);
		
		p.show();
		d.show();
	}
	
	public void setProperty(Object obj, String propertyName, Object value) throws Exception{
		//��ȡClass��Ķ���
        Class c = obj.getClass();
        //��ȡClass����ĳ�Ա����propertyName
		Field field = c.getDeclaredField(propertyName);
		//ȡ�����ʼ��
		field.setAccessible(true);
		//Ϊobj�ĳ�Ա������ֵ
		field.set(obj, value);
		
		
	}

}


class Person{
	private String name;
	private int age;
	
	public void show(){
		System.out.println(name +"---------"+age);
	}
	
}

class Dog{
	private String name;
	private int age;
	
	public void show(){
		System.out.println(name +"---------"+age);
	}
	
}
