package cn.itcast_07;
/*
 * protected Object clone()
 * 1����д����
 * 2��ʵ�ֽӿ� Cloneable
 * */
public class StudentDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student s = new Student("���",2);
		Object obj = s.clone();
		Student so = (Student)obj;
		
		System.out.println(so.getName()+"-----"+so.getAge());
		so.setName("����");
		so.setAge(4);
		System.out.println(so.getName()+"-----"+so.getAge());

	}

}
