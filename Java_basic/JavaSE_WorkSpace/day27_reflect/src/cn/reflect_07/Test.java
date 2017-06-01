package cn.reflect_07;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDao ud = new UserDaoImpl();
		ud.add();
		ud.delete();
		ud.update();
		ud.find();
		System.out.println("------------------");
		// ����Ҫ����һ����̬�������
		// Proxy������һ���������Դ�����̬�������
		//public static Object newProxyInstance(ClassLoader loader,
        //        Class<?>[] interfaces,
         //       InvocationHandler h)
		MyInvocationHandler hander = new MyInvocationHandler(ud);
		UserDao ud2 = (UserDao)Proxy.newProxyInstance(ud.getClass().getClassLoader(), ud.getClass().getInterfaces(),
				             hander);
		ud2.add();
		ud2.delete();
		ud2.update();
		ud2.find();
		System.out.println("---------------");
		
		Student st = new StudentImpl();
		MyInvocationHandler hander2 = new MyInvocationHandler(st);
		Student st2 = (Student)Proxy.newProxyInstance(st.getClass().getClassLoader(), st.getClass().getInterfaces(),
	             hander2);
		st2.login();
		st2.register();
		

	}

}
