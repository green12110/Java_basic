package cn.ArrayList2;

import java.util.ArrayList;
import java.util.List;

/*
 * ��ȡ10��1-20֮����������Ҫ�����ظ�
 * 
 * ������1����Math���rondon������ȡ�����
 *     2���ѻ�ȡ�������װ��������list,��contains()�ж��Ƿ����
 *       ��������ڣ���add����
 *     3���жϼ��ϵ�����size(),�������10�����жϡ�
 *     
 */

public class ListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    List<Integer> li = new ArrayList<Integer>();
		int digit = 0;
		while(true){
			digit = (int)(Math.random()*(20-10+1)+10);
			if(!li.contains(digit)){
				li.add(digit);
			}
			if(li.size()==10){
				break;
			}
			
		}
		
		for(Integer in:li){
			System.out.println(in);
			
		}
		/*for(int i=0;i<10;i++){
			digit = (int)(Math.random()*(20-10+1)+10);
			System.out.println(digit);
		}*/
	}

}
