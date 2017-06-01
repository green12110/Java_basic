package cn.file_01;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 获取功能：
 * public String getAbsolutePath()：获取绝对路径
 * public String getPath():获取相对路径
 * public String getName():获取名称
 * public long length():获取长度。字节数
 * public long lastModified():获取最后一次的修改时间，毫秒值
 */

public class FileDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("demo\\test.txt");
		String s1 = file.getAbsolutePath();
        System.out.println("绝对路径："+s1);
        
        String s2 = file.getPath();
        System.out.println("相对路径："+s2);
        
        String s3 = file.getName();
        System.out.println("文件名称："+s3);
        
        long num1 = file.length();
        System.out.println("字节数："+num1);
        
        long num2 = file.lastModified();
        System.out.println("最后一次修改时间（毫秒值）:"+num2);
        
        Date date = new Date(num2);
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String s = sdf.format(date);
        System.out.println(s);

	}

}
