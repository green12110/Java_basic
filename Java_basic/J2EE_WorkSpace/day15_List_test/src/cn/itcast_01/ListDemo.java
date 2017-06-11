package cn.itcast_01;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 需求：List集合存储字符串并遍历。
 */

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> li = new ArrayList<String>();
		
		String s1 = "Hello";
		String s2 = "Java";
		String s3= "easy";
		
		li.add(s1);
		li.add(s3);
		li.add(s2);
		
		for(String s:li){
			System.out.println(s);
		}
		System.out.println("---------");
		
		Iterator it = li.iterator();
		while(it.hasNext()){
			String s = (String)it.next();
			System.out.println(s);
			
		}

	}

}
