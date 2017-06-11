package cn.itcast_02;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 一、泛型术语
 * ArrayList<E> 泛型类型
 *           E  类型变量 或 类型参数
 *           
 * ArrayList<Integer> 参数化的类型
 *           Integer  类型参数的实例 或 实际类型参数
 * 
 *  ArrayList 原始类型
 * 
 * 二、通配符<?>
 *  用于打印任意参数化类型集合中的所有数据，如何实现？
 *
 */

public class GenericDemo2 {
	 public static void main(String[] args) {
		 List<String> list1 = new ArrayList<String>();
		 list1.add("angle");
		 list1.add("carolin");
		 List<Integer> list2 = new ArrayList<Integer>();
		 list2.add(12);
		 list2.add(34);
		 list2.add(9);
		 
		 //调用printAnyCollection（）方法
		 printAnyCollection(list1);
		 System.out.println("------------");
		 printAnyCollection(list2);
		 
		
	}
	 
	 public static void printAnyCollection(Collection<?> collection){
		 //collection.add(12);   //报错
		//使用通配符，只能调用与参数无关的方法
		 System.out.println(collection.size());
		 for(Object obj:collection){
			 System.out.println(obj);
		 }
		 
		 
	 }

}
