package cn.propertiesdemo;

import java.util.Properties;
import java.util.Set;

/*
 * Properties �ɱ��������л�����м��ء�
 * Properties ��API�����û��<>,˵�����಻��һ�����ͣ�ʹ��ʱ���ܼӷ���
 * */
public class PropertiesDemo1 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		//Propeties �̳� HashTable������ʹ��Map������ķ��������Ԫ��
		prop.put("csdn1", "Hello");
		prop.put("csdn2","World");
		prop.put("csdn3", "Java");
		System.out.println("prop:"+prop);
		//prop:{csdn3=Java, csdn2=World, csdn1=Hello}
		
		//����map����
		Set<Object> set = prop.keySet();
		for(Object key:set){
			String value = (String)prop.get(key);
			System.out.println(key+"--"+value);
			
		}
	}

}
