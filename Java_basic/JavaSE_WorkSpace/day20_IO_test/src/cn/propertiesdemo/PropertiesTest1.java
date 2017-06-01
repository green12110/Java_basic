package cn.propertiesdemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

/*
 * ��һ���ı��ļ�(user.txt)����֪�������Ǽ�ֵ����ʽ�ģ����ǲ�֪��������ʲô��
 * ��дһ�������ж��Ƿ��С�lisi�������ļ����ڣ�����о͸ı���ʵΪ��100��
 *
 * */
public class PropertiesTest1 {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		Reader reader = new FileReader("user.txt");
         //1����ȡuser.txt�ļ�������Properties������
		prop.load(reader);
		reader.close();
		 //2������prop����ȡkey���ж��Ƿ����lisi��key
		Set<String> set = prop.stringPropertyNames();
		for(String key:set){
			if("lisi".equals(key)){
				//3��������ڣ�����value���ó�100
				prop.setProperty(key, "100");
				break;
			}
		}
		 
		//4���ٽ�propд�뵽�ļ���
		Writer writer = new FileWriter("user.txt");
		prop.store(writer, null);
		writer.close();
	}

	
}
