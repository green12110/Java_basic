package cn.io_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
/*
 * public void write(int b)
 * public void write(byte[] b)
 * public void write(byte[] b,int off,int len)
 */
import java.io.IOException;

public class IODemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("test2.txt");
		
		// public void write(int b)
		fos.write(98);
		
		byte[] arr = {98,99,100,101,102,103};
		//public void write(byte[] b)
		fos.write(arr);
		//public void write(byte[] b,int off,int len)
		fos.write(arr,1,2);
		
		fos.close();
		

	}

}
