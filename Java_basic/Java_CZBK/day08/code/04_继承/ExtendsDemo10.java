/*
	������д��ע������
		A:������˽�з������ܱ���д
			��Ϊ����˽�з�������������޷��̳�
		B:������д���෽��ʱ������Ȩ�޲��ܸ���
			��þ�һ��
		C:���ྲ̬����������Ҳ����ͨ����̬����������д
			��ʵ����㲻�Ϸ�����д����������ȷʵ��ˣ�����Ϊʲô�㲻�Ϸ�����д����̬���һὲ��
			
		������д���෽����ʱ���������һģһ����
*/
class Father {
	//private void show() {}
	
	/*
	public void show() {
		System.out.println("show Father");
	}
	*/
	
	void show() {
		System.out.println("show Father");
	}
	/*
	public static void method() {
		
	}
	*/
	
	public void method() {
		
	}
}

class Son extends Father {
	//private void show() {}

	/*
	public void show() {
		System.out.println("show Son");
	}
	*/
	
	public void show() {
		System.out.println("show Son");
	}
	
	
	public static void method() {
	
	}
	
	/*
	public void method() {
	
	}
	*/
}

class ExtendsDemo10 {
	public static void main(String[] args) {
		Son s = new Son();
		s.show();
	}
}