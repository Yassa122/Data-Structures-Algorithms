package SortingArrays;

public class alternating {
	
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

	public static void zigzagSort(int[] arr) {
	    sort(arr);  // Sort the array first

	    int mid = arr.length / 2;
	    
	    // Reverse the second half of the sorted array
	    for (int i = mid, j = arr.length - 1; i < j; i++, j--) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }

	    // Now, we'll merge the two halves to get the desired pattern
	    int[] temp = new int[arr.length];
	    int idx = 0;
	    for (int i = 0, j = mid; i < mid; i++) {
	        temp[idx++] = arr[i];
	        if (j < arr.length) {
	            temp[idx++] = arr[j++];
	        }
	    }

	    // Copy the temp array back to original array
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = temp[i];
	    }
	}


	
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = {4, 3, 7, 8, 6, 2, 1, 5};
		display(arr);
		sort(arr);
		display(arr);
		zigzagSort(arr);
		display(arr);
	}

}
