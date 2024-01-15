package LinkedList;

import java.util.LinkedList;

public class reverse {
	public static LinkedList reverse1(LinkedList list) {
		LinkedList revList = new LinkedList<>();
		while (!list.isEmpty())
			revList.addFirst(list.removeFirst());;
		return revList;
	}

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.addFirst(1);
		l.addFirst(6);
		l.addFirst(3);
		l.addFirst(5);
		l.addFirst(2);
		System.out.println(l.toString());
	System.out.println(reverse1(l));
	}
}
