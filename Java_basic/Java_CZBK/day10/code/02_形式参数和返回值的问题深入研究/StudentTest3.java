/*
	��ʽ��̡�
		ÿ�ε�����Ϸ����󣬷��ص���һ������
*/
class Student {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class StudentDemo {
	public Student getStudent() {
		return new Student();
	}
}

class StudentTest3 {
	public static void main(String[] args) {
		//��ε��õ���?
		StudentDemo sd = new StudentDemo();
		//Student s = sd.getStudent();
		//s.study();
		
		//���ע����
		sd.getStudent().study();
	}
}