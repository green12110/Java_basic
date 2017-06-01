package cn.itcast_01;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ArrayList的使用。	
 * 		存储字符串并遍历
 *
 */

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList alist = new ArrayList();
		alist.add("Hello");
		alist.add("Java");
		alist.add("Easy");
		
		Iterator it = alist.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
		System.out.println("-----------");
		
		//方法二：普通for
		for(int i=0;i<alist.size();i++){
			String s = (String)alist.get(i);
			System.out.println(s);
			
			
		}

	}

}
