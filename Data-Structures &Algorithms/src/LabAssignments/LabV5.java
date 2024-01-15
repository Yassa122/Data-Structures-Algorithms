package LabAssignments;

public class LabV5 {
	
	
	
	public static void bubblesort(int[] arr, int count) {
	    for (int i = 0; i < count - 1; i++) {
	        for (int j = 0; j < count - i - 1; j++) {
	            if (arr[j + 1] < arr[j]) {
	                int tmp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = tmp;
	            }
	        }
	    }
	}
	public static void minEvenSort(int arr[]) {
		
		int even[]=new int[arr.length];
		int odd[]=new int[arr.length];
		int evenCount=0;
		int oddCount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even[evenCount++]=arr[i];
			}else {
				odd[oddCount++]=arr[i];
			}		
		}
		bubblesort(even, evenCount);
		bubblesort(odd, oddCount);
		
		
		int j = 0, k = 0;
        for(int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && j < evenCount) {
                arr[i] = even[j++];
            } else if (i % 2 != 0 && k < oddCount) {
                arr[i] = odd[k++];
            }
        }
	}
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[]= {3,6,1,8,9,0};
		display(arr);
		minEvenSort(arr);
		display(arr);

	}

}
