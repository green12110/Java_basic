package cn.jiehe2_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/*
 *需求：
 *假设HashMap集合的元素是ArrayList。有3个。
 *每一个ArrayList集合的值是字符串。
 *元素我已经完成，请遍历。
 *结果：
 *		 三国演义
 *		 	吕布
 *		 	周瑜
 *		 笑傲江湖
 *		 	令狐冲
 *		 	林平之
 *		 神雕侠侣
 *		 	郭靖
 *		 	杨过  
 */

public class HashMap2Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,ArrayList<String>> mz = new HashMap<String,ArrayList<String>>();
		
		ArrayList<String> perArray1 = new ArrayList<String>();
		perArray1.add("吕布");
		perArray1.add("周瑜");		
		mz.put("三国演义", perArray1);
		
		ArrayList<String> perArray2 = new ArrayList<String>();
		perArray2.add("令狐冲");
		perArray2.add("林平之");
		mz.put("笑傲江湖", perArray2);
		
		ArrayList<String> perArray3 = new ArrayList<String>();
		perArray3.add("郭靖");
		perArray3.add("杨过");
		mz.put("神雕侠侣", perArray3);
		
		//遍历
		Set<String> set = mz.keySet();
		for(String key:set){
			ArrayList<String> pervalue = mz.get(key);
			//System.out.println(key+"--"+pervalue);
			System.out.println(key);
			for(String s: pervalue){
				System.out.println(key+"---"+s);
			}
			
		}
		
		
		
	}

}
