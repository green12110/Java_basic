package cn.file_01;

import java.io.File;
import java.io.IOException;

/*
 * ����������:public boolean renameTo(File dest)
 * 		���·������ͬ�����Ǹ�����
 * 		���·������ͬ�����Ǹ��������С�
 * 
 * ·�����̷���ʼ������·��	c:\\a.txt
 * ·�������̷���ʼ�����·��	a.txt
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
