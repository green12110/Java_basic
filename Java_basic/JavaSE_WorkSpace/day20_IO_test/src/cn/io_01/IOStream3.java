package cn.io_01;
/*
 * ���ʵ�����ݵĻ���?
 * 		Ϊʲô����û�л�����?��Ϊ��ֵд���ֽ����ݣ���û��д�뻻�з��š�
 * 		���ʵ����?д�뻻�з��ż����¡�
 * 		�ղ����ǿ�������д�ı��ļ����ǿ��Եģ�ͨ��windows�Դ����Ǹ����У�Ϊʲô��?
 * 		��Ϊ��ͬ��ϵͳ��Բ�ͬ�Ļ��з���ʶ���ǲ�һ����?
 * 		windows:\r\n
 * 		linux:\n
 * 		Mac:\r
 * 		��һЩ�����ĸ��߼����±����ǿ���ʶ�����⻻�з��ŵġ�
 * 
 * ���ʵ�����ݵ�׷��д��?
 * 		�ù��췽�����ڶ���������true���������
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStream3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("test3.txt",true);
		
		for(int i=0;i<10;i++){
			fos.write(("Hello"+i).getBytes());
			//����
			fos.write("\r\n".getBytes());
		}
		
		fos.close();

	}

}
