package cn.file_02;

import java.io.File;
/*
 * �ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
 * 
 * ������
 * 		A:��װe�ж�Ŀ¼
 * 		B:��ȡ��Ŀ¼�������ļ������ļ��е�File����
 * 		C:������File���飬�õ�ÿһ��File����Ȼ���ж�
 * 		D:�Ƿ����ļ�
 * 			�ǣ������ж��Ƿ���.jpg��β
 * 				�ǣ���������ļ�����
 * 				�񣺲�������
 * 			�񣺲�������
 */

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //��װe��
		File file = new File("d:\\");
		File[] files = file.listFiles();
		
		for(File f:files){
			//�ж��Ƿ����ļ�
			if(f.isFile()){
				
				//�ж��ļ����Ƿ���jpg��β
				if(f.getName().endsWith(".jpg")){
					System.out.println(f.getName());
				}
				
			}
		}
	}

}
