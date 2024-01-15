package LabAssignments;

public class shiftLeft {

	public static void shiftLeftt(QueueObj q, int x) {
		while (q.peek() != (Integer) x) {
			q.enqueue(q.dequeue());
			if (q.peek() == (Integer) x) {
				q.enqueue(q.dequeue());
				break;
			}
		}
		q.printQueue();
	}

	public static void main(String[] args) {
		QueueObj q = new QueueObj(7);
		int x = 5;
		q.enqueue(9);
		q.enqueue(1);
		q.enqueue(7);
		q.enqueue(5);
		q.enqueue(19);
		q.enqueue(5);
		q.enqueue(2);
		q.printQueue();
		shiftLeftt(q, x);
	}
}
