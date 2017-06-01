package cn.file_02;

import java.io.File;
/*
 * 判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
 * 
 * 分析：
 * 		A:封装e判断目录
 * 		B:获取该目录下所有文件或者文件夹的File数组
 * 		C:遍历该File数组，得到每一个File对象，然后判断
 * 		D:是否是文件
 * 			是：继续判断是否以.jpg结尾
 * 				是：就输出该文件名称
 * 				否：不搭理它
 * 			否：不搭理它
 */

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //封装e盘
		File file = new File("d:\\");
		File[] files = file.listFiles();
		
		for(File f:files){
			//判断是否是文件
			if(f.isFile()){
				
				//判断文件名是否以jpg结尾
				if(f.getName().endsWith(".jpg")){
					System.out.println(f.getName());
				}
				
			}
		}
	}

}
