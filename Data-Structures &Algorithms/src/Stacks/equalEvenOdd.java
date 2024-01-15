package Stacks;

public class equalEvenOdd {

	public static boolean isEqualEven(ArrayStack x) {
		int s=0;
		ArrayStack even = new ArrayStack( s);
		ArrayStack odd = new ArrayStack(0);

		while (!x.isEmpty()) {
			if (x.top() % 2 == 0) {
				even.push(x.pop());
			} else {
				odd.push(x.pop());
			}
		}

		

		if (even.size() == odd.size()) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		ArrayStack x = new ArrayStack(6);
		x.push(1);
		x.push(4);
		x.push(2);
		x.push(5);
		x.push(6);
		x.push(2);

		System.out.println(isEqualEven(x));
	}

}
