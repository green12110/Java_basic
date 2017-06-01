package cn.itcast_04;

/*
 * char charAt(int index)  返回指定索引处的 char值
   int indexOf(int ch)
   int indexOf(String str)
   int indexOf(int ch,int fromIndex)
   int indexOf(String str,int fromIndex)
   String substring(int start)
   String substring(int start,int end)
 */

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "HelloWord";
		
		//char charAt(int index)
		char a = s.charAt(4);
		System.out.println("charAt:"+a);
		System.out.println("charAt:"+s.charAt(0));
		System.out.println("-----------------------");
		
		//int indexOf(int ch)
		int x = s.indexOf(98);
		System.out.println("indexOf:"+x);
		System.out.println("-----------------------");
		
		//int indexOf(String str)
		int y = s.indexOf('H');
		System.out.println("indexOf:"+y);
		System.out.println("indexOf:"+s.indexOf('h'));
		System.out.println("-----------------------");
		
		//int indexOf(int ch,int fromIndex)
		int z = s.indexOf(101, 1);
		System.out.println("indexOf:"+z);
		System.out.println("-----------------------");
		
		//int indexOf(String str,int fromIndex)
		int xx = s.indexOf("llo",2);
		System.out.println("indexOf:"+xx);
		System.out.println("-----------------------");
		
		// String substring(int start)
		String ss1 = s.substring(4);
		System.out.println("substring:"+ss1);
		System.out.println("-----------------------");
		
		//String substring(int start,int end)
		String ss2 = s.substring(4, 8);
		System.out.println("substring:"+ss2);
		System.out.println("-----------------------");
		
		
	}

}
