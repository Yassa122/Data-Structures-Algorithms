package Arrays;

import java.util.Arrays;

public class medianOf2Arrays {
	public static int[] merge(int arr1[],int arr2[]) {
		int res[]=new int[arr1.length+arr2.length];

		for(int i=0;i<arr1.length;i++) {
			res[i]=arr1[i];
		}
		
		for(int j=0;j<arr2.length;j++) {
			res[arr1.length+j]=arr2[j];
		}
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
		System.out.println();
		return res;
	}
	public static double findMedian(int[] arr1, int[] arr2) {
	    int[] arr = merge(arr1, arr2);
	    Arrays.sort(arr);
	    double median;
	    if (arr.length % 2 != 0) {
	        median = arr[arr.length / 2];
	    } else {
	        median = (arr[(arr.length - 1) / 2] + arr[arr.length / 2]) / 2.0;
	    }
	    System.out.println(median);
	    return median;
	}
       
       
    
	public static void display(int[]arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr1[]= {1,2};
		int arr2[]= {3,4};
		display(arr1);
		display(arr2);
		findMedian(arr1, arr2);
	}

}
