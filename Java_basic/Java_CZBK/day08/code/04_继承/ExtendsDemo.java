/*
	�̳и�����
		�Ѷ��������ͬ�����ݸ���ȡ�������嵽һ�����С�
		
	���ʵ�ּ̳���?	
		Java�ṩ�˹ؼ��֣�extends
		
	��ʽ��
		class ������ extends ������ {}
		
	�ô���
		A:����˴���ĸ�����
		B:����˴����ά����
		C:��������֮������˹�ϵ���Ƕ�̬��ǰ��
	
	����������˹�ϵ����ʵҲ�Ǽ̳е�һ���׶ˣ�
		����������ǿ�ˡ�
		
		������ԭ�򣺵���ϣ����ھۡ�
		��ϣ�������Ĺ�ϵ
		�ھۣ������Լ����ĳ�����������
*/

//ʹ�ü̳�ǰ
/*
class Student {
	public void eat() {
		System.out.println("�Է�");
	}
	
	public void sleep() {
		System.out.println("˯��");
	}
}

class Teacher {
	public void eat() {
		System.out.println("�Է�");
	}
	
	public void sleep() {
		System.out.println("˯��");
	}
}
*/

//ʹ�ü̳к�
class Person {
	public void eat() {
		System.out.println("�Է�");
	}
	
	public void sleep() {
		System.out.println("˯��");
	}
}

class Student extends Person {}

class Teacher extends Person {}

class ExtendsDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.eat();
		s.sleep();
		System.out.println("-------------");
		
		Teacher t = new Teacher();
		t.eat();
		t.sleep();
	}
}