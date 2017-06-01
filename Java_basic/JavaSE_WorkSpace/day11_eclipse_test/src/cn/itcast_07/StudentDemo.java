package cn.itcast_07;
/*
 * protected Object clone()
 * 1、重写方法
 * 2、实现接口 Cloneable
 * */
public class StudentDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student s = new Student("多多",2);
		Object obj = s.clone();
		Student so = (Student)obj;
		
		System.out.println(so.getName()+"-----"+so.getAge());
		so.setName("熊熊");
		so.setAge(4);
		System.out.println(so.getName()+"-----"+so.getAge());

	}

}
