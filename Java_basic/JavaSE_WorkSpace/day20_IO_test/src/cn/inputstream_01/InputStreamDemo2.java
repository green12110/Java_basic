package cn.inputstream_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import java.io.IOException;

public class InputStreamDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("test2.txt");
		/*
		byte[] bys = new byte[5];
		int len = fis.read(bys);
		System.out.println(len);
		System.out.println(new String(bys));
		System.out.println(new String(bys,0,len));
		
		len = fis.read(bys);
		System.out.println(new String(bys,0,len));
		*/
		int len = 0;
		byte[] bys = new byte[1024];
		while((len = fis.read(bys))!=-1){
			System.out.print(new String(bys,0,len));
			
		}
		
		fis.close();
	}

}
