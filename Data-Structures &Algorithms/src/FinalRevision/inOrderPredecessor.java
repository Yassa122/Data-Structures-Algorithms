package FinalRevision;

public class inOrderPredecessor {

	public static void findPredecessor(BTree t, Comparable key) {
		Node current = t.root;
		Node predecessor = null;
		boolean found = false;

		while (current != null) {
			if (key.compareTo(current.data) > 0) {
				predecessor = current;
				current = current.right;
			} else if (key.compareTo(current.data) < 0) {
				current = current.left;
			} else {
				found = true;
				if (current.left != null) {
					predecessor = findMax(current.left);
				}
				break;
			}
		}

		if (!found) {
			System.out.println("The key " + key + " does not exist in the BST.");
		} else if (predecessor == null) {
			System.out.println("In-order predecessor of " + key + " does not exist.");
		} else {
			System.out.println("The in-order predecessor of " + key + " is " + predecessor.data);
		}
	}

	private static Node findMax(Node node) {
		while (node.right != null) {
			node = node.right;
		}
		return node;
	}
}
