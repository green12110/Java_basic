package cn.file_01;

import java.io.File;
/*
 * ��ȡ���ܣ�
 * public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
 * public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
 */

public class FileDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\");
		String[] strNames = file.list();
		
		//ѭ����������
		for(int i=0;i<strNames.length;i++){
			//��ӡ���ļ������ļ�������
			System.out.println(strNames[i]);
						
		}
		System.out.println("-------------------------------");
		
		//����ǿfor����
		for(String sname:strNames){
			System.out.println(sname);
		}
		System.out.println("-------------------------------");
		
		File[] files = file.listFiles();
		for(File f:files){
			String name =f.getName();
			String path = f.getPath();
			System.out.println("���ƣ�"+name+"\t\t���·����"+path);
		}

	}

}
