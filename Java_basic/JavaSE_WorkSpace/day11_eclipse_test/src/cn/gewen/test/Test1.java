package cn.gewen.test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�������һ������");
		int a = sc.nextInt();
		System.out.print("������ڶ�������");
		int b = sc.nextInt();
		System.out.print("���������������");
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
		
		System.out.println("��������С���������ǣ�"+a+","+b+","+c);

	}

}
