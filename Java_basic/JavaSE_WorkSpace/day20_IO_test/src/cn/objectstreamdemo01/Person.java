package cn.objectstreamdemo01;

import java.io.Serializable;

/*
 * 序列化 反序列化 实现java.io.Serializable接口
 * 该接口没有方法——此类接口叫做“标记接口”
 * 
 * 
 * 问题：
 *     class类本身发生改变 与 读取的文件的类（id值）不同则会报错
 *     如果class类改变，需要重新写
 * 解决：ID值在Java文件中是个固定的值
 *     黄色警告线
 *     
 *     
 * 注意：一个类中有的成员变量不想被序列化，怎么办？
 *     使用关键字transient
 *     
 * */
public class Person implements Serializable {

	private static final long serialVersionUID = 2459283592299451578L;
	private String name;
	// private int age;
	private transient int age;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	

}
