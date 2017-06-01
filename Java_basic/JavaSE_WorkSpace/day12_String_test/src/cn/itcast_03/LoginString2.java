package cn.itcast_03;

import java.util.Scanner;

/*
 * 模拟登陆给三次机会，并提示还有几次
 * 
 * 分析：
 * 1、给定用户名和密码
 * 2、有键盘录入用户名、密码
 * 3、判断录入的用户名和密码是否和给定的匹配
 *   如果匹配，则登陆成功.则可以玩猜数字游戏
 *   如果不相同，则登陆失败
 * 4、三次机会，用for循环
 * 
 * 
 * */
public class LoginString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user = "admin";
		String password = "123";

		for (int i = 0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("请输入用户名：");
			String us = sc.nextLine();
			System.out.print("请输入密码：");
			String psw = sc.nextLine();
			if (us.equals(user) && psw.equals(password)) {
				System.out.println("登陆成功，开始玩游戏！");
				//登陆成功后，可以玩猜数字小游戏
				GamePlay.start();
				break;
			} else {
				if ((2 - i) == 0) {
					System.out.println("三次登陆都失败，账号被锁定");
				} else {
					System.out.println("登陆失败，还有" + (2 - i) + "此机会");
				}
			}
		}

		// System.out.println("用户名："+us+"密码："+psw);

	}

}
