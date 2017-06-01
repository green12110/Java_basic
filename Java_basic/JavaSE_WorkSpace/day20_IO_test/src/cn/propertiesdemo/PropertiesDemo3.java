package cn.propertiesdemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

/*
 * IO���ͼ�ֵ�ԵĽ��
 * 1�����ļ��е����ݶ�ȡ��������
 * public void load(Reader reader)
 * 2������ Properties ���е������б�����Ԫ�ضԣ�д������ַ�
 * public void store(Writer writer,String comments)

 * */
public class PropertiesDemo3 {
	public static void main(String[] args) throws IOException {
		//loadFile();
		storeFile();
	}
	
	private static void storeFile() throws IOException {
		Properties prop = new Properties();
		//���Ԫ��
		prop.setProperty("���»�",  "56");
		prop.setProperty("����", "45");
		prop.setProperty("��־ӱ", "36");
		
		Writer writer = new FileWriter("people.txt");
		//��prop������Ԫ�ضԣ�д���ļ�
		prop.store(writer, "Hello People");
		writer.close();
		//System.out.println("prop:" +prop);
		
		
	}

	private static void loadFile() throws IOException{
		 Properties prop = new Properties();
         Reader reader = new FileReader("student.txt");
         //���ļ��е����ݶ�ȡ��������,�ļ��Ǽ�ֵ��
         prop.load(reader);
         System.out.println("Prop:"+prop);
		
	}

}
