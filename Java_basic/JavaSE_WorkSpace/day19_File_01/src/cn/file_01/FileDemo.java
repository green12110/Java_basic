package cn.file_01;

import java.io.File;

/*
 * File��
 * ���ֹ��췽��
 */

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���췽��һ��File(String pathname)
		File file1 = new File("D:\\demo\\aa.txt");
		
		//���췽������File(String parent,String child)
		File file2 = new File("D:\\demo","aa.txt");
		
		File file3 = new File("D:\\demo");
		//���췽������File(File parent,String child)
		File file4 = new File(file3,"aa.txt");

	}

}
