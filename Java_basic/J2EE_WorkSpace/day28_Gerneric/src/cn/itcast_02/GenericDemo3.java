package cn.itcast_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * 
 * @author Administrator
 *
 */

public class GenericDemo3 {
	
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("abc", 123);
		map.put("hjk", 231);
		map.put("jlk", 232);
		
		//±éÀúmap¼¯ºÏ
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String,Integer> entry:entrySet){
			System.out.println(entry.getKey()+"----"+entry.getValue());
			
		}
		
	}

}
