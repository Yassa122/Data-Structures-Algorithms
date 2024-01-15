package Arrays;

public class LinearSortedArray {
	int count;
	int []arr;
	
	public LinearSortedArray(int maxSize) {
		count=0;
		arr=new int[maxSize];
	}
	public void orderedInsert(int x) {
		if(count<arr.length) {
			int insertPos=0;
			while(insertPos<count&&insertPos<arr[insertPos]) {
				insertPos++;
			}
			for(int k=count;k>insertPos;k--) {
				arr[k]=arr[k-1];
				arr[k]=insertPos;
			}
			count++;
		}else {
			System.out.println("Array is full");
		}
	}
	
	public int binarySearchIter(int x) {
		int left=0;
		int right=count-1;
		while(left<=right) {
			int pos=left+(right-left)/2;
		
		if(arr[x]==pos) {
			return pos;
		}else if(arr[pos]<x) {
			left=pos+1;
		}else {
			right=pos-1;
		}
		}
		return-1;
	}
	
	public int binarySearchRec(int x) {
		return binarySearchRecHelp( x, 0, count-1);
	}
	private int binarySearchRecHelp(int x,int left,int right) {
		if(left>right) {
			return -1;
		}
		int pos= left+(right-left)/2;
		
		if(arr[pos]==x) {
			return x;
		}if(arr[pos]<x) {
			return binarySearchRecHelp(x, pos+1, right);
		}else {
            return binarySearchRecHelp(x, left, pos - 1);
	}
	}
}
