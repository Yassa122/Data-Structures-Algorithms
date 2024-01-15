package Arrays;

public class lab2 {
	//recursive bubble sort
	
	public static void bubbleSortRec(int []arr,int i) {
		if(arr.length-1==i) {
			return;
		}else {
			for(int j=0;j<arr.length-1-i;j++) {
				int tmp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=tmp;
			}
		}
		 bubbleSortRec(arr,i+1);

	}
	//modified selection sort
	public static void modifiedSelectionSort(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			int minIndex=i;
			int maxIndex=i;
			int min=arr[minIndex];
			int max=arr[maxIndex];
			for(int j=i+1;j<arr.length-i;j++) {
				if(arr[j]<min) {
					minIndex=j;
					min=arr[minIndex];
				}if(arr[j]>=max) {
					maxIndex=j;
					max=arr[maxIndex];
				}
			}
			arr[minIndex]=arr[i];
			arr[i]=min;
			if(maxIndex == i)
				maxIndex = minIndex;
				arr[maxIndex] = arr[arr.length-1-i];
				arr[arr.length-1-i] = max;

		}
	}
	
}
