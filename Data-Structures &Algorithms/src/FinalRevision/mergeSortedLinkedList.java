package FinalRevision;

public class mergeSortedLinkedList {

	// 2nd approach
	public static LinkLists merge(LinkLists l1, LinkLists l2) {
		LinkLists result = new LinkLists();
		Link current1 = l1.head;
		Link current2 = l2.head;

		while (current1 != null && current2 != null) {
			if ((int) current1.data <= (int) current2.data) {
				result.insertLast(current1.data);
				current1 = current1.next;
			} else {
				result.insertLast(current2.data);
				current2 = current2.next;
			}
		}

		// Add remaining elements of l1 or l2
		while (current1 != null) {
			result.insertLast(current1.data);
			current1 = current1.next;
		}

		while (current2 != null) {
			result.insertLast(current2.data);
			current2 = current2.next;
		}

		return result;
	}

}
