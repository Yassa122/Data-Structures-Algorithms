package LinkedList;

public class rearrange {

	public static LinkList arrange(LinkList l1) {
		LinkList l2 = new LinkList();
		while(!l1.isEmpty()) {
			l2.insertLast(l1.removeFirst());
			if(!l1.isEmpty()) {
				l2.insertLast(l1.removeLast());
			}
		}
		return l2;
	}
	
	public static void main(String[] args) {
		LinkList l1 = new LinkList();
		
		l1.insertFirst(6);
		l1.insertFirst(5);
		l1.insertFirst(4);
		l1.insertFirst(3);
		l1.insertFirst(2);
		l1.insertFirst(1);
	
		System.out.println(l1.toString());
		System.out.println(arrange(l1));
		
	}
} 
