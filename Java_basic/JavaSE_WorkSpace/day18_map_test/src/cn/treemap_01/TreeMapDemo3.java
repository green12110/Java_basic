package cn.treemap_01;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap<Student,String>
 * 键:Student
 * 值：String
 * 
 * 存储自定义对象时、1、自然排序、
 *            2、选择器排序
 */

public class TreeMapDemo3 {
	public static void main(String[] args) {
		//匿名内部类
		TreeMap<Stu, String> tm = new TreeMap<Stu, String>(new Comparator<Stu>(){
			public int compare(Stu s1,Stu s2){
				int num = s1.getAge()-s2.getAge();
				int num2 = num==0?s1.getName().compareTo(s2.getName()):num;
				return num2;
				
			}
		});

		// 创建学生对象
		Stu s1 = new Stu("潘安", 30);
		Stu s2 = new Stu("柳下惠", 35);
		Stu s3 = new Stu("唐伯虎", 33);
		Stu s4 = new Stu("燕青", 32);
		Stu s5 = new Stu("唐伯虎", 33);

		// 存储元素
		tm.put(s1, "宋朝");
		tm.put(s2, "元朝");
		tm.put(s3, "明朝");
		tm.put(s4, "清朝");
		tm.put(s5, "汉朝");
		
		//遍历HashTree
		Set<Stu> set = tm.keySet();
		for(Stu key:set){
			String value = tm.get(key);
			System.out.println(key.getName()+"--"+key.getAge()+"--"+value);
			
		}
	}

}
