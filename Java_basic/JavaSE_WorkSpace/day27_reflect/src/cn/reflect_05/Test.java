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
		// 真实的需求应该是这个样子的:
		// 在每个操作执行前：应该看看你是否有权限进行这个操作
		// 谁操作的这个东西，你得给我留下记录,新增一个Userdao的实现类

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
		// 真实的需求应该是这个样子的:
		// 在每个操作执行前：应该看看你是否有权限进行这个操作
		// 谁操作的这个东西，你得给我留下记录,新增一个Student的实现类
		Student st2 = new StudentImpl2();
		st2.login();
		st2.register();

	}

}
