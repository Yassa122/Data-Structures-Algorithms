package SortingArrays;

public class zigzag {
	
	public static void sort(int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j+1]<arr[j]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
	}

	public static void zigzagSort(int []arr) {
		sort(arr);
		    for (int j = 1; j < arr.length -1; j+=2) {
				if(arr[j]<arr[j+1]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
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
		int[] arr = {4, 3, 7, 8, 6, 2, 1};
		display(arr);
		sort(arr);
		display(arr);
		zigzagSort(arr);
		display(arr);
	}

}
