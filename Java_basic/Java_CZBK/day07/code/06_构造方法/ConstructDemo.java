/*
	���췽����
		����������ݽ��г�ʼ��

	��ʽ��
		A:��������������ͬ
		B:û�з���ֵ���ͣ���void��û��
		C:û�о���ķ���ֵ
*/
class Student {
	private String name; //null
	private int age; //0
	
	public Student() {
		System.out.println("���ǹ��췽��");
	}
}

class ConstructDemo {
	public static void main(String[] args) {
		//��������
		Student s = new Student();
		System.out.println(s); //Student@e5bbd6
	}
}