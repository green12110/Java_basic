package cn.propertiesdemo;

import java.util.Properties;
import java.util.Set;

/*
 * 特殊功能：
 * public Object setProperty(String key,String value)：添加元素
 * public String getProperty(String key):获取元素
 * public Set<String> stringPropertyNames():获取所有的键的集合
 */
public interface PropertiesDemo2 {
	public static void main(String[] args) {
		//创建Properties对象
		Properties prop = new Properties();
		//添加元素
		prop.setProperty("文章", "马伊俐");
		prop.setProperty("李亚鹏", "王菲");
		prop.setProperty("陈赫", "张子萱");
		//获取key的Set集合
		Set<String> set = prop.stringPropertyNames();
		//遍历
		for(String key:set){
			String value = prop.getProperty(key);
			System.out.println(key+"---"+value);
			
		}
		
		
	}

}
