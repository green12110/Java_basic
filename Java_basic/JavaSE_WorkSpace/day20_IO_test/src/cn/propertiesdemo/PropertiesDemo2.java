package cn.propertiesdemo;

import java.util.Properties;
import java.util.Set;

/*
 * ���⹦�ܣ�
 * public Object setProperty(String key,String value)�����Ԫ��
 * public String getProperty(String key):��ȡԪ��
 * public Set<String> stringPropertyNames():��ȡ���еļ��ļ���
 */
public interface PropertiesDemo2 {
	public static void main(String[] args) {
		//����Properties����
		Properties prop = new Properties();
		//���Ԫ��
		prop.setProperty("����", "������");
		prop.setProperty("������", "����");
		prop.setProperty("�º�", "������");
		//��ȡkey��Set����
		Set<String> set = prop.stringPropertyNames();
		//����
		for(String key:set){
			String value = prop.getProperty(key);
			System.out.println(key+"---"+value);
			
		}
		
		
	}

}
