package SortingArrays;

public class backAndFront {

	public static void backSort(int[] arr) {
		for (int i = 0; i < (arr.length - 1) / 2; i++) {
			for (int j = arr.length / 2; j < arr.length - 1 - i; j++) {
				if (arr[j + 1] < arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}

	public static void frontSort(int[] arr) {
		for (int i = 0; i < (arr.length - 1) / 2; i++) {
			for (int j = 0; j < (arr.length - 1 - i) / 2; j++) {
				if (arr[j] < arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 2, 4, 5, 9, 13, 14, 12 };
		display(arr);

		backSort(arr);
		frontSort(arr);
		display(arr);
	}
}