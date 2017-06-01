package cn.map_01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("文章", "马伊琍");
		map.put("贾乃亮", "李小璐");
		map.put("佟大为", "关悦");
		map.put("黄晓明", "杨颖");
		
		System.out.println("get:"+map.get("黄晓明"));
		
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
