package cn.set_02;

public class Student {
	private String name;
	private int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
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
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub

		if (this == obj) {
			return true;
		}
		
		if(!(obj instanceof Student)){
			return false;
		}
		
		Student s = (Student)obj;
		return this.name.equals(s.name) && this.age==s.age;
	}

}
