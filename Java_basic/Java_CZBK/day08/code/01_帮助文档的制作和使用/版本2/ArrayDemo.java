/*
	����Ҫ��������в���
	
	�������һ��˵������?
		A:дһ��������
		B:�����������ĵ�ע��
			��ô����?
			��Щʲô������?
		C:�ù��߽����ĵ�ע��
			javadoc����
		D:��ʽ
			javadoc -d Ŀ¼ -author -version ArrayTool.java
			
			Ŀ¼���Ϳ���дһ���ļ��е�·��
			
	���������ĵ�����
		�Ҳ��������ĵ����Ĺ������ܱ������ࣺ�����������Ȩ�޲���
*/
class ArrayDemo {
	public static void main(String[] args) {
		//��������
		int[] arr = {28,55,37,46,19};
		
		//����
		ArrayTool.printArray(arr);

		//��ȡ��ֵ
		int max = ArrayTool.getMax(arr);
		System.out.println("max:"+max);
		
		//��ȡ55������ֵ
		int index = ArrayTool.getIndex(arr,55);
		System.out.println("index:"+index);
	}
}