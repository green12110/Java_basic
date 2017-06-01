package cn.hashmap01;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> hm = new HashMap<String,String>();

		hm.put("it001", "马云");
		hm.put("it003", "马化腾");
		hm.put("it004", "乔布斯");
		hm.put("it005", "张朝阳");
		hm.put("it002", "裘伯君"); // wps
		hm.put("it001", "比尔盖茨");
		
		//遍历HashMap
		for(String key:hm.keySet()){
			String value = hm.get(key);
			System.out.println(value+"---"+key);
			
		}

	}

}
