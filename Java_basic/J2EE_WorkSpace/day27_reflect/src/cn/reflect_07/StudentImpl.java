package cn.reflect_07;

public class StudentImpl implements Student {

	@Override
	public void login() {
		System.out.println("学生登录");

	}

	@Override
	public void register() {
		System.out.println("学生注册");
	}

}
