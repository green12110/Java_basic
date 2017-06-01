package cn.reflect_05;

public class UserDaoImpl2 implements UserDao {

	@Override
	public void add() {
		System.out.println("校验权限");
		System.out.println("增加功能");
		
	}

	@Override
	public void delete() {
		System.out.println("校验权限");
		System.out.println("删除功能");
		System.out.println("记录日志");
		
	}

	@Override
	public void update() {
		System.out.println("校验权限");
		System.out.println("修改功能");
		System.out.println("记录日志");
		
	}

	@Override
	public void find() {
		System.out.println("校验权限");
		System.out.println("查找功能");
		System.out.println("记录日志");
		
	}

}
