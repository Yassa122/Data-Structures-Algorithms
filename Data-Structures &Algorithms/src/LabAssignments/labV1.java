package LabAssignments;

public class labV1 {

	public static void pyramidSort(int[] arr) {
		for(int i=0;i<(arr.length-1)/2;i++) {
			for(int j=arr.length/2;j<arr.length-i-1;j++) {
				if(arr[j+1]<arr[j]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
	}
	
	public static void bubbleSort(int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<(arr.length-1-i)/2-1;j++) {
				if(arr[j]<arr[j+1]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
	}
	
	public static void display(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {	
		int []arr= {3,1,2,4,5,9,13,14,12};
		display(arr);

		pyramidSort(arr);
		bubbleSort(arr);
		display(arr);
	}
}
