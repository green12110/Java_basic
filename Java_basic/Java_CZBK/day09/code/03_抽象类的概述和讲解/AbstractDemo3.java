/*
һ�������û�г��󷽷����ɲ����Զ���Ϊ������?������ԣ���ʲô����?
	A:���ԡ�
	B:���ô�������

abstract���ܺ���Щ�ؼ��ֹ���?
	private	��ͻ
	final	��ͻ	
	static	������
*/
abstract class Fu {
	//public abstract void show();
	//�Ƿ������η����: abstract��private
	//private abstract void show();
	
	//�Ƿ������η����
	//final abstract void show();	
	
	//�Ƿ������η����
	static abstract void show();
	
	public static void method() {
		System.out.println("method");
	}
}

class Zi extends Fu {
	public void show() {}
}

class AbstractDemo3 {
	public static void main(String[] args) {
		Fu.method();
	}
}