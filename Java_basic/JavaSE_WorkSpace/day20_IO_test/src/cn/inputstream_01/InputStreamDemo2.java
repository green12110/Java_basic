package cn.inputstream_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import java.io.IOException;

public class InputStreamDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("test2.txt");
		/*
		byte[] bys = new byte[5];
		int len = fis.read(bys);
		System.out.println(len);
		System.out.println(new String(bys));
		System.out.println(new String(bys,0,len));
		
		len = fis.read(bys);
		System.out.println(new String(bys,0,len));
		*/
		int len = 0;
		byte[] bys = new byte[1024];
		while((len = fis.read(bys))!=-1){
			System.out.print(new String(bys,0,len));
			
		}
		
		fis.close();
	}

}
