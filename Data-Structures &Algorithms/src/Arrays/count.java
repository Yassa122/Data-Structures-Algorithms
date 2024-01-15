package Arrays;

public class count {

	public static int countElements(int []arr,int x,int y) {
		int left=0;
		int right=arr.length-1;
		int indexOfy=y;
		int indexOfx=x;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(arr[mid]==x) {
				indexOfx=x;
			}else if(arr[mid]==y){
				indexOfy=y;
			}
		}
		return indexOfy-indexOfx ;
	}
	public static void display(int arr[]) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[]= {0,5,13,19,25};
		int x=5;
		int y=25;
		display(arr);
		System.out.println(countElements(arr, x, y));
	}

}
