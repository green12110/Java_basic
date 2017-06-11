package cn.reflect_arr;

import java.lang.reflect.Array;

public class PintObj {
	
	public static void main(String[] args) {
	   int[] a = new int[]{3,4,5,6};
	   String b ="HelloArray";
	   printObj(a);
	   printObj(b);
	}

	private static void printObj(Object obj) {
		//得到obj对象的Class 文件
		Class objClass = obj.getClass();
		//判断obj是否一个数组
		if(objClass.isArray()){
			//得到数组的长度
			int len  = Array.getLength(obj);
			for(int i=0;i<len;i++){
				System.out.println(Array.get(obj, i));
				
			}
			
		}else{
			System.out.println(obj);
			
		}
		
	}
	

}
