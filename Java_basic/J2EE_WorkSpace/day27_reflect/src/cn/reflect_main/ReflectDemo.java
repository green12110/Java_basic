package cn.reflect_main;

import java.io.FileReader;
import java.util.Collection;
import java.util.Properties;

/**
 * ��ܵ�����
 * �����ࣺ�Լ����ñ��˵�д�õĶ���
 * ��ܣ�����д�õĶ��������Լ�
 *     �Լ��Ļ�û��д����ε��ã�
 *     �����÷���(�������ļ��ж�ȡ��������)
 * @author Administrator
 *
 */

public class ReflectDemo {
	
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("config.properties");
		Properties props = new Properties();
		props.load(fr);
		fr.close();
		
		//�õ������ļ��У�key��Ӧ��valueֵ
		String className = props.getProperty("className");
		Collection c = (Collection)Class.forName(className).newInstance();
		c.add("Java");
		c.add("C++");
		
		System.out.println(c.size());
	}

}
