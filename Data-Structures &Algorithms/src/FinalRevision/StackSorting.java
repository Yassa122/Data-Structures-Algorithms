package FinalRevision;

import Stacks.stackSort;

public class StackSorting {

	public static void stackSorting(ArrayStack s1) {
		ArrayStack s2 = new ArrayStack(s1.size());
		ArrayStack s3 = new ArrayStack(s1.size());

		s2.push(s1.pop());

		while (!s1.isEmpty()) {
			if (s1.top() > s2.top()) {
				while(s1.top()<s2.top()) {
				s3.push(s2.pop());
				}
			} else {
				s2.push(s1.pop());

			}
		}
		

		while (!s2.isEmpty() && !s3.isEmpty()) {
			if (s2.top() < s3.pop()) {
				s1.push(s2.pop());
			} else {
				s1.push(s3.pop());
			}
		}
		s1.printStack();
	}

	public static void main(String[] args) {
		ArrayStack s1 = new ArrayStack(5);

		s1.push(3);
		s1.push(1);
		s1.push(5);
		s1.push(2);
		s1.push(4);

		s1.printStack();

		stackSorting(s1);

	}
}
