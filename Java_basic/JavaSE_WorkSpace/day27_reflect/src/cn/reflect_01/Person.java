package cn.reflect_01;

public class Person {
	
	private String name;
	int age;
	public String address;
	
	//���췽�� �ĸ� Ȩ�� �ֱ��� public private Ĭ��
	public Person(){
		
	}
	
	private Person(String name){
		this.name = name;
		
	}
	
	Person(int age){
		this.age = age;
	}
	
	/*public Person(String address){
		this.address = address;
		
	}*/

	

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

	
	
	
	
	
	
	

}
