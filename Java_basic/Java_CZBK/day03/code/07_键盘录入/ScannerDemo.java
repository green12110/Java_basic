/*
	Ϊ���ó�������ݸ����Ͽ��������ݣ����Ǿͼ����˼���¼�롣
	�ó�������һ�¡�
	
	��ô���������ʵ�ּ������ݵ�¼����?
		A:����
			��ʽ��
				import java.util.Scanner; 
			λ�ã�
				��class���档
		B:��������¼�����
			��ʽ��
				Scanner sc = new Scanner(System.in);
		C:ͨ�������ȡ����	
			��ʽ��
				int x = sc.nextInt();
*/
import java.util.Scanner;

class ScannerDemo {
	public static void main(String[] args) {
		//��������¼�����ݶ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��������һ�����ݣ�");
		int x = sc.nextInt();
		
		System.out.println("������������ǣ�"+x);
	}
}