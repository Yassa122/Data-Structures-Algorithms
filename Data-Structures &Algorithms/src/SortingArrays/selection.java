package SortingArrays;

public class selection {

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int minInd = i;
			int min = arr[minInd];
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					minInd = j;
					min = arr[minInd];
				}
			}
			int tmp = arr[minInd];
			arr[minInd] = arr[i];
			arr[i] = tmp;

		}
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 1, 5, 4 };
		display(arr);
		selectionSort(arr);
		display(arr);
	}
}
