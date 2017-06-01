package cn.digui_01;
/*
 * 遍历某一文件（路径下的）所有 文件
 */
import java.io.File;
import java.util.ArrayList;

public class DiGUIDemo {
	private static ArrayList<String> filelist = new ArrayList<String>();
	
	public static void main(String[] args) {

		String dir = "F:\\重要U盘";
		getFile(dir);
		
	}
	
	public static void  getFile(String dir){
		File file = new File(dir);
		
		File[] filesArr = file.listFiles();
		
		for(File ff : filesArr){
			if(ff.isDirectory()){
				String pathname = ff.getAbsolutePath();
				System.out.println("绝对路径："+pathname);
				getFile(pathname);
				filelist.add(pathname);
				
			}else{
				System.out.println("文件名："+ff.getName());
				//return;
				
			}
			
		}
		
	}

}
