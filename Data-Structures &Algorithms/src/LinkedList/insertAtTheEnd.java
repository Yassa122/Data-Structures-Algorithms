package LinkedList;

public class insertAtTheEnd {

	public static void insertLast(LinkList l, Object o) {
		LinkList tmp = new LinkList();
		while (!l.isEmpty()) {
			tmp.insertFirst(l.removeFirst());
		}
		tmp.insertFirst(o);
		while (!tmp.isEmpty()) {
			l.insertFirst(tmp.removeFirst());
		}

	}
	
	public static Object removeLast(LinkList l) {
		LinkList tmp = new LinkList();
		
		while(!l.isEmpty()) {
			tmp.insertFirst(l.removeFirst());
		}
		Object res =tmp.removeFirst();
		while(!tmp.isEmpty()) {
			l.insertFirst(tmp.removeFirst());
		}
		return res;
	}

	public static void main(String[] args) {

		
		LinkList l= new LinkList();
		l.insertFirst(1);
		l.insertLast(2);
		l.insertLast(3);
		l.insertLast(4);
		l.insertLast(5);
		l.insertLast(6);
		l.insertLast(7);
		
		l.insertLast(8);
		l.removeLast();
		
		
		System.out.println(l);
	}
}
