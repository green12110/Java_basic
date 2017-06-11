package cn.itcast_02;
/**
 * 
 * ListIterator 先正向遍历，再逆向遍历
 * 
 * 
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建List集合对象
		List list = new ArrayList();
		// 添加元素
		list.add("hello");
		list.add("world");
		list.add("java");
		
		ListIterator lit = list.listIterator();
		while(lit.hasNext()){
			String s = (String)lit.next();
			System.out.println(s);
			
		}
		
		System.out.println("-------------------");
		
		while(lit.hasPrevious()){
			String s = (String)lit.previous();
			System.out.println(s);
		}
		
		

	}

}
