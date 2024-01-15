package Arrays;


public class bogoSort {
	
	public static boolean isSorted(int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void shuffle(int []arr) {
		for(int i=0;i<arr.length;i++) {
		 int newPos =(int) (Math.random()*arr.length) ;
		int temp = arr[i];
		arr[i] = arr[newPos];
		arr[newPos] = temp;
	}
	}
	
	public static void bogoSort(int []arr) {
		while (!isSorted(arr)) {
			shuffle(arr);
		}
		if(isSorted(arr)) {
			System.out.println("array is sorted");
		}

	}
	
	public static void main(String[] args) {
		int[] a = { 4, 7, 1, 9, 3 };
		bogoSort(a);
		
		}

}
