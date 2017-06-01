package cn.propertiesdemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 * 有一个文本文件(user.txt)，我知道数据是键值对形式的，但是不知道内容是什么。
 * 请写一个程序判断是否有“lisi”这样的键存在，如果有就改变其实为”100”
 *
 * */
public class PropertiesTest1 {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		Reader reader = new FileReader("user.txt");
         //1、读取user.txt文件，读到Properties对象中
		prop.load(reader);
		reader.close();
		 //2、遍历prop，读取key，判读是否存在lisi的key
		Set<String> set = prop.stringPropertyNames();
		for(String key:set){
			if("lisi".equals(key)){
				//3、如果存在，将其value设置成100
				prop.setProperty(key, "100");
				break;
			}
		}
		 
		//4、再将prop写入到文件中
		Writer writer = new FileWriter("user.txt");
		prop.store(writer, null);
		writer.close();
	}

	
}
