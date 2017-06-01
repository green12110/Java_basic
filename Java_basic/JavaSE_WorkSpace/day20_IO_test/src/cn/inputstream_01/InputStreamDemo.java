package cn.inputstream_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * �ֽ��������������裺
 * A:�����ֽ�����������
 * B:����read()������ȡ���ݣ�����������ʾ�ڿ���̨
 * C:�ͷ���Դ
 * 
 * ��ȡ���ݵķ�ʽ��
 * A:int read():һ�ζ�ȡһ���ֽ�
 * B:int read(byte[] b):һ�ζ�ȡһ���ֽ�����
 */

public class InputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("test2.txt");
		
		/*int by = fis.read();
		System.out.println((char)by);*/
		int by =0;
		//��ȡ����ֵ���ж�
		while((by = fis.read())!=-1){
			System.out.print((char)by);
		}
		
		fis.close();
		
		

	}

}
