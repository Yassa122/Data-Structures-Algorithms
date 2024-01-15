package Stacks;

public class trackingPrices {
	
	public static ArrayStack countGreater(int []arr) {
		ArrayStack s=new ArrayStack(arr.length);
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			for (int j=0;j<arr.length-i-1;j++) {
				if (arr[j]<arr[j+1]) {
					count++;
				}
				s.push(count);
			}
		}
		return s;
	}

}
