package LinkedList;

class Link {
	public Object data;
	public Link next;

	public Link(Object o) {
		this.data = o;
		this.next = null;
	}

	public String toString() {
		return data.toString();
	}
}

class LinkList {
	private Link head;

	public LinkList() {
		head = null;
	}

	public void insertFirst(Object o) {
		Link newLink = new Link(o);
		newLink.next = head;
		head = newLink;
	}

	public Object removeFirst() {
		Object res = head.data;
		head = head.next;
		return res;
	}

	public Object getFirst() {
		return head.data;
	}

	public void insertLast(Object o) {
		Link newLink = new Link(o);
		if (head == null) {
			head = newLink;
			return;
		}
		Link current = head;
		while (current.next != null)
			current = current.next;
		current.next = newLink;
	}

	public Object removeLast() {
		if (head.next == null) {
			Object res = head.data;
			head = null;
			return res;
		}
		Link current = head;
		while (current.next.next != null)
			current = current.next;
		Object res = current.next.data;
		current.next = null;
		return res;
	}

	public Object getLast() {
		Link current = head;
		while (current.next != null)
			current = current.next;
		return current.data;
	}

	public void insertLastRec(Object o) {
		if (head == null) {
			head = new Link(o);

		} else {
			insertLastRechelper(head, o);
		}
	}

	public void addOnes() {
		Link current = head;
		while (current != null) {
			current.data = (int) current.data + 1;
			current = current.next;

		}
	}

	public void insertLastRechelper(Link l, Object o) {
		if (l.next == null) {
			l.next = new Link(o);
		}
		insertLastRechelper(l.next, o);
	}

	public void reverse() {
		LinkList revList = new LinkList();
		Link current = head;
		while (current != null) {

		}

	}

	public int count() {
		int n = 0;
		for (Link x = head; x != null; x = x.next) {
			n++;
		}
		return n;

	}

	public void removeDuplicates() {
		Link current = head;

		while (current != null) {
			Link runner = current;

			while (runner.next != null) {
				// Compare the data of the current and next nodes
				if (current.data.equals(runner.next.data)) {
					// Duplicate found, remove it
					runner.next = runner.next.next;
				} else {
					// Move the second pointer to the next node
					runner = runner.next;
				}
			}

			// Move the first pointer to the next node
			current = current.next;
		}
	}

	public void removeEven() {
		Link current = head;

		while (current != null && current.next != null) {

			current.next = current.next.next;
			current = current.next;
		}

	}

	public int findLength() {
		int count = 0;
		Link Current = head;
		while (Current.next != null) {
			Current = Current.next;
			count++;
		}
		return count;

	}

	public Object findNthFromEnd(int n) {
		Link Last = head;
		int count = 0;

		while (Last.next != null) {
			Last = Last.next;
			count++;
		}

		Link tmp = head;
		for (int i = 0; i < count - n; i++) {
			tmp = tmp.next;
		}
		return tmp;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public Object maxNode() {
		if (head == null) {
			return null;
		}
		Comparable max = (Comparable) head.data;
		Link current = head.next;

		while (current != null) {
			if (max.compareTo(current.data) < 0) {
				max = (Comparable) current.data;
			} else {
				current = current.next;
			}
		}
		return max;
	}

	public void minToFront() {
		Link Current = head;
		int count = 0;
		int min = 0;
		while (Current.next != null) {
			Current = Current.next;
			count++;
		}
		count++;
		for (int i = 0; i < count; i++) {
		}
	}

	public boolean contains(Object o) {
		Link current = head;
		while (current != null) {
			if (current.data.equals(o)) {
				return true;
			}
		}
		return false;

	}
	

	public String toString() {
		if (head == null)
			return "[ ]";
		String res = "[ " + head.data;
		Link current = head.next;
		while (current != null) {
			res += ", " + current.data;
			current = current.next;
		}
		res += " ]";
		return res;
	}

	public static void main(String[] args) {
		LinkList myList = new LinkList();

		myList.insertLast(5);
		myList.insertLast(2);
		myList.insertLast(8);
		myList.insertLast(2);
		myList.insertLast(5);
		myList.insertLast(1);
		myList.insertLast(8);

		System.out.println(myList.toString());
		System.out.println(myList.maxNode());
		System.out.println(myList.findNthFromEnd(3).toString());
	}
}
