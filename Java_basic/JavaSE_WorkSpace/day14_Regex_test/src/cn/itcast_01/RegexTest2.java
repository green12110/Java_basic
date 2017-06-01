package cn.itcast_01;

import java.util.Arrays;
/*
 * 我有如下一个字符串:”91 27 46 38 50”
 * 请写代码实现最终输出结果是：”27 38 46 50 91”
 * 
 * 分析
 * 1、先将原字符串，用正则表达式分割
 * 2、获取字符串数组
 * 3、把数字进行排序
 * 3、按照顺序拼接
 *    定义StringBuilder 拼接
 * 
 */

public class RegexTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1= "91 27 46 38 50";
       //正则表达式分割功能
       String[] strArr = s1.split(" ");
       
       for(int i=0;i<strArr.length;i++){
    	   System.out.println(strArr[i]);
       }
       
       Arrays.sort(strArr);
       
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<strArr.length;i++){
    	  sb.append(strArr[i]).append(" ");
       }
       
       System.out.println(sb.toString().trim());
       
       
	}

}
