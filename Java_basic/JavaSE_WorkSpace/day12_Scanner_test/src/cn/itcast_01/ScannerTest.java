package cn.itcast_01;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字");
		if (sc.hasNextInt()) {
			int x = sc.nextInt();
			System.out.println("你输入的是：" + x);
		}else{
			System.out.println("输入的类型不匹配");
		}
		
	/*	do{
			System.out.println("请输入一个数字");
			
			if(sc.hasNextInt()){
				int x = sc.nextInt();
			    System.out.println("你输入的是：" + x);
			}else{
				System.out.println("输入的类型不匹配");
				break;
			}
		}while(true);*/
			
		
		

	}

}
