package LabAssignments;

public class T8_7000313_Lab1 {

	
	public static int findFirst(int[] arr, int x) {
	    int left =0;
	    int right = arr.length-1;
	    int result= 1;

	    while (left <= right) {
	        int mid = left+(right-left)/2;
	        if (arr[mid]>=x) {
	            result= mid;
	            right=mid-1;
	        } else {
	            left=mid+1;
	        }
	    }
	    return result;
	}

	public static int findLast(int[] arr, int y) {
	    int left = 0;
	    int right = arr.length-1;
	    int result = -1;
	    while (left <=right) {
	        int mid = left + (right-left) / 2;
	        if (arr[mid]<= y) {
	            result =mid;
	            left =mid+ 1;
	        } else {
	            right =mid-1;
	        }
	    }

	    return result;
	}
	public static int countElements(int[] arr, int x, int y) {
	    int first = findFirst(arr, x);
	    int last =findLast(arr, y);

	    if (first==-1||last==-1||first>last) {
	    	return 0; 
	    }
	    return last-first-1;
	}


	
	public static void display(int arr[]) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[]= {0,5,13,19,25};
		int x=0;
		int y=25;
		display(arr);
		System.out.println(countElements(arr, x, y));
	}
}
