package cn.io_01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 加入异常处理的字节输出流操作
 */

public class IODemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 分开做异常处理
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

		// 一起做异常处理
		/*
		 * try { FileOutputStream fos = new FileOutputStream("test4.txt");
		 * fos.write("Hello".getBytes()); fos.close(); } catch
		 * (FileNotFoundException e) { e.printStackTrace();
		 * 
		 * } catch (IOException e) { e.printStackTrace(); }
		 */

		// 改进版
		// 为了在finally里面能够看到该对象就必须定义到外面，为了访问不出问题，还必须给初始化值
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
