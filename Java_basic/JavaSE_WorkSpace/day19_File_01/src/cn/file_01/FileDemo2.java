package cn.file_01;
/*
 * ɾ������:public boolean delete()
 * 
 * ע�⣺
 * 		A:����㴴���ļ������ļ�������д�̷�·������ô��Ĭ������Ŀ·���¡�
 * 		B:Java�е�ɾ�����߻���վ��
 * 		C:Ҫɾ��һ���ļ��У���ע����ļ����ڲ��ܰ����ļ������ļ���
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
