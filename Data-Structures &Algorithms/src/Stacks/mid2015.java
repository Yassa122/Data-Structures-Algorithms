package Stacks;

public class mid2015 {
	public static void stackSort1(ArrayStack s) {
		ArrayStack x = new ArrayStack(s.size());
		ArrayStack y = new ArrayStack(s.size());
		while (!s.isEmpty()) {
			int tmp = (Integer) s.pop();
			if (x.isEmpty())
				x.push(tmp);
			else {
				while (!x.isEmpty() && (Integer) x.top() > tmp) {
					y.push(x.pop());
				}
				x.push(tmp);
				while (!y.isEmpty())
					x.push(y.pop());
			}
		}
		while (!x.isEmpty())
			s.push(x.pop());
	}
}
