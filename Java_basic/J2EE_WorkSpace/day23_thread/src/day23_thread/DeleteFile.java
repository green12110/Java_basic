package day23_thread;
/**
 * 在指定时间删除指定目录（递归删除目录）
 * 
 * 
 */

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.SimpleFormatter;

public class DeleteFile {
	public static void main(String[] args) throws ParseException{
		Timer timer = new Timer();
		String str = "2016-09-04 19:10:00";
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Date d =sdf.parse(str);
		timer.schedule(new deleteTask(), d);
	}

}

class deleteTask extends TimerTask{


	@Override
	public void run() {
  		// TODO Auto-generated method stub
		File srcFileFolder  = new File("Demo");
		deleteFile(srcFileFolder);
	    	
	}
	
	
	private void deleteFile(File srcFileFolder){
		File[] files = srcFileFolder.listFiles();
		if(files != null){
			for(File file : files){
				if(file.isDirectory()){
					deleteFile(file);
				}else{
					System.out.println("删除了文件："+file.getName()+":"+file.delete());
					//file.delete();
				}
				
			}
			System.out.println("删除了文件："+srcFileFolder.getName()+":"+srcFileFolder.delete());
			//srcFileFolder.delete();
		}else{
			return;
		}
		
	}
}
