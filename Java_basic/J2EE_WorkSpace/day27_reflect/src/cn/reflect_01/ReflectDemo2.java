package cn.reflect_01;

import java.lang.reflect.Constructor;

/* 
 * 通过反射获取构造方法并使用:
 * public Constructor<?>[] getConstructors()
 * public Constructor<?>[] getDeclaredConstructors()
 * public Constructor<T> getConstructor(Class<?>... parameterTypes)
 * 
 * 
 * 
 */

public class ReflectDemo2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class pc = Class.forName("cn.reflect_01.Person");
		/*Constructor[] cons1 = pc.getConstructors();
		Constructor[] cons2 = pc.getDeclaredConstructors();
		for (Constructor c : cons1) {
			System.out.println(c);
		}
		System.out.println("----------------------------------------");
		for (Constructor c : cons2) {
			System.out.println(c);
		}
		System.err.println("----------------------------------------")*/;
		Constructor con = pc.getConstructor();
		System.out.println(con);
		Object obj =  con.newInstance();
		System.out.println(obj);
		

	}

}
