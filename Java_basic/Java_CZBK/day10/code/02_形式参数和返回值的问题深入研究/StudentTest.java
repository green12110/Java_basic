/*
	��ʽ������
		��������(̫�򵥣������ҽ���Ҫ�����)
		��������
			����:(���������ʱ����ʵ�����Ѿ�������) ��Ҫ���Ǹ���Ķ���
			������:
			�ӿ�
*/
class Student {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class StudentDemo {
	public void method(Student s) { //ss; ss = new Student();  Student s = new Student();
		s.study();
	}
}

class StudentTest {
	public static void main(String[] args) {
		//������Ҫ����Student���study()����
		Student s = new Student();
		s.study();
		System.out.println("----------------");
		
		//����2����Ҫ����StudentDemo���е�method()����
		StudentDemo sd = new StudentDemo();
		Student ss = new Student();
		sd.method(ss);
		System.out.println("----------------");
		
		//���������÷�
		new StudentDemo().method(new Student());
	}
}
