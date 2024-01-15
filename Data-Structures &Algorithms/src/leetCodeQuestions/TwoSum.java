package leetCodeQuestions;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		int arr[] = null;
		int left=0;
		int right=nums.length-1;
		
			while(left<=right) {
				int mid=nums[left]+(nums[right]-nums[left]);
				if(target==nums[mid]+nums[mid+1]) {
				}
			}
			return arr;
	}
	public static void display(int []arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
			
	}
	public static void main(String[] args) {
		int arr[]= {1,4,5,7};
		int t=8;
		display(arr);
		twoSum(arr, t);
	}
}
