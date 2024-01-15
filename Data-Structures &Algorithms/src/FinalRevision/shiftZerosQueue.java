package FinalRevision;

public class shiftZerosQueue {

	public static QueueObj shift(QueueObj q1) {
		QueueObj q2= new QueueObj(q1.size());
		QueueObj zero= new QueueObj(q1.size());

		while(!q1.isEmpty()) {
			if((int)q1.peek()==0) {
				zero.enqueue(q1.dequeue());
			}else {
				q2.enqueue(q1.dequeue());
			}
		}
		while(!zero.isEmpty()) {
			q2.enqueue(zero.dequeue());
		}
		q2.printQueue();
		return q2;
	}
	public static void main(String[] args) {
		QueueObj q = new QueueObj(8);
		
		q.enqueue(1);
		q.enqueue(0);
		q.enqueue(6);
		q.enqueue(0);
		q.enqueue(0);
		q.enqueue(5);
		q.enqueue(8);
		q.enqueue(9);
		q.printQueue();
		System.out.println(q.peek());
		shift(q);
		q.printQueue();

	}

}
