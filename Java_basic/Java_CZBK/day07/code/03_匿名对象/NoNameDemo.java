/*
	�������󣺾���û�����ֵĶ���
	
	���������Ӧ�ó�����
		A:���÷���������ֻ����һ�ε�ʱ��
			ע�⣺���ö�ε�ʱ�򣬲��ʺϡ�
			��ô����������������ʲô�ô���?
				�У��������������Ͼ������������Ա��������������ա�
		B:�������������Ϊʵ�ʲ�������
*/
class Student {
	public void show() {
		System.out.println("�Ұ�ѧϰ");
	}
}

class StudentDemo {
	public void method(Student s) {
		s.show();
	}
}

class NoNameDemo {
	public static void main(String[] args) {
		//�����ֵĵ���
		Student s = new Student();
		s.show();
		s.show();
		System.out.println("--------------");
		
		//��������
		//new Student();
		//����������÷���
		new Student().show();
		new Student().show(); //������ʵ�����´�����һ���µĶ���
		System.out.println("--------------");
		
		
		//����������Ϊʵ�ʲ�������
		StudentDemo sd = new StudentDemo();
		//Student ss = new Student();
		//sd.method(ss); //�����s��һ��ʵ�ʲ���
		//��������
		sd.method(new Student());
		
		//����һ��
		new StudentDemo().method(new Student());
 	}
}