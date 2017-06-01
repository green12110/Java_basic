package cn.itcast_03;

import java.util.Scanner;

/*
 * 猜数字小游戏
 * */
public class GamePlay {
	private GamePlay() {
	}

	public static void start() {
		// 产生一个随机数
		int num = (int) (Math.random() * 100) + 1;

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("请输入一个数字:");
			int n = sc.nextInt();
			if (n == num) {
				System.out.println("恭喜你猜中了");
				break;
			} else if (n > num) {
				System.out.println("你猜的数字"+n+"大了");
			} else {
				System.out.println("你猜的数字小"+n+"小了");
			}

		}

	}
}
