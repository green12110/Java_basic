package cn.digui_01;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\");
		File[] files = f.listFiles();
		for (File ff : files) {
			if (ff.isFile()) {
				System.out.println("�ļ�����" + ff.getName());
			} else {
				System.out.println("���·����"+ff.getPath());
				System.out.println("����·����" + ff.getAbsolutePath());
			}

		}

	}

}
