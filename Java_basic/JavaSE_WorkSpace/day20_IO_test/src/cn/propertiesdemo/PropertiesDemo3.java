package cn.propertiesdemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 * IO流和键值对的结合
 * 1、把文件中的数据读取到集合中
 * public void load(Reader reader)
 * 2、将此 Properties 表中的属性列表（键和元素对）写入输出字符
 * public void store(Writer writer,String comments)

 * */
public class PropertiesDemo3 {
	public static void main(String[] args) throws IOException {
		//loadFile();
		storeFile();
	}
	
	private static void storeFile() throws IOException {
		Properties prop = new Properties();
		//添加元素
		prop.setProperty("刘德华",  "56");
		prop.setProperty("王菲", "45");
		prop.setProperty("林志颖", "36");
		
		Writer writer = new FileWriter("people.txt");
		//将prop（键和元素对）写入文件
		prop.store(writer, "Hello People");
		writer.close();
		//System.out.println("prop:" +prop);
		
		
	}

	private static void loadFile() throws IOException{
		 Properties prop = new Properties();
         Reader reader = new FileReader("student.txt");
         //把文件中的数据读取到集合中,文件是键值对
         prop.load(reader);
         System.out.println("Prop:"+prop);
		
	}

}
