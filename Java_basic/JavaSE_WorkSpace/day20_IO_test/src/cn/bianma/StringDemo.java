package cn.bianma;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * String(byte[] bytes, String charsetName):ͨ��ָ�����ַ��������ֽ�����
 * byte[] getBytes(String charsetName):ʹ��ָ�����ַ����ϰ��ַ�������Ϊ�ֽ�����
 * 
 * ����:�ѿ��ö��ı�ɿ�������
 * String -- byte[]
 * 
 * ����:�ѿ������ı�ɿ��ö���
 * byte[] -- String
 * 
 * ��������սƬ(���籨���ӵ籨)
 */
public class StringDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
		String s = "���";
		//byte[] bys = s.getBytes();         //[-60, -29, -70, -61]
		//byte[] bys = s.getBytes("GBK");  //[-60, -29, -70, -61]
		byte[] bys = s.getBytes("UTF-8");  //[-28, -67, -96, -27, -91, -67]
		System.out.println(Arrays.toString(bys));

	}

}
