package cn.itcast_06;
/*
 * ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
 * ������
 * 		int[] arr = {1,2,3};	
 * ��������
 *		"[1, 2, 3]"
 * ������
 * 		A:����һ���ַ�������ֻ��������Ϊ��
 * 		B:�Ȱ��ַ���ƴ��һ��"["
 * 		C:����int���飬�õ�ÿһ��Ԫ��
 * 		D:���жϸ�Ԫ���Ƿ�Ϊ���һ��
 * 			�ǣ���ֱ��ƴ��Ԫ�غ�"]"
 * 			���ǣ���ƴ��Ԫ�غͶ����Լ��ո�
 * 		E:���ƴ�Ӻ���ַ���
 */

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr ={1,2,3};
		//����һ���ַ���s������Ϊ��
		String s="";
		//ƴ����������š�
		s=s+"[";
		//��������
		for(int i=0;i<arr.length;i++){
			if(i== (arr.length-1)){
				s+=arr[i]+"]";
			}else{
				s+=arr[i]+",";
			}
		}
		System.out.println(s);

	}

}
