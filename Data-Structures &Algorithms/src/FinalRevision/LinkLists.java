package FinalRevision;

import org.w3c.dom.Node;


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

class LinkLists {
	 Link head;

	public LinkLists() {
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

	public Object findTheMid() {
		  if (head == null) {
		        return null; // list is empty
		    }

		    Link slow = head;
		    Link fast = head;

		    while (fast != null && fast.next != null) {
		        slow = slow.next;           // moves one step
		        fast = fast.next.next;      // moves two steps
		    }
		    return slow.data;
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

	public boolean isEmpty() {
		return head == null;
	}

	public void addOnesInternal() {
		Link current = head;
		while (current != null) {
			current.data = (int) current.data + 1;
			current = current.next;
		}
	}
	
	public boolean isPalindrome() {
	    if (head == null || head.next == null) {
	        return true;
	    }

	    // Find the middle of the list
	    Link slow = head;
	    Link fast = head;
	    while (fast != null && fast.next != null) {
	        slow = slow.next;
	        fast = fast.next.next;
	    }

	    // Reverse the second half of the list
	    Link prev = null;
	    Link current = slow;
	    while (current != null) {
	        Link next = current.next;
	        current.next = prev;
	        prev = current;
	        current = next;
	    }

	  
	    Link left = head;
	    Link right = prev;
	    while (right != null) {
	        if (!left.data.equals(right.data)) {
	            return false;
	        }
	        left = left.next;
	        right = right.next;
	    }

	    return true;
	}


	public void removeDuplicates() {
	    if (head == null || head.next == null) {
	        return;
	    }

	    Link current = head;
	    while (current != null) {
	        Link runner = current;
	        while (runner.next != null) {
	            if (runner.next.data.equals(current.data)) {
	                runner.next = runner.next.next;
	            } else {
	                runner = runner.next;
	            }
	        }
	        current = current.next;
	    }
	}

	
	public void addOnesInternalRec() {
		addOnesInternalRecUtil(this.head);
	}

	public void addOnesInternalRecUtil(Link curr) {
		if (curr == null)
			return;
		curr.data = (int) curr.data + 1;
		addOnesInternalRecUtil(curr.next);
	}

	public void modifiedList() {
		Link current = head.next;
		Link prev = head;
		int sum = 0;
		while (current != null) {
			if (!current.data.equals(0)) {
				sum += (int) current.data;

			} else {
				prev.data = sum;
				
				if(current.next!=null) {
					prev.next=current;
					prev=current;
				}else {
					prev.next=null;
				}
				sum=0;
			}
			current=current.next;
		}
	}
	

	
	public void cutList() {
		if(head==null) {
			return;
		}
		
		Link current=head;
		Link prev=null;
		int count =0; 
		while(current!=null) {
			count++;
			current=current.next;
		}
		current=head;
		for (int i=1; i<count/2 ; i++) {
			current=current.next;
		}

		
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
		LinkLists l1 = new LinkLists();

		l1.insertFirst(0);

		l1.insertFirst(2);
		l1.insertFirst(3);
		l1.insertFirst(4);
		l1.insertFirst(0);
		l1.insertFirst(6);
		l1.insertFirst(0);

		System.out.println(l1);

		l1.modifiedList();

		System.out.println(l1);
	}

}
