package cn.file_01;

import java.io.File;
import java.io.IOException;

/*
 * 重命名功能:public boolean renameTo(File dest)
 * 		如果路径名相同，就是改名。
 * 		如果路径名不同，就是改名并剪切。
 * 
 * 路径以盘符开始：绝对路径	c:\\a.txt
 * 路径不以盘符开始：相对路径	a.txt
 */

public class FileDemo4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("bb.txt");
		System.out.println("createNewFile:"+file.createNewFile());
	/*	File newfile = new File("bb.txt");
		boolean re = file.renameTo(newfile);
		System.out.println("renameTo:"+re);*/
		
		File file2 = new File("D:\\bbbb.txt");
		boolean re = file.renameTo(file2);
		System.out.println("renameTo:"+re);
		
		

	}

	
}
