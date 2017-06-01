package cn.Hashtable_test;

import java.util.Hashtable;

/*
 * Hashtable与HashMap的区别
 */
public class HashtableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	HashMap<String,String> hm = new HashMap<String,String>();
		hm.put(null, "王菲");
		hm.put("井柏然", null);		
		System.out.println(hm);*/
		
		Hashtable<String,String> ht= new Hashtable<String,String>();
		ht.put(null, "王菲");
		ht.put("井柏然", null);		
		System.out.println(ht);

	}

}
