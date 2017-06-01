package cn.propertiesdemo;

import java.util.Properties;
import java.util.Set;

/*
 * Properties 可保存在流中或从流中加载。
 * Properties 看API，如果没有<>,说明该类不是一个泛型，使用时不能加泛型
 * */
public class PropertiesDemo1 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		//Propeties 继承 HashTable，可以使用Map集合类的方法来添加元素
		prop.put("csdn1", "Hello");
		prop.put("csdn2","World");
		prop.put("csdn3", "Java");
		System.out.println("prop:"+prop);
		//prop:{csdn3=Java, csdn2=World, csdn1=Hello}
		
		//遍历map集合
		Set<Object> set = prop.keySet();
		for(Object key:set){
			String value = (String)prop.get(key);
			System.out.println(key+"--"+value);
			
		}
	}

}
