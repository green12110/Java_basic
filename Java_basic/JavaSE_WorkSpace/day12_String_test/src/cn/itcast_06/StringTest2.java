package cn.itcast_06;

/*
 *  * ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���(�Ľ���)
 * ������
 * 		int[] arr = {1,2,3};	
 * ��������
 *		"[1, 2, 3]"
 */
public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
	    String ss = printStr(arr);
	    System.out.println(ss);

	}

	public static String printStr(int[] arr) {
		// ����һ���ַ���s������Ϊ��
		String s = "";
		// ƴ����������š�
		s = s + "[";
		// ��������
		for (int i = 0; i < arr.length; i++) {
			if (i == (arr.length - 1)) {
				s += arr[i] + "]";
			} else {
				s += arr[i] + ",";
			}
		}
		
		return s;

	}

}
