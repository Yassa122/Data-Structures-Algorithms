package Arrays;

public class peak {
	public static boolean isPeak(int[]arr,int x) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int pos=left+(right-left)/2;
			if(arr[pos]==x) {
				 if ((pos == 0 || arr[pos - 1] <= arr[pos]) && (pos == arr.length - 1 || arr[pos] <= arr[pos])) {
			            return true;
			        
				}else {
					return false;
				}
			}else if(arr[pos]<x) {
				left=pos+1;
			}else {
				right=pos-1;
			}
		}
		return false;
	}

}
