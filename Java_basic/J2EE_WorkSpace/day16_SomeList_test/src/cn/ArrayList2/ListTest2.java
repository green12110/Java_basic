package cn.ArrayList2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
 */

public class ListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc = new Scanner(System.in);
		//不知道长度，所以定义集合，用于存放
		List<Integer> intlist = new ArrayList<Integer>();
		while(true){
          System.out.println("请输入数字：（结束请按0）");
		  int i = sc.nextInt();
		  if(i!=0){
			  intlist.add(i);
		  }else{
			  break;
		  }
		  
		}
		
		System.out.println("最大值："+getMax(intlist));
		
		
	}

	public static int getMax(List<Integer> list) {
		int max = 0;
		//遍历list
		for(Integer i:list){
			if(i>max){
				max =i.intValue();
			}
		}
		return max;

	}

}
