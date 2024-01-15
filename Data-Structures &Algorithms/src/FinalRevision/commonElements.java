package FinalRevision;

public class commonElements {

	public static LinkLists CommonElements(LinkLists l1, LinkLists l2) {
		LinkLists res = new LinkLists();
		Link current1 = l1.head;
		Link current2 = l2.head;
		Link current3 = res.head;

		while (current1 != null && current2 != null) {
			if ((int) current1.data > (int) current2.data) {
				current2 = current2.next;
			} else {
				if ((int) current1.data < (int) current2.data) {
					current1 = current1.next;
				}
			}
		}
		return res;

	}
}
