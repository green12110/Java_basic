package cn.reflect_05;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDao ud = new UserDaoImpl();
		ud.add();
		ud.delete();
		ud.update();
		ud.find();
		System.out.println("----------------------------");
		// ��ʵ������Ӧ����������ӵ�:
		// ��ÿ������ִ��ǰ��Ӧ�ÿ������Ƿ���Ȩ�޽����������
		// ˭�����������������ø������¼�¼,����һ��Userdao��ʵ����

		UserDao ud2 = new UserDaoImpl2();
		ud2.add();
		ud2.delete();
		ud2.update();
		ud2.find();
		System.out.println("----------------------------");

		Student st = new StudentImpl();
		st.login();
		st.register();
		System.out.println("----------------------------");
		// ��ʵ������Ӧ����������ӵ�:
		// ��ÿ������ִ��ǰ��Ӧ�ÿ������Ƿ���Ȩ�޽����������
		// ˭�����������������ø������¼�¼,����һ��Student��ʵ����
		Student st2 = new StudentImpl2();
		st2.login();
		st2.register();

	}

}
