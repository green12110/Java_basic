package cn.args_01;

public class ArgsTest { 
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(sum(a,b));
		System.out.println(sum(a,b,78));
	}

	private static int sum(int...a) {
		int sum =0;
		for(int i=0;i<a.length;i++){
			sum += a[i];
			
		}
		return sum;
	}

}
