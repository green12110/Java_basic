package cn.reflect_test;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileReader fr = new FileReader("text.txt");
		prop.load(fr);
		fr.close();
		
		String className = prop.getProperty("className");
		String method = prop.getProperty("MethodName");
		
		Class c = Class.forName(className);
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		Method m = c.getMethod(method);
		m.invoke(obj);

	}

}
