package cn.itcast_02;

/*
 * ���ַ����е��ַ���������
 * ��������dacgebf��
 * �������abcdefg��
 * 
 * ������1�����ַ���ת��Ϊ�ַ�����
 *       public char[] toCharArray()
 *     2����ѡ�񷨽��ַ�������С��������
 */
public class StingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss = "dacgebf";
		char[] chs = ss.toCharArray();
		output(chs);
		select(chs);
		output(chs);
		

	}

	public static void select(char[] chs) {
		for (int i = 0; i < chs.length - 1; i++) {
			for (int j = i + 1; j <= chs.length - 1; j++) {
				if (chs[i] > chs[j]) {
					char temp = chs[i];
					chs[i] = chs[j];
					chs[j] = temp;
				}

			}

		}

	}

	public static void output(char[] chs) {
		System.out.print("[");
		for (int i = 0; i < chs.length; i++) {
			if (i == chs.length - 1) {
				System.out.println(chs[i] + "]");
			} else {
				System.out.print(chs[i] + ",");
			}

		}

	}

}
