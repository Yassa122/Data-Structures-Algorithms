package Queues;

public class shiftZeros {
	
	public static QueueObj ShiftZero(QueueObj q) {
		QueueObj q2=new QueueObj(q.size());
		QueueObj queueOfZero=new QueueObj(q.size());
		
		while(!q.isEmpty()) {
			if(((Integer)q.peek())==0) {
				queueOfZero.enqueue(q.dequeue());
			}else {
				q2.enqueue(q.dequeue());
			}
		}
		
		while(!q2.isEmpty()) {
			q.enqueue(q2.dequeue());
		}
		while(!queueOfZero.isEmpty()) {
			q.enqueue(queueOfZero.dequeue());
		}
		return q;
	}
	
	
	public static void main(String[] args) {
		QueueObj q= new QueueObj(10);
		q.enqueue(5);
		q.enqueue(0);
		q.enqueue(4);
		q.enqueue(0);
		q.enqueue(0);
		q.enqueue(2);
		q.enqueue(0);
		q.enqueue(1);
		q.enqueue(0);
		q.enqueue(8);
		q.printQueue();
		ShiftZero(q);
		q.printQueue();

	}
}
