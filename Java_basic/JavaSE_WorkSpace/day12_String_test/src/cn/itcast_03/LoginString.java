package cn.itcast_03;

import java.util.Scanner;

/*
 * ģ���½�����λ��ᣬ����ʾ���м���
 * 
 * ������
 * 1�������û���������
 * 2���м���¼���û���������
 * 3���ж�¼����û����������Ƿ�͸�����ƥ��
 *   ���ƥ�䣬���½�ɹ�
 *   �������ͬ�����½ʧ��
 * 4�����λ��ᣬ��forѭ��
 * 
 * 
 * */
public class LoginString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String user = "admin";
		String password = "123";

		for (int i = 0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("�������û�����");
			String us = sc.nextLine();
			System.out.print("���������룺");
			String psw = sc.nextLine();
			if (us.equals(user) && psw.equals(password)) {
				System.out.println("��½�ɹ���");
				break;
			} else {
				if ((2 - i) == 0) {
					System.out.println("���ε�½��ʧ�ܣ��˺ű�����");
				} else {
					System.out.println("��½ʧ�ܣ�����" + (2 - i) + "�˻���");
				}
			}
		}

		// System.out.println("�û�����"+us+"���룺"+psw);

	}

}