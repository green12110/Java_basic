package cn.reflect_main;

import java.lang.reflect.Method;


/**
 * дһ����������û��ṩ�����ͣ�ͨ���������main����
 * main�����Ĳ����� ����Ҫ����������
 * 
 * @author Administrator
 *
 */

public class TestMain {
	
	
	public static void main(String[] args) throws Exception{
		//ParaOutput.main(new String[]{"aa","bb","cc"});
		//ͨ����������ҪҪ���������
		String className = args[0];
		//�õ�����ķ�����
		Method method = Class.forName(className).getMethod("main", String[].class);
		//���÷���
		method.invoke(null, (Object)new String[]{"aa","bb","cc"});
	}

}
