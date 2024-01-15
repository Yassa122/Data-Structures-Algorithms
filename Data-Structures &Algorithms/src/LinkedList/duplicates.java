package LinkedList;

public class duplicates {
	
	public static void removeDuplicates(LinkList l) {
		LinkList tmp = new LinkList();
		tmp.insertLast(l.removeFirst());
		while(!l.isEmpty()) {
			if(l.getFirst().equals(tmp.getLast())) {
				tmp.insertLast(l.removeFirst());
			}else {
				l.removeFirst();
			}
		}
		while(!tmp.isEmpty()) {
			l.insertLast(tmp.removeFirst());
		}
	}

	
	public static void main(String[] args) {
		LinkList l= new LinkList();
		l.insertFirst(5);

		l.insertFirst(1);
		l.insertFirst(2);
		l.insertFirst(3);
		l.insertFirst(4);
		l.insertFirst(5);

		l.insertFirst(5);
		l.insertFirst(6);
		System.out.println(l);

		l.removeDuplicates();
		System.out.println(l);

	
	}
}
