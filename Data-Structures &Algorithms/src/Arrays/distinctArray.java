package Arrays;

public class distinctArray {
	public static int searchDistinct(int[]arr) {
		int left=0;
		int right=arr.length-1;
		int res=0;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(arr[mid]<mid) {
				return mid;
			}
		}
		return res;
	}

}
