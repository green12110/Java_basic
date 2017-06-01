package cn.itcast_07;
/*
 * StringBufferµÄÌæ»»¹¦ÄÜ
 * public StringBuffer replace(int start,int end ,String str)
 */
public class StringBufferDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("HelloWorld");
		System.out.println(sb);
		sb.replace(5, 10, "java");
		System.out.println(sb);

	}

}
