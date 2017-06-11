package cn.itcast_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class GenericTest {

	 @Test
	 public void TestMap1(){
		 Map<Integer,String> map = new HashMap<Integer,String>();
		 map.put(1, "aa");
		 map.put(2, "bb");
		 map.put(3, "cc");
		 map.put(4, "dd");
		 //传统 用 keySet()获取Key的集合Set
		 Set<Integer> set = map.keySet();
		 for(Integer key:set){
			 String value = map.get(key);
			 System.out.println(key+"---"+value);
			 			 
		 }
		 
	 }
	 
	 @Test
	 public void TestMap2(){
		 Map<Integer,String> map = new HashMap<Integer,String>();
		 map.put(1, "aa");
		 map.put(2, "bb");
		 map.put(3, "cc");
		 map.put(4, "dd");
		 //entrySet() 映射关系的 Set 视图
		 Set<Map.Entry<Integer, String>> set =map.entrySet();
		 for(Map.Entry<Integer, String> entry:set){
			 Integer key = entry.getKey();
			 String value = entry.getValue();
			 System.out.println(key+"---"+value);
			 
		 }
		 
	 }
}
