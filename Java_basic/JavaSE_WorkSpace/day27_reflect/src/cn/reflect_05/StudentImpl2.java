package cn.reflect_05;

public class StudentImpl2 implements Student {

	@Override
	public void login() {
		System.out.println("校验权限");
		System.out.println("学生登录");
		System.out.println("记录日志");

	}

	@Override
	public void register() {
		System.out.println("校验权限");
		System.out.println("学生注册");
		System.out.println("记录日志");
	}
}
