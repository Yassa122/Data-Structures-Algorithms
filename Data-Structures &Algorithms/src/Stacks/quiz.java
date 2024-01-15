package Stacks;

import java.util.Stack;

public class quiz {

	
	public static Stack<Integer> collide(int []arr) {
		Stack <Integer>left=new Stack<>();
		Stack <Integer>right=new Stack<>();
		Stack <Integer>res=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				left.push(arr[i]);
			}else {
				right.push(arr[i]);
			}
		}

		while(!left.isEmpty()&&!right.isEmpty()) {
			if(right.peek()>Math.abs(left.peek())) {
				res.push(right.pop());
			}else {
				res.push(left.pop());
			}
		}
		return res;
		
	}
	public static void main(String[] args) {
		int []arr= {5,3,-1,-8};
		System.out.println(collide(arr));
	}
}
