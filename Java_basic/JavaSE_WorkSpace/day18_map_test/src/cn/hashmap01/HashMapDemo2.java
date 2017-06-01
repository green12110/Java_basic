package cn.hashmap01;

import java.util.HashMap;
/*
 * HashMap<Integer,String>
 * 键：Integer
 * 值：String
 */

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(27, "林青霞");
		hm.put(30, "风清扬");
		hm.put(28, "刘意");
		hm.put(29, "林青霞");
		
		//遍历HashMap集合
		
		for(Integer key:hm.keySet()){
			String value = hm.get(key);
			System.out.println(key+"----"+value);
		}

	}

}
