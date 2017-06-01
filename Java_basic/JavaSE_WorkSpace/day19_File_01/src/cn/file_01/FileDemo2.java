package cn.file_01;
/*
 * 删除功能:public boolean delete()
 * 
 * 注意：
 * 		A:如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下。
 * 		B:Java中的删除不走回收站。
 * 		C:要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
 */

import java.io.File;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file1 = new File("aaa.txt");
		
		System.out.println("createNewFile:"+file1.createNewFile());
		
		File file2 = new File("test\\aaa\\bbb\\ccc");
		System.out.println("mkdirs:"+file2.mkdirs());
		
		System.out.println("delete:"+file1.delete());
		
		File file3 = new File("test\\aaa\\bbb\\ccc");
		File file4 = new File("test\\aaa\\bbb");
		File file5 = new File("test\\aaa");
		File file6 = new File("test");
		System.out.println(file3.delete());
		System.out.println(file4.delete());
		System.out.println(file5.delete());
		System.out.println(file6.delete());

	}

}
