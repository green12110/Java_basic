/*
	�����ڲ��������⣺
		����Ҫ�󣬲������
			interface Inter { void show(); }
			class Outer { //������� }
			class OuterDemo {
				public static void main(String[] args) {
					  Outer.method().show();
				  }
			}
			Ҫ���ڿ���̨�����HelloWorld��
*/
interface Inter { 
	void show(); 
	//public abstract
}

class Outer { 
	//�������
	public static Inter method() {
		//������� -- ������������
		return new Inter() {
			public void show() {
				System.out.println("HelloWorld");
			}
		};
	}
}

class OuterDemo {
	public static void main(String[] args) {
		Outer.method().show();
		/*
			1:Outer.method()���Կ���method()Ӧ����Outer�е�һ����̬������
			2:Outer.method().show()���Կ���method()�����ķ���ֵ��һ������
				�����ڽӿ�Inter����һ��show()����,��������Ϊmethod()�����ķ���ֵ������һ���ӿڡ�
		*/
	}
}