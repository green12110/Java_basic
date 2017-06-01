package cn.bianma;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * String(byte[] bytes, String charsetName):通过指定的字符集解码字节数组
 * byte[] getBytes(String charsetName):使用指定的字符集合把字符串编码为字节数组
 * 
 * 编码:把看得懂的变成看不懂的
 * String -- byte[]
 * 
 * 解码:把看不懂的变成看得懂的
 * byte[] -- String
 * 
 * 举例：谍战片(发电报，接电报)
 */
public class StringDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
		String s = "你好";
		//byte[] bys = s.getBytes();         //[-60, -29, -70, -61]
		//byte[] bys = s.getBytes("GBK");  //[-60, -29, -70, -61]
		byte[] bys = s.getBytes("UTF-8");  //[-28, -67, -96, -27, -91, -67]
		System.out.println(Arrays.toString(bys));

	}

}
