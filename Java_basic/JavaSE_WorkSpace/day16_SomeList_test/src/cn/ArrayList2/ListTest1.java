package cn.ArrayList2;

import java.util.ArrayList;
import java.util.List;

/*
 * 获取10个1-20之间的随机数，要求不能重复
 * 
 * 分析：1、用Math类的rondon（）获取随机数
 *     2、把获取的随机数装进集合中list,用contains()判断是否存在
 *       如果不存在，则add（）
 *     3、判断集合的容量size(),如果等于10，则中断。
 *     
 */

public class ListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    List<Integer> li = new ArrayList<Integer>();
		int digit = 0;
		while(true){
			digit = (int)(Math.random()*(20-10+1)+10);
			if(!li.contains(digit)){
				li.add(digit);
			}
			if(li.size()==10){
				break;
			}
			
		}
		
		for(Integer in:li){
			System.out.println(in);
			
		}
		/*for(int i=0;i<10;i++){
			digit = (int)(Math.random()*(20-10+1)+10);
			System.out.println(digit);
		}*/
	}

}
