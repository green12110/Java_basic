package cn.jiehe2_01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
 ArrayList����Ƕ��HashMap���ϲ�������
 ����
 ����ArrayList���ϵ�Ԫ����HashMap����3����
 ÿһ��HashMap���ϵļ���ֵ�����ַ�����
 Ԫ�����Ѿ���ɣ��������
 �����
 ���---С��
 ����---����

 ����---����
 ���---С��Ů

 �����---��ӯӯ
 ��ƽ֮---����ɺ
 */

public class HashMap2Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String,String>> wfarray = new ArrayList<HashMap<String,String>>();
		
		HashMap<String,String> hm1 = new HashMap<String,String>();
		hm1.put("���", "С��");
		hm1.put("����", "����");
		wfarray.add(hm1);
		
		HashMap<String,String> hm2 = new HashMap<String,String>();
		hm2.put("����", "����");
		hm2.put("���", "С��Ů");
		wfarray.add(hm2);
		
		HashMap<String,String> hm3 = new HashMap<String,String>();
		hm3.put("�����", "��ӯӯ");
		hm3.put("��ƽ֮", "����ɺ");
		wfarray.add(hm3);
		
		for(HashMap<String,String> hm:wfarray){
			//System.out.println(hm);
			Set<String> set = hm.keySet();
			for(String key:set){
				String value = hm.get(key);
				System.out.println(key+"--"+value);
				
			}
		}
		
		
		
		
	}

}
