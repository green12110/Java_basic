package cn.itcast_01;

import java.util.Scanner;
/*
 * 分割功能
 *		String类的public String[] split(String regex)
 *		根据给定正则表达式的匹配拆分此字符串。 
 *
 * 举例：
 * 		百合网，世纪佳缘,珍爱网,QQ
 * 		搜索好友
 * 			性别：女
 * 			范围："18-24"
 * 
 * 		age>=18 && age<=24
 * 
 */

public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("请输入你的年龄");
      int age = sc.nextInt();
      String aa ="18-24";
      //定义分割规则
      String regex = "-";
      String[] ageArr = aa.split(regex);
      if(age>=Integer.parseInt(ageArr[0]) && age<=Integer.valueOf(ageArr[1])){
    	  System.out.println("输入的年龄在18-24之间");
    	  
      }else{
    	  System.out.println("年龄不在18-24之间");
      }
      
	}

}
