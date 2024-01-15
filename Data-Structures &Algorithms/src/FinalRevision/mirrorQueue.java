package FinalRevision;

public class mirrorQueue {
	
	public static QueueObj mirror(QueueObj q1) {
		QueueObj res= new QueueObj(q1.size()*2);

		for(int i=0;i<q1.size();i++) {
			for(int j=0;j<q1.size()-1;j++) {
				q1.enqueue(q1.dequeue());
			}
			res.enqueue(q1.peek());
		}
		while(!q1.isEmpty()) {
			res.enqueue(q1.dequeue());
		}
		res.printQueue();
		return res;
		
	}
	public static void main(String[] args) {
		QueueObj q= new QueueObj(5);
		q.enqueue(1);
		q.enqueue(4);
		q.enqueue(3);
		q.enqueue(6);
		q.enqueue(8);
		
		q.printQueue();
		mirror(q);

	}

	
	
}
