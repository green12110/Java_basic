/*
	�̳��й��췽���Ĺ�ϵ
		A:���������еĹ��췽��Ĭ�϶�����ʸ����пղ����Ĺ��췽��
		B:Ϊʲô��?
			��Ϊ�����̳и����е����ݣ����ܻ���ʹ�ø�������ݡ�
			���ԣ������ʼ��֮ǰ��һ��Ҫ����ɸ������ݵĳ�ʼ����
			
			ע�⣺����ÿһ�����췽���ĵ�һ�����Ĭ�϶��ǣ�super();
*/
class Father {
	int age;

	public Father() {
		System.out.println("Father���޲ι��췽��");
	}
	
	public Father(String name) {
		System.out.println("Father�Ĵ��ι��췽��");
	}
}

class Son extends Father {
	public Son() {
		//super();
		System.out.println("Son���޲ι��췽��");
	}
	
	public Son(String name) {
		//super();
		System.out.println("Son�Ĵ��ι��췽��");
	}
}	

class ExtendsDemo6 {
	public static void main(String[] args) {
		//��������
		Son s = new Son();
		System.out.println("------------");
		Son s2 = new Son("����ϼ");
	}
}