package cn.objectstreamdemo01;

import java.io.Serializable;

/*
 * ���л� �����л� ʵ��java.io.Serializable�ӿ�
 * �ýӿ�û�з�����������ӿڽ�������ǽӿڡ�
 * 
 * 
 * ���⣺
 *     class�౾�����ı� �� ��ȡ���ļ����ࣨidֵ����ͬ��ᱨ��
 *     ���class��ı䣬��Ҫ����д
 * �����IDֵ��Java�ļ����Ǹ��̶���ֵ
 *     ��ɫ������
 *     
 *     
 * ע�⣺һ�������еĳ�Ա�������뱻���л�����ô�죿
 *     ʹ�ùؼ���transient
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
