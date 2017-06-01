package cn.itcast_06;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setName("¸ðö©");
		s.setAge(23);
		s.show();
		System.out.println("----------------");
		
		Student s1 = new Student("Áõ·Æ·Æ",34);
		s1.show();
		System.out.println(s1.toString());
		System.out.println(s1.getClass().toString());

	}

}
