package cn.itcast_01;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		if (sc.hasNextInt()) {
			int x = sc.nextInt();
			System.out.println("��������ǣ�" + x);
		}else{
			System.out.println("��������Ͳ�ƥ��");
		}
		
	/*	do{
			System.out.println("������һ������");
			
			if(sc.hasNextInt()){
				int x = sc.nextInt();
			    System.out.println("��������ǣ�" + x);
			}else{
				System.out.println("��������Ͳ�ƥ��");
				break;
			}
		}while(true);*/
			
		
		

	}

}
