package cn.iotest_01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 * �����ı��ļ���
 * 
 * ����Դ����������
 * a.txt	--	��ȡ����	--	FileInputStream	
 * 
 * Ŀ�ĵأ�������ȥ
 * b.txt	--	д����		--	FileOutputStream
 * 
 * java.io.FileNotFoundException: a.txt (ϵͳ�Ҳ���ָ�����ļ���)
 * 
 * ��һ�θ�������û�г����κ����⣬Ϊʲô��?
 * ��һ�����ǳ��������ԭ����������ÿ�λ�ȡ��һ���ֽ����ݣ��ͰѸ��ֽ�����ת��Ϊ���ַ����ݣ�Ȼ�����������̨��
 * ����һ����?ȷʵͨ��IO����ȡ���ݣ�д���ı��ļ������ȡһ���ֽڣ��Ҿ�д��һ���ֽڣ���û�����κε�ת����
 * �����Լ���ת����
 */

public class CopyFileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("a.txt");
		FileOutputStream fos = new FileOutputStream("b.txt");
		
		//������
		int by =0;
		while((by = fis.read())!=-1){
			//System.out.println((char)by);
			fos.write(by);
		}
		
		fis.close();
		fos.close();

	}

}
