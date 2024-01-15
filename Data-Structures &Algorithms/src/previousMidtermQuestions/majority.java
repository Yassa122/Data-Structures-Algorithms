package previousMidtermQuestions;

public class majority {

	//time complexity o(n) Linear Search
	
	public static boolean isMajorityLin(int x,int[]arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				count++;
			}
			if(count>arr.length/2) {
				return true;

			}	
		}
		return false;
		
	}
	
	
	public static boolean isMajorityBin(int x,int[]arr) {
		int left=0;
		int right=arr.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(arr[mid]==x) {
				if(mid+arr.length/2<arr.length&& arr[mid+arr.length/2]==x) {
					return true;
				}else {
					return false;
				}
			}
				else if(arr[mid]<x) {
					left=mid+1;
				}else {
					right=mid-1;
				}
			}
		
		return false;
	}
	
	public static void main(String[] args) {
		int []arr={3,1,2,2,3,3,3};
		boolean res=isMajorityLin(3, arr);
		boolean res2=isMajorityBin(3, arr);
		
		System.out.println(res);
	}
	
}




/*
 *Exercise 1-6 Majority in array
Previous Midterm

Given a sorted array of n integers. The majority element is the element that occurs more than half of the size of
the array.

We would like to think about a way to find if a given integer x is a majority element or not.
For example,

• if the input array is {2,2,3,3,4,4,4,4,4} then 4 is a majority element and any other number is not a
majority element.

• if the input array is {2,2,3,3,4,4,4,4} then there is no majority element in the array.

a) Write a method isMajorityElement(int x, int[] a) that checks in O(n) whether x is a majority element or not.

b) Implement another method that will have a better order of magnitude. Determine the order of magnitude and
justify your claim.
 */