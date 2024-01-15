package Stacks;

public class stack {

	private int[] thestack;
	private int maxSize;
	private int top;

	public stack(int s) {
		maxSize = s;
		thestack = new int[maxSize];
		top = -1;
	}

	public void push(int elem) {
		top++;
		thestack[top] = elem;
	}

	public int pop() {
		int result = thestack[top];
		top--;
		return result;
	}

	public int top() {
		return thestack[top];
	}

	public boolean isFull() {
		return (top == (maxSize - 1));
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public int size() {
		return (top + 1);
	}

	public void printStack() {
		if (top == -1)
			System.out.println("Stack is empty!!\n");
		else {
			System.out.println(thestack[top] + " <- top");
			for (int i = top - 1; i >= 0; i--)
				System.out.println(thestack[i]);
			System.out.println();
		}
	}

	public int search(int target) {
		for (int i = top; i >= 0; i--) {
			if (thestack[i] == target)
				return top - i;
		}
		return -1;
	}

}
