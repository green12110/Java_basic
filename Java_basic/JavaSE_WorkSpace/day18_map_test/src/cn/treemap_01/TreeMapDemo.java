package cn.treemap_01;

import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap:�ǻ��ں������Map�ӿڵ�ʵ�֡�
 * 
 * HashMap<String,String>
 * ����String
 * ֵ��String
 */

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> tm = new TreeMap<String,String>();
		// ����Ԫ�ز����Ԫ��
		tm.put("hello", "���");
		tm.put("world", "����");
		tm.put("java", "צ��");
		tm.put("world", "����2");
		tm.put("javaee", "צ��EE");
		
		//����TreeMap
		Set<String> set = tm.keySet();
		for(String key:set){
			String value = tm.get(key);
			System.out.println(key+"---"+value);
		}
		
		

	}

}
