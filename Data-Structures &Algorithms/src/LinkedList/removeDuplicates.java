package LinkedList;

public class removeDuplicates {

	public static void remvDuplic(LinkList l1) {
		LinkList l2 = new LinkList();
		l2.insertLast(l1.removeFirst());
		
		while(!l1.isEmpty()) {
			if(!
					l1.getFirst().equals(l2.getLast())) {
				l2.insertLast(l1.removeLast());
			}else {
				l1.removeFirst();
			}
		}
		while(!l2.isEmpty()) {
			l1.insertLast(l2.removeFirst());
			}

		
		}

	public static void main(String[] args) {

		LinkList l1 =new LinkList();
		l1.insertFirst(1);
		l1.insertFirst(2);
		l1.insertFirst(2);
		l1.insertFirst(3);
		l1.insertFirst(4);
		l1.insertFirst(4);
		l1.insertFirst(5);
		System.out.println(l1.toString());
		remvDuplic(l1);
		System.out.println(l1);
	}

}
