package cn.file_01;

import java.io.File;

/*
 * File类
 * 三种构造方法
 */

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//构造方法一：File(String pathname)
		File file1 = new File("D:\\demo\\aa.txt");
		
		//构造方法二：File(String parent,String child)
		File file2 = new File("D:\\demo","aa.txt");
		
		File file3 = new File("D:\\demo");
		//构造方法三：File(File parent,String child)
		File file4 = new File(file3,"aa.txt");

	}

}
