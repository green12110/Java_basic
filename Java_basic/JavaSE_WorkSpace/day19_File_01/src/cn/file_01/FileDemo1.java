package cn.file_01;

import java.io.File;
/*
 * File类的创建功能
 */
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	File file = new File("D:\\demo\\aa.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*for(int i=0;i<10;i++){
		File file2 = new File("D:\\demo\\mycode"+i);
        boolean re =file2.mkdirs();
        System.out.println("创建文件夹：code"+i+re);
		}*/
		
		File file3 = new File("d:\\aaa\\bbb\\cccc\\dddd");
		System.out.println("midirs:"+file3.mkdirs());
	}

}
