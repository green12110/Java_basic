/*
	�ֻ���Ĳ���
*/
class Phone {
	//Ʒ��
	String brand;
	//�۸�
	int price;
	//��ɫ
	String color;
	
	//��绰�ķ���
	public void call(String name) {
		System.out.println("��"+name+"��绰");
	}
	
	//�����ŵķ���
	public void sendMessage() {
		System.out.println("Ⱥ������");
	}
	
	//����Ϸ�ķ���
	public void playGame() {
		System.out.println("����Ϸ");
	}
}

class PhoneDemo {
	public static void main(String[] args) {
		//�����ֻ�����
		//���� ������ = new ����();
		Phone p = new Phone();
		
		//ֱ�������Ա����ֵ
		System.out.println(p.brand+"---"+p.price+"---"+p.color);
		
		//����Ա������ֵ
		p.brand = "ŵ����";
		p.price = 100;
		p.color = "��ɫ";
		//�ٴ����
		System.out.println(p.brand+"---"+p.price+"---"+p.color);
		
		//���÷���
		p.call("����ϼ");
		p.sendMessage();
		p.playGame();
	}
}