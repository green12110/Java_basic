/*
	�����ɣ���Ա��������Ա����
	���������ּ�����һ���µĳ�Ա�����췽����
	�Ժ����������ɣ�
		��Ա����
		���췽��
		��Ա����
			���ݷ���ֵ��
				void����
				��void����
			��ʽ������
				�ղη���
				�ǿղη���
*/
class Student {
	public String getString() {
		return "helloworld";
	}

	public void show() {
		System.out.println("show");
	}
	
	public void method(String name) {
		System.out.println(name);
	}
	
	public String function(String s1,String s2) {
		return s1+s2;
	}
}

class StudentDemo {
	public static void main(String[] args) {
		//��������
		Student s = new Student();
		
		//�����޲��޷���ֵ����
		s.show();
		
		//�����޲��з���ֵ����
		String result = s.getString();
		System.out.println(result);
		
		//���ô����޷���ֵ�ķ���
		s.method("����ϼ");
		
		//���ô��δ�����ֵ�ķ���
		String result2 = s.function("hello","world");
		System.out.println(result2);
	}
}