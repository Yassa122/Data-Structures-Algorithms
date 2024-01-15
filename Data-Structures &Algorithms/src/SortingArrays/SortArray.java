package SortingArrays;

public class SortArray {
	
	
	
	//worst case scenario in bubble sort O(n^2)
	//ex: array is sorted in descending order ||
	// array is not sorted will be in default in worst case scenario
	public static void BubbleSort(int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j+1]<arr[j]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
		
			}
		}
			
	}
	
	//best case scenario in bubble sort O(n)
	//array must be sorted in ascending order
	//to be in default in best case scenario
	// we call the best case scenario of a bubble sort
	//(enhanced or optimized bubble sort)
	
	
	public static void enhancedBubbleSort(int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			boolean flag=false;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j+1]<arr[j]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
					flag=true;
				}
			}
			if(!flag) {
				break;
			}			
		}
	}
	
	
	//selection sort best case scenario O(N^2)
	//worst case scenario O(N^2)
	//avg case scenario O(N^2)
	public void selectionSort(int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min=i;//minimum index
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
					
				}
			}
			int tmp=arr[min];
			arr[min]=arr[i];
			arr[i]=tmp;
		}
	}
	
	//there's an
	

}
