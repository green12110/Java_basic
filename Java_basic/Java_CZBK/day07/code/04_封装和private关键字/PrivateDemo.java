/*
	private:
		��һ��Ȩ�����η�
		�������γ�Ա�����ͳ�Ա����
		�������εĳ�Աֻ���ڱ����б�����
*/
class Demo {
	//int num = 10;
	//��private����
	private int num = 10;
	
	public void show() {
		System.out.println(num);
	}
	
	private void method() {
		System.out.println("method");
	}
	
	public void function() {
		method();
	}
}

class PrivateDemo {
	public static void main(String[] args) {
		Demo d = new Demo();
		//���ܷ���˽�еĳ�Ա����
		//System.out.println(d.num);
		d.show();
		//���ܷ���˽�еĳ�Ա����
		//d.method();
		d.function();
	}
}

