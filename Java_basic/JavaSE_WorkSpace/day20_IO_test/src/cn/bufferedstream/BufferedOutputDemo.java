package cn.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ͨ����������ķ�ʽȷʵ����ǰһ�ζ�ȡһ���ֽڵķ�ʽ��ܶ࣬���ԣ�������һ�����������Ƿǳ��õġ�
 * ��Ȼ�������Ļ�����ô��java��ʼ����Ƶ�ʱ����Ҳ���ǵ���������⣬��ר���ṩ�˴����������ֽ��ࡣ
 * �����౻��Ϊ����������(��Ч��)
 * д���ݣ�BufferedOutputStream
 * �����ݣ�BufferedInputStream
 * 
 * ���췽������ָ���������Ĵ�С����������һ���ò��ϣ���ΪĬ�ϻ�������С���㹻�ˡ�
 * 
 * Ϊʲô������һ��������ļ������ļ�·�������Ǵ���һ��OutputStream������?
 * ԭ��ܼ򵥣��ֽڻ������������ṩ��������Ϊ��Ч����Ƶġ������أ������Ķ�д�������ÿ�������������ʵ�֡�
 */

public class BufferedOutputDemo {
	public static void main(String[] args) throws IOException {
//		FileOutputStream fos = new FileOutputStream("bos.txt");		
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("bos.txt"));
		bos.write("Hello BufferedOutputStream".getBytes());
		bos.close();
	}

}
