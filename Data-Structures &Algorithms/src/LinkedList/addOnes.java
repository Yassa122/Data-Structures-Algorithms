package LinkedList;

public class addOnes {

	
	public static LinkList addOne(LinkList l1) {
		LinkList l2 = new LinkList();
		while(!l1.isEmpty()) {
			l2.insertFirst((int)l1.removeLast()+1);
		}
		return l2;
	}
	
	public static void main(String[] args) {
		LinkList l1 = new LinkList();

		l1.insertFirst(1);
		l1.insertFirst(2);
		l1.insertFirst(3);
		l1.insertFirst(4);
		l1.insertFirst(5);
		l1.insertFirst(6);
		System.out.println(l1.toString());
		System.out.println(addOne(l1));
		
	}
} 