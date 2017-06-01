package cn.bufferedstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferInputDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream bis = new BufferedInputStream(
				new FileInputStream("bos.txt"));
		/*int by = 0;
		while((by=bis.read())!=-1){
			System.out.print((char)by);
		}
		bis.close();*/
		
		int len = 0;
		byte[] bys = new byte[1024];
		while((len=bis.read(bys))!=-1){
			System.out.println(new String(bys,0,len));
			
		}
		
		bis.close();

	}

}
