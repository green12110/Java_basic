package cn.file_01;

import java.io.File;
/*
 * 获取功能：
 * public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
 * public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
 */

public class FileDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\");
		String[] strNames = file.list();
		
		//循环遍历数组
		for(int i=0;i<strNames.length;i++){
			//打印出文件或者文件夹名称
			System.out.println(strNames[i]);
						
		}
		System.out.println("-------------------------------");
		
		//用增强for遍历
		for(String sname:strNames){
			System.out.println(sname);
		}
		System.out.println("-------------------------------");
		
		File[] files = file.listFiles();
		for(File f:files){
			String name =f.getName();
			String path = f.getPath();
			System.out.println("名称："+name+"\t\t相对路径："+path);
		}

	}

}
