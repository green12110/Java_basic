package cn.itcast_01;

import java.util.Date;

public class Person {
	
	private String name;
	int age;
	public String address;
	private Date birthday;
	
	//���췽�� �ĸ� Ȩ�� �ֱ��� public private Ĭ��
	public Person(){
		
	}
	
	private Person(String name){
		this.name = name;
		
	}
	
	Person(int age){
		this.age = age;
	}
	

	

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	//��Ա�����ĸ���һ����дtoString����
	public void show() {
		System.out.println("show");
	}

	public void method(String s) {
		System.out.println("method:" + s);
	}

	public String getString(String s, int i) {
		return s + "---" + i;
	}

	private void function() {
		System.out.println("function");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address
				+ "]";
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
	

	
	
	
	
	
	
	

}