package cn.generic_03;

public class IterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter<String> it = new IterImpl<String>();
		it.show(new String("Java"));
		
		Inter<Integer> it1 = new IterImpl<Integer>();
		it1.show(new Integer(212));
		
		Inter<Character> it2 = new IterImpl<Character>();
		it2.show('S');
		
		
		
		

	}

}
