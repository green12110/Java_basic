package cn.hashmap01;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm = new HashMap<String,String>();

		hm.put("it001", "����");
		hm.put("it003", "����");
		hm.put("it004", "�ǲ�˹");
		hm.put("it005", "�ų���");
		hm.put("it002", "�ò���"); // wps
		hm.put("it001", "�ȶ��Ǵ�");
		
		//����HashMap
		for(String key:hm.keySet()){
			String value = hm.get(key);
			System.out.println(value+"---"+key);
			
		}

	}

}
