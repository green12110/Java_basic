package cn.ArrayList2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * ����¼�������ݣ���0������Ҫ���ڿ���̨������������е����ֵ
 */

public class ListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc = new Scanner(System.in);
		//��֪�����ȣ����Զ��弯�ϣ����ڴ��
		List<Integer> intlist = new ArrayList<Integer>();
		while(true){
          System.out.println("���������֣��������밴0��");
		  int i = sc.nextInt();
		  if(i!=0){
			  intlist.add(i);
		  }else{
			  break;
		  }
		  
		}
		
		System.out.println("���ֵ��"+getMax(intlist));
		
		
	}

	public static int getMax(List<Integer> list) {
		int max = 0;
		//����list
		for(Integer i:list){
			if(i>max){
				max =i.intValue();
			}
		}
		return max;

	}

}
