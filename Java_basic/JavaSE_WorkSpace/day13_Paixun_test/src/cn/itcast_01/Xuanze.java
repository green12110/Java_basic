package cn.itcast_01;

public class Xuanze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 24, 69, 80, 57, 13 };
		xuanze(array);
		output(array);

	}

	public static void xuanze(int[] arr) {
		for (int i = 0; i <arr.length - 1; i++) {
			for (int j = i+1; j <=arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
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
