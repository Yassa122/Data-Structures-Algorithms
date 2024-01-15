package SortingArrays;

public class insertion {
	
	public static void insertionSort(int[]arr) {
		for(int i=1;i<arr.length;i++) {
			int value=arr[i];
			int j;
			for(j=i-1;j>=0&&arr[j]>value;j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1]=value;
		}
	}
}
