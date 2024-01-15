package SortingArrays;

public class partialSelection {

	public static void partialSelectionSort(int[] arr) {
		for(int i=0;i<arr.length/4;i++) {
			int minIndex=i;
			int min=arr[minIndex];
			for(int j=i+1;j<arr.length/4;j++) {
				if(arr[j]<min) {
					minIndex=j;
					min=arr[minIndex];
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
		for (int i = arr.length - 1; i >= 3 * arr.length / 4; i--) {
	        int maxIndex = i;
	        int max = arr[maxIndex];
	        for (int j = i - 1; j >= 3 * arr.length / 4; j--) {
	            if (arr[j] > max) {
	                maxIndex = j;
	                max = arr[maxIndex];
	            }
	        }
	        int temp = arr[maxIndex];
	        arr[maxIndex] = arr[i];
	        arr[i] = temp;
	    }
	}
	
	
	
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[]= {5,4,2,1,3,7,6,10,9,8};
		display(arr);
		partialSelectionSort(arr);
		display(arr);
	}




}





