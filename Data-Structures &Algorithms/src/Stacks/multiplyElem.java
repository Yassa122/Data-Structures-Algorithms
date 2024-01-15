package Stacks;

import java.util.Stack;

public class multiplyElem {

	public static Stack<Integer> multiply(Stack<Integer>s,int k){
		Stack<Integer>res= new Stack<Integer>();
		while(!s.isEmpty()) {
			res.push(s.pop()*k);
		}
		while(!res.isEmpty()) {
			s.push(res.pop());
		}
		
		System.out.println(s);
	return s;
	}
	public static void main(String[] args) {
		Stack<Integer>s= new Stack<Integer>();
		int k=2;
		s.push(2);
		s.push(3);
		s.push(17);
		s.push(8);
		s.push(16); 
		s.push(22);
		System.out.println(s.peek());
		System.out.println(s);
		multiply(s, k);
		System.out.println(s.peek());

	}
}
