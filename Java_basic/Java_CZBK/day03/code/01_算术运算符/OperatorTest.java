/*
	++,--����ϰ��
	
	��һ�⣺
	int a = 10;
	int b = 10;
	int c = 10;

	a = b++;
	c = --a;
	b = ++a;
	a = c--;
	��ֱ�����a,b,c��ֵ
	
	�ڶ��⣺
	int x = 4;
	int y = (x++)+(++x)+(x*10);
	��ֱ�����x,y��ֵ
*/
class OperatorTest {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 10;

		a = b++; //a=10,b=11,c=10
		c = --a; //a=9,b=11,c=9
		b = ++a; //a=10,b=10,c=9
		a = c--; //a=9,b=10,c=8
		
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("--------------");
		
		int x = 4;
		int y = (x++)+(++x)+(x*10);
		//4+6+60
		//x=5,6
		
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
}