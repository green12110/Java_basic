package cn.map_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
 * ����Map���Ϸ�������
 * Set<Map.Entry<k,v>> entrySet()
 */

public class MapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("����", "�����P");
		map.put("������", "��С�");
		map.put("١��Ϊ", "����");
		map.put("������", "��ӱ");
		//map��key�����ظ����൱��һ��set���ϡ�
		//Map��� entrySet()���ش�ӳ���а�����ӳ���ϵ�� Set ��ͼ��
		Set<Map.Entry<String,String>> set = map.entrySet();
		for(Map.Entry<String,String> m:set){
			String key =m.getKey();
			String value = m.getValue();
			System.out.println(key+"----"+value);
			
			
		}

	}

}
