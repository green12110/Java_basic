package cn.digui_01;
/*
 * ����ĳһ�ļ���·���µģ����� �ļ�
 */
import java.io.File;
import java.util.ArrayList;

public class DiGUIDemo {
	private static ArrayList<String> filelist = new ArrayList<String>();
	
	public static void main(String[] args) {

		String dir = "F:\\��ҪU��";
		getFile(dir);
		
	}
	
	public static void  getFile(String dir){
		File file = new File(dir);
		
		File[] filesArr = file.listFiles();
		
		for(File ff : filesArr){
			if(ff.isDirectory()){
				String pathname = ff.getAbsolutePath();
				System.out.println("����·����"+pathname);
				getFile(pathname);
				filelist.add(pathname);
				
			}else{
				System.out.println("�ļ�����"+ff.getName());
				//return;
				
			}
			
		}
		
	}

}
