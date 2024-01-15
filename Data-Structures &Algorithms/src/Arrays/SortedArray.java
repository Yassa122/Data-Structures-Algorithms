package Arrays;

public class SortedArray {
	int arr[];
	int count;
	
	public SortedArray(int maxSize) {
		count=0;
		arr=new int[maxSize];
	}
	
	
	public void orderedInsert(int x) {
		if(count<arr.length) {
			int pos=0;
			while(pos<count&&pos<arr[pos]) {
				pos++;
			}
			for(int i=count;i>pos;i--) {
				arr[i]=arr[i-1];
				arr[i]=pos;

			}
			count++;
		}else {
			System.out.println("Array is full");
		}
	}
	
	public static boolean binarySearch(int[]arr,int x) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(arr[mid]==x) {
				return true;
			}else if(arr[mid]<x){
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		return false ;
	}
	
	public int binarySearchRec(int x) {
			return binarySearchRecHlp(0,arr.length-1,x);
	}


	public int binarySearchRecHlp(int left, int right, int x) {
		int mid=left+(right-left)/2;
		if(arr[mid]!=x) {
			return -1;
		}else if(arr[mid]==x) {
			return mid;
		}else if(arr[mid]<x) {
			return binarySearchRecHlp(mid+1,0,x);
		}else {
			return binarySearchRecHlp(0,mid-1,x);
		}	
	}
	public static void display(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int v=7;
		display(arr);
		System.out.println(binarySearch(arr, v));
		
	}
}
