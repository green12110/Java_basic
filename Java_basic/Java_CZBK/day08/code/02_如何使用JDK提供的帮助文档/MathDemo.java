/*
	Math:���������ִ�л�����ѧ����ķ���
	
	����Math����java.lang���£����Բ���Ҫ������
	�ص㣺
		û�й��췽������Ϊ���ĳ�Աȫ���Ǿ�̬�ġ�
		
	����һ��������
		��ȡ�����
		public static double random():���ش����ŵ� double ֵ����ֵ���ڵ��� 0.0 ��С�� 1.0��
*/
class MathDemo {
	public static void main(String[] args) {
		//��ȡһ�������
		//double d = Math.random();
		//System.out.println(d);
		
		//������Ҫ��ȡһ��1-100֮������������ô��?
		for(int x=0; x<100; x++) {
			int number = (int)(Math.random()*100)+1;
			System.out.println(number);
		}
	}
}