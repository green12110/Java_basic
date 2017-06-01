package cn.inputstream_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 字节输入流操作步骤：
 * A:创建字节输入流对象
 * B:调用read()方法读取数据，并把数据显示在控制台
 * C:释放资源
 * 
 * 读取数据的方式：
 * A:int read():一次读取一个字节
 * B:int read(byte[] b):一次读取一个字节数组
 */

public class InputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("test2.txt");
		
		/*int by = fis.read();
		System.out.println((char)by);*/
		int by =0;
		//读取、赋值、判断
		while((by = fis.read())!=-1){
			System.out.print((char)by);
		}
		
		fis.close();
		
		

	}

}
