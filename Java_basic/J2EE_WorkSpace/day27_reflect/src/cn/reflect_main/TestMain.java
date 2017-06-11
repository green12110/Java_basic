package cn.reflect_main;

import java.lang.reflect.Method;


/**
 * 写一个程序根据用户提供的类型，通过反射调用main方法
 * main方法的参数名 就是要启动的类名
 * 
 * @author Administrator
 *
 */

public class TestMain {
	
	
	public static void main(String[] args) throws Exception{
		//ParaOutput.main(new String[]{"aa","bb","cc"});
		//通过参数传递要要反射的类名
		String className = args[0];
		//得到该类的方法名
		Method method = Class.forName(className).getMethod("main", String[].class);
		//调用方法
		method.invoke(null, (Object)new String[]{"aa","bb","cc"});
	}

}
