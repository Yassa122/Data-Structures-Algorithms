package Stacks;

import java.util.Stack;

public class oddThenEven {
	
	public static void evenOdd(Stack <Integer>s) {
		Stack<Integer>Even=new Stack<Integer>();
		Stack<Integer>odd=new Stack<Integer>();

		while(!s.isEmpty()) {
			if(s.peek()%2==0) {
				Even.push(s.pop());
			}else {
				odd.push(s.pop());
			}
		}
		while(!Even.isEmpty()) {
			s.push(Even.pop());
		}
		while(Even.isEmpty()&&!odd.isEmpty()) {
			s.push(odd.pop());
		}

		System.out.println(s);
	}
	public static void main(String[] args) {
		Stack<Integer>s=new Stack<>();
		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		System.out.println(s.peek());
		System.out.println(s);
		evenOdd(s);
	}

}
