package cn.hashmap01;

import java.util.HashMap;
/*
 * HashMap<Integer,String>
 * ����Integer
 * ֵ��String
 */

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(27, "����ϼ");
		hm.put(30, "������");
		hm.put(28, "����");
		hm.put(29, "����ϼ");
		
		//����HashMap����
		
		for(Integer key:hm.keySet()){
			String value = hm.get(key);
			System.out.println(key+"----"+value);
		}

	}

}
