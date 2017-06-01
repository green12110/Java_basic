package cn_itcast_02;

import java.util.ArrayList;
import java.util.Collection;
/*
 * 集合的遍历。其实就是依次获取集合中的每一个元素。
 * 
 * Object[] toArray():把集合转成数组，可以实现集合的遍历
 */

public class CollectionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		c.add("Hello");
		c.add("world");
		c.add("java");
		
		//集合转数组
		Object[] obj = c.toArray();
		for(int i=0;i<c.size();i++){
			String s = (String)obj[i];
			System.out.println(s+"-----长度："+s.length());
			
		}

	}

}
