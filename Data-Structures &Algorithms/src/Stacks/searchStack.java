package Stacks;

public class searchStack {

	public static int searchFor(ArrayStack s, int t) {
		int position = 0;
		boolean flag = false;
		ArrayStack s2 = new ArrayStack(s.size());

		while (!(s.isEmpty())) {
			if (s.top() == t) {
				flag = true;
				break;
			}
			s2.push(s.pop());
			position++;
		}
			while ((!(s2.isEmpty())) && (!(s.isFull()))) {
				s.push(s2.pop());
			}
			if (!flag) {
				position = -1;
			}
		
		
		return position;
	}

	public static void main(String[] args) {
		ArrayStack s = new ArrayStack(10);
		s.push(4);
		s.push(20);
		s.push(7);
		s.push(1);
		s.printStack();
		System.out.println(12 + ", externally: " + searchFor(s, 12));
		System.out.println(4 + ", externally: " + searchFor(s, 4));
		System.out.println(20 + ", externally: " + searchFor(s, 20));

	}

}
