/*
	����ֵ����
		��������:(��������̫�򵥣��Ҳ�׼������)
		�������ͣ�
			��:���ص��Ǹ���Ķ���
			������:���ص��Ǹó�������������
			�ӿ�:
*/
abstract class Person {
	public abstract void study();
}

class PersonDemo {
	public Person getPerson() {
		//Person p = new Student();
		//return p;
		
		return new Student();
	}
}

class Student extends Person {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class PersonTest2 {
	public static void main(String[] args) {
		//������Ҫ����Person���е�study()����
		PersonDemo pd = new PersonDemo();
		Person p = pd.getPerson(); //new Student();  Person p = new Student(); ��̬
		p.study();
	}
}