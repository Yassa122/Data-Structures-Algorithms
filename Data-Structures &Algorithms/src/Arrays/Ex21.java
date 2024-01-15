package Arrays;

public class Ex21 {

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j + 1] < arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
	
	
	public static void bubbleSortRec(int []arr,int i) {
		if(arr.length-1==i) {
			return;
		}else {
		for(int j=0;i<arr.length-1-i;j++) {
			
			int tmp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=tmp;
			}
		}
		bubbleSortRec(arr,i+1);

	}
	
	
	

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int minIndex=i;
			int min=arr[minIndex];
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					minIndex=j;
					min=arr[minIndex];
				}
			}

			int tmp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=tmp;
		}
	}
	
	public static void insertionSort(int []arr) {
		for(int i=1;i<arr.length;i++) {
			int value=arr[i];
			int j;
			for(j=i-1;j>=0&&arr[j]>value;j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1]=value;

		}
	}

	public static void main(String[] args) {
		int arr[] = { 4, 3, 5, 2, 1 };
		display(arr);
		insertionSort(arr);
		display(arr);
	}
}
