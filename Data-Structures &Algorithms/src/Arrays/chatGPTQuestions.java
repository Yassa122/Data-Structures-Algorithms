package Arrays;

public class chatGPTQuestions {

	public static boolean isMajority(int[] arr, int x) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == x) {
				if (mid + arr.length / 2 < arr.length && arr[mid + arr.length / 2] == x) {
					return true;
				} else {
					return false;
				}
			}
			if (arr[mid] < x) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return false;
	}

	public static int[] mergeSort(int arr1[], int arr2[]) {

		int[] arrTot= new int[arr1.length+arr2.length];	
		 for (int i=0;i<arr1.length; i++) {
		        arrTot[i] =arr1[i];
		    }
		    for (int i=0;i<arr2.length; i++) {
		        arrTot[arr1.length + i] = arr2[i];
		    }
		for (int i=0;i<arrTot.length-1;i++) {
			int minIndex = i;
			for (int j=i+1;j< arrTot.length;j++) {
				if (arrTot[j]< arrTot[minIndex]) {
					minIndex =j;
				}
				
			}
			int tmp=arrTot[minIndex];
			arrTot[minIndex]=arrTot[i];
			arrTot[i]=tmp;
			

		}
		return arrTot;

	}
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr1[] = { 6, 2, 5, 1};
		int arr2[]= {4,7,3,8};
		int tot[]=mergeSort(arr1, arr2);
		display(tot);
	}
}
