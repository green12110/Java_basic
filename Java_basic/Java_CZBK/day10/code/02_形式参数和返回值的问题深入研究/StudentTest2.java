/*
	����ֵ����
		��������:(��������̫�򵥣��Ҳ�׼������)
		�������ͣ�
			��:���ص��Ǹ���Ķ���
			������:
			�ӿ�:
*/
class Student {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class StudentDemo {
	public Student getStudent() {
		//Student s = new Student();
		//Student ss = s;
		
		//Student s = new Student();
		//return s;
		return new Student();
	}
}

class StudentTest2 {
	public static void main(String[] args) {
		//������Ҫʹ��Student���е�study()����
		//���ǣ���һ���ҵ�Ҫ���ǣ���Ҫֱ�Ӵ���Student�Ķ���
		//����ʹ��StudentDemo���㴴������
		StudentDemo sd = new StudentDemo();
		Student s = sd.getStudent(); //new Student(); Student s = new Student();
		s.study();
	}
}