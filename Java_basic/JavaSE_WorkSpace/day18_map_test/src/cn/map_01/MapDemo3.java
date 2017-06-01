package cn.map_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
 * 遍历Map集合方法二：
 * Set<Map.Entry<k,v>> entrySet()
 */

public class MapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("文章", "马伊琍");
		map.put("贾乃亮", "李小璐");
		map.put("佟大为", "关悦");
		map.put("黄晓明", "杨颖");
		//map的key不能重复，相当于一个set集合。
		//Map类的 entrySet()返回此映射中包含的映射关系的 Set 视图。
		Set<Map.Entry<String,String>> set = map.entrySet();
		for(Map.Entry<String,String> m:set){
			String key =m.getKey();
			String value = m.getValue();
			System.out.println(key+"----"+value);
			
			
		}

	}

}
