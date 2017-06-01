package cn.map_01;

import java.util.HashMap;
import java.util.Map;

/*
 * Map¼¯ºÏ£¨·òÆŞ¶Ô£©
 */

public class MapDemo1 {
	 public static void main(String[] args) {
		 Map<String,String> map = new HashMap<String,String>();
		 map.put("001", "»ÆÈØ");
		 map.put("002", "ÀîÄª³î");
		 map.put("003", "¹ù¾¸");
		 
		 //System.out.println("remove:"+map.remove("002"));
		 System.out.println("containsKey:"+map.containsKey("004"));
		 System.out.println(map.containsValue("¹ù¾¸"));
		 
		 //System.out.println(map.put("001", "»ÆÈØ"));
		 //System.out.println(map.put("001", "¹ù¾¸"));
		 
         System.out.println(map);		
	}

}
