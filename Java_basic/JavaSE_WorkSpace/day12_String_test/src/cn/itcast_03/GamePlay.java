package cn.itcast_03;

import java.util.Scanner;

/*
 * ������С��Ϸ
 * */
public class GamePlay {
	private GamePlay() {
	}

	public static void start() {
		// ����һ�������
		int num = (int) (Math.random() * 100) + 1;

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("������һ������:");
			int n = sc.nextInt();
			if (n == num) {
				System.out.println("��ϲ�������");
				break;
			} else if (n > num) {
				System.out.println("��µ�����"+n+"����");
			} else {
				System.out.println("��µ�����С"+n+"С��");
			}

		}

	}
}
