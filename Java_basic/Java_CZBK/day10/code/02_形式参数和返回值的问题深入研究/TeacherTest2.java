/*
	����ֵ����
		��������:(��������̫�򵥣��Ҳ�׼������)
		�������ͣ�
			��:���ص��Ǹ���Ķ���
			������:���ص��Ǹó�������������
			�ӿ�:���ص��Ǹýӿڵ�ʵ����Ķ���
*/
//����һ�����õĽӿ�
interface Love {
	public abstract void love();
}

class LoveDemo {
	public Love getLove() {
		//Love l = new Teacher();
		//return l;
		
		return new Teacher();
	}
}

//���������ʵ�ֽӿ�
class Teacher implements Love {
	public void love() {
		System.out.println("��ʦ��ѧ��,��Java,������ϼ");
	}
}

class TeacherTest2 {
	public static void main(String[] args) {
		//��β�����?
		LoveDemo ld = new LoveDemo();
		Love l = ld.getLove(); //new Teacher(); Love l = new Teacher(); ��̬
		l.love();
	}
}