package LinkedList;

class links {
	public Object data;
	public links next;

	public links(Object o) {
		this.data = o;
		this.next = null;
	}

	public String toString() {
		return data.toString();
	}

}

class SingleLinkList {

	private links head;

	public SingleLinkList() {
		head = null;
	}

	public void insertFirst(Object o) {
		links newLink = new links(o);
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
		links newLink = new links(o);

		if (head == null) {
			head = newLink;
			return;
		}
		links current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newLink;
	}

	public Object removeLast() {
		if (head.next == null) {
			Object res = head.data;
			head = null;
			return res;
		}
		links current = head;
		while (current.next.next != null)
			current = current.next;
		Object res = current.next.data;
		current.next = null;
		return res;
	}

	public Object getLast() {
		links current = head;
		while (current.next != null)
			current = current.next;
		return current.data;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public String toString() {
		if (head == null)
			return "[ ]";
		String res = "[ " + head.data;
		links current = head.next;
		while (current != null) {
			res += ", " + current.data;
			current = current.next;
		}
		res += " ]";
		return res;
	}
}
