package SortingArrays;

public class bubble {

	
	//time complexity o(n^2) [worst case scenario/avg case scenario]
	public static void bubblesort(int []arr) {
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
	
	
	//time complexity o(n) [best case scenario]
	public static void bubblesort2(int[]arr) {
		for(int i=0;i<arr.length-1;i++) {
			boolean flag=false;
			for(int j=0;j<arr.length-1-i;j++) {
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
	
	
	public static void display(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= {3,4,1,3,2};
		display(arr);
		bubblesort2(arr);
		display(arr);

		
	}
}
