package cn.reflect_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
 * 写一个方法，
public void setProperty(Object obj, String propertyName, Object value){}，
此方法可将obj对象中名为propertyName的属性的值设置为value。

 */

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Person p = new Person();
		Dog d = new Dog();
		
		ReflectDemo rf = new ReflectDemo();
		rf.setProperty(p, "name", "王思聪");
		rf.setProperty(d, "age", 5);
		
		p.show();
		d.show();
	}
	
	public void setProperty(Object obj, String propertyName, Object value) throws Exception{
		//获取Class类的对象
        Class c = obj.getClass();
        //获取Class对象的成员变量propertyName
		Field field = c.getDeclaredField(propertyName);
		//取消访问检查
		field.setAccessible(true);
		//为obj的成员变量赋值
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
