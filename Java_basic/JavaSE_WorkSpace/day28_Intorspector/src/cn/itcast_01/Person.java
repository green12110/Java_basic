package cn.itcast_01;

public class Person {
	
	private String name;
	int age;
	public String address;
	
	//构造方法 四个 权限 分别是 public private 默认
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
	
	//成员方法四个，一个重写toString（）
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
	
	

	
	
	
	
	
	
	

}
