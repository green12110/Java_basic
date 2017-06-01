package cn.io_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 往一个文本文件中写一句话：”helloworld”
 */

public class IODemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       FileOutputStream fos = new FileOutputStream("test.txt");
       fos.write("Hello world".getBytes());
       fos.close();
       //fos.write("hrerm".getBytes());
	}

}
