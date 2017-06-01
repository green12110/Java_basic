package cn.gewen.test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入第一个数：");
		int a = sc.nextInt();
		System.out.print("请输入第二个数：");
		int b = sc.nextInt();
		System.out.print("请输入第三个数：");
		int c = sc.nextInt();
		int temp;
		
		if(a>b){
			temp = a;
			a = b;
			b = temp;
		}
		if(a>c){
			temp = a;
			a = c;
			c = temp;
		}
		if (b>c){
			temp = b;
			b = c;
			c = temp;
		}
		
		System.out.println("三个数由小到大排序是："+a+","+b+","+c);

	}

}
