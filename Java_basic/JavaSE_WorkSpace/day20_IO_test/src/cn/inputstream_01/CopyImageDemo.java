package cn.inputstream_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:\\����ϼ.jpg");
		
		FileOutputStream fos = new FileOutputStream("����ϼ.jpg");
		
		int by =0;
		while((by=fis.read())!=-1){
			fos.write(by);
		}
		
		fos.close();
		fis.close();
		
		

	}

}
