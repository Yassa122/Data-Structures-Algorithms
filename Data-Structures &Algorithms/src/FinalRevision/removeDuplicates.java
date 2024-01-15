package FinalRevision;

public class removeDuplicates {

	public static void removeDuplicate(LinkLists l) {
		LinkLists l1 = new LinkLists();
		l1.insertLast(l.removeFirst());
		while (!l.isEmpty()) {
			if (!l.getFirst().equals(l1.getLast())) {
				l1.insertLast(l.removeFirst());
			} else {
				l.removeFirst();
			}
			while (!l1.isEmpty()) {
				l.insertLast(l1.removeFirst());
			}
		}

	}
	public static void main(String[] args) {
		LinkLists l= new LinkLists();
		
		l.insertFirst(1);
		l.insertFirst(1);
		l.insertFirst(2);
		l.insertFirst(3);
		l.insertFirst(3);
		l.insertFirst(4);
		l.insertFirst(5);
		System.out.println(l);
		l.removeDuplicates();
		System.out.println(l);

	}

}
