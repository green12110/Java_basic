package cn.itcast_07;
/*
 * StringBuffer ɾ������
 * public StringBuffer deleteCharAt(int index)
 * public StringBuffer delete(int start,int end)
 */
public class StringBufferDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("HelloWorld");
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.insert(5, 'W');
		System.out.println(sb);
		sb.delete(2, 4);
		System.out.println(sb);
		//ɾ�����е�����
		sb.delete(0,sb.length());
		System.out.println("sb:"+sb);


	}

}
