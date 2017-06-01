package cn.jiehe2_01;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap嵌套HashMap
 * 
 * 传智播客
 * 		jc	基础班
 * 				陈玉楼		20
 * 				高跃		22
 * 		jy	就业班
 * 				李杰		21
 * 				曹石磊		23
 * 
 * 先存储元素，然后遍历元素
 */

public class HashMap2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  HashMap<String,HashMap<String,Integer>> czbkmp= new HashMap<String,HashMap<String,Integer>>();
	  
	  HashMap<String,Integer> stump1 = new HashMap<String,Integer>();	  
	  stump1.put("陈玉楼", 20);
	  stump1.put("高跃", 22);
	  czbkmp.put("jc", stump1);
	  
	  HashMap<String,Integer> stump2 = new HashMap<String,Integer>();
	  stump2.put("李杰", 21);
	  stump2.put("高跃", 22);
	  czbkmp.put("jy", stump2);
	  
	  //遍历
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
