package cn.Hashtable_test;

import java.util.Hashtable;

/*
 * Hashtable��HashMap������
 */
public class HashtableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	HashMap<String,String> hm = new HashMap<String,String>();
		hm.put(null, "����");
		hm.put("����Ȼ", null);		
		System.out.println(hm);*/
		
		Hashtable<String,String> ht= new Hashtable<String,String>();
		ht.put(null, "����");
		ht.put("����Ȼ", null);		
		System.out.println(ht);

	}

}
