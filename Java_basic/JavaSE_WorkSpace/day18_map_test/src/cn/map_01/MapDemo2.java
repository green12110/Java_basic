package cn.map_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("����", "�����P");
		map.put("������", "��С�");
		map.put("١��Ϊ", "����");
		map.put("������", "��ӱ");
		
		System.out.println("get:"+map.get("������"));
		
		Set ss = map.keySet();
		System.out.println("key:"+ss);
		
		Collection cc = map.values();
		System.out.println("values:"+cc);
		
		for(String s:map.keySet()){
			String v = map.get(s);
			System.out.println(s+"---"+v);
			
		}
		
		

	}

}
