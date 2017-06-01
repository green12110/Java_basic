package cn.inputstream_02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:\\desktop.jpg");
		
		FileOutputStream fos = new FileOutputStream("desktop.jpg");
		
		int len = 0;
		byte[] bys = new byte[1024];
		while((len = fis.read(bys))!=-1){
			fos.write(bys, 0, len);
			
		}
		
		fos.close();
		fis.close();

	}

}
