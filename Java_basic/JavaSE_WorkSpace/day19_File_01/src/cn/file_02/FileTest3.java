package cn.file_02;

import java.io.File;
import java.io.FilenameFilter;

/*
 * �ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
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
		
		//����fileNameArr
		for(String name: fileNameArr){
			System.out.println(name);
			
		}

	}

}
