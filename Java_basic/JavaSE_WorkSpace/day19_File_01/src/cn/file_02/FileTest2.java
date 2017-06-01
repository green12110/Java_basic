package cn.file_02;

import java.io.File;

public class FileTest2 {
	public static void main(String[] args) {
		File file = new File("d:\\");
		
		String[] nameArr = file.list();
		
		for(String name:nameArr){
			if(name.endsWith(".jpg")){
				System.out.println(name);
				
			}
			
		}
	}

}
