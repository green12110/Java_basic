package cn.jiehe2_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
/*
 *����
 *����HashMap���ϵ�Ԫ����ArrayList����3����
 *ÿһ��ArrayList���ϵ�ֵ���ַ�����
 *Ԫ�����Ѿ���ɣ��������
 *�����
 *		 ��������
 *		 	����
 *		 	���
 *		 Ц������
 *		 	�����
 *		 	��ƽ֮
 *		 �������
 *		 	����
 *		 	���  
 */

public class HashMap2Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,ArrayList<String>> mz = new HashMap<String,ArrayList<String>>();
		
		ArrayList<String> perArray1 = new ArrayList<String>();
		perArray1.add("����");
		perArray1.add("���");		
		mz.put("��������", perArray1);
		
		ArrayList<String> perArray2 = new ArrayList<String>();
		perArray2.add("�����");
		perArray2.add("��ƽ֮");
		mz.put("Ц������", perArray2);
		
		ArrayList<String> perArray3 = new ArrayList<String>();
		perArray3.add("����");
		perArray3.add("���");
		mz.put("�������", perArray3);
		
		//����
		Set<String> set = mz.keySet();
		for(String key:set){
			ArrayList<String> pervalue = mz.get(key);
			//System.out.println(key+"--"+pervalue);
			System.out.println(key);
			for(String s: pervalue){
				System.out.println(key+"---"+s);
			}
			
		}
		
		
		
	}

}
