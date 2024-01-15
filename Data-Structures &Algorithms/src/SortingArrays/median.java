package SortingArrays;

public class median {

	public static double merge(int []arr1,int arr2[]) {
		int []arr=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			arr[i]=arr1[i];
		
		
		}
		for(int j=0;j<arr2.length;j++) {
			arr[arr1.length+j]=arr2[j];
		}
		//bubble
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j+1]<arr[j]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		double median=0.0;
		if(arr.length%2==0) {
		median=((arr[arr.length/2]+arr[(arr.length)/2]-1))/2.0;
		}else {
			median=arr[arr.length/2];
		}
		display(arr);
		System.out.println(median);
		return median;
	}
	
	public static void display(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr1[]= {4,2,1};
		int arr2[]= {5,6,3};
		merge(arr1, arr2);

		
		}
}
