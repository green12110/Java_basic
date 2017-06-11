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
		//�õ�obj�����Class �ļ�
		Class objClass = obj.getClass();
		//�ж�obj�Ƿ�һ������
		if(objClass.isArray()){
			//�õ�����ĳ���
			int len  = Array.getLength(obj);
			for(int i=0;i<len;i++){
				System.out.println(Array.get(obj, i));
				
			}
			
		}else{
			System.out.println(obj);
			
		}
		
	}
	

}
