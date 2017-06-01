package cn.file_02;

import java.io.File;
import java.io.FilenameFilter;

/*
 * 判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件名称
 */
public class FileTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("d:\\");
		
		String[] fileNameArr = file.list(new FilenameFilter(){

			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				//System.out.println(name+"-------"+dir);
				File f = new File(dir,name);
				/*boolean flag = false;
				if(f.isFile()){
					flag = f.getName().endsWith(".jpg");
				}*/
				return f.isFile() && f.getName().endsWith(".jpg");
			}
			
		});
		
		//遍历fileNameArr
		for(String name: fileNameArr){
			System.out.println(name);
			
		}

	}

}
