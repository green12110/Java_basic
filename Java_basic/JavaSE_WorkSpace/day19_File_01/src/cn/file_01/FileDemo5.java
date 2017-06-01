package cn.file_01;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��ȡ���ܣ�
 * public String getAbsolutePath()����ȡ����·��
 * public String getPath():��ȡ���·��
 * public String getName():��ȡ����
 * public long length():��ȡ���ȡ��ֽ���
 * public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
 */

public class FileDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("demo\\test.txt");
		String s1 = file.getAbsolutePath();
        System.out.println("����·����"+s1);
        
        String s2 = file.getPath();
        System.out.println("���·����"+s2);
        
        String s3 = file.getName();
        System.out.println("�ļ����ƣ�"+s3);
        
        long num1 = file.length();
        System.out.println("�ֽ�����"+num1);
        
        long num2 = file.lastModified();
        System.out.println("���һ���޸�ʱ�䣨����ֵ��:"+num2);
        
        Date date = new Date(num2);
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String s = sdf.format(date);
        System.out.println(s);

	}

}
