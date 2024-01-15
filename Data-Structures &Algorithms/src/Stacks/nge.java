package Stacks;

import java.util.Stack;

public class nge {
	public static Stack<Integer> nge(int []arr){
		Stack<Integer> s=new Stack<Integer>();
		//int greater=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]>arr[i]) {
				s.push(arr[i+1]);
			}
		
		}
		return s;
	}
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int []arr= {4,1,5,25};
		display(arr);
		System.out.println(nge(arr));
		
	}

}
