package FinalRevision;

public class reverseQueue {

	public static QueueObj ReverseQueue(QueueObj q) {
		QueueObj reverse = new QueueObj(q.size());
		for (int i = 0; i < q.size(); i++) {
			for (int j = 0; j < q.size() - 1; j++) {
				q.enqueue(q.dequeue());
			}
			reverse.enqueue(q.peek());
		}
		reverse.printQueue();
		return reverse;
	}

	public static void main(String[] args) {
		QueueObj q = new QueueObj(6);
		q.enqueue(1);
		q.enqueue(4);
		q.enqueue(3);
		q.enqueue(2);
		q.enqueue(6);
		q.enqueue(7);
		q.printQueue();
		ReverseQueue(q);
		q.printQueue();
	}

}
