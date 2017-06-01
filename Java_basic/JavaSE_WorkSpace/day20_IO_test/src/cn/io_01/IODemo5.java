package cn.io_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * �����쳣������ֽ����������
 */

public class IODemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ֿ����쳣����
		/*
		 * FileOutputStream fos = null; try { fos = new
		 * FileOutputStream("test4.txt"); } catch (FileNotFoundException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 * try { fos.write("Hello".getBytes()); } catch (IOException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 * try { fos.close(); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */

		// һ�����쳣����
		/*
		 * try { FileOutputStream fos = new FileOutputStream("test4.txt");
		 * fos.write("Hello".getBytes()); fos.close(); } catch
		 * (FileNotFoundException e) { e.printStackTrace();
		 * 
		 * } catch (IOException e) { e.printStackTrace(); }
		 */

		// �Ľ���
		// Ϊ����finally�����ܹ������ö���ͱ��붨�嵽���棬Ϊ�˷��ʲ������⣬���������ʼ��ֵ
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("Z:\\test4.txt");
			fos.write("Hello".getBytes());

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
