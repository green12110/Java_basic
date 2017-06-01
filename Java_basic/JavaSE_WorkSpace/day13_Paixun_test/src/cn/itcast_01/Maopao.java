package cn.itcast_01;
/*
 * ц╟ещеепР
 */
public class Maopao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 24, 69, 80, 57, 13 };
		maopao(array);
		output(array);

	}

	public static void maopao(int[] arr) {
		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 1; j <= arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}

		}

	}

	public static void output(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
