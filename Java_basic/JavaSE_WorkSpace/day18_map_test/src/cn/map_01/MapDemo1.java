package cn.map_01;

import java.util.HashMap;
import java.util.Map;

/*
 * Map���ϣ����޶ԣ�
 */

public class MapDemo1 {
	 public static void main(String[] args) {
		 Map<String,String> map = new HashMap<String,String>();
		 map.put("001", "����");
		 map.put("002", "��Ī��");
		 map.put("003", "����");
		 
		 //System.out.println("remove:"+map.remove("002"));
		 System.out.println("containsKey:"+map.containsKey("004"));
		 System.out.println(map.containsValue("����"));
		 
		 //System.out.println(map.put("001", "����"));
		 //System.out.println(map.put("001", "����"));
		 
         System.out.println(map);		
	}

}
