package com.execelDemo;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest2 {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		Reader reader = new FileReader("excelSet.properties");
		prop.load(reader);
		reader.close();
		
		Set<String> keySet= prop.stringPropertyNames();
		for(String key : keySet){
			System.out.println(key+"====="+prop.getProperty(key));
			
		}
	}

}
