package cn.jiehe2_01;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMapǶ��HashMap
 * 
 * ���ǲ���
 * 		jc	������
 * 				����¥		20
 * 				��Ծ		22
 * 		jy	��ҵ��
 * 				���		21
 * 				��ʯ��		23
 * 
 * �ȴ洢Ԫ�أ�Ȼ�����Ԫ��
 */

public class HashMap2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  HashMap<String,HashMap<String,Integer>> czbkmp= new HashMap<String,HashMap<String,Integer>>();
	  
	  HashMap<String,Integer> stump1 = new HashMap<String,Integer>();	  
	  stump1.put("����¥", 20);
	  stump1.put("��Ծ", 22);
	  czbkmp.put("jc", stump1);
	  
	  HashMap<String,Integer> stump2 = new HashMap<String,Integer>();
	  stump2.put("���", 21);
	  stump2.put("��Ծ", 22);
	  czbkmp.put("jy", stump2);
	  
	  //����
	  Set<String> set = czbkmp.keySet();
	  for(String key:set){
		  HashMap<String,Integer> value = czbkmp.get(key);
		  //System.out.println(key+"--"+value);
		  Set<String> nameset = value.keySet();
		  for(String key1:nameset){
			  Integer value1 = value.get(key1);			  
			  System.out.println(key+"--"+key1+"--"+value1);
		  }
		  
	  }
	  
	  

	}

}
