package Queues;

public class inserElemenatFront {
	public static QueueObj insertElemAtFront(QueueObj first,QueueObj second) {
		QueueObj res= new QueueObj(first.size());
		while(!second.isEmpty()) {
			res.enqueue(second.dequeue());
		}
		while(!res.isFull()) {
			res.enqueue(first.dequeue());
		}
		res.printQueue();
		return res;
	}

	public static void main(String[] args) {
		QueueObj f=new QueueObj(2);
		QueueObj s= new QueueObj(3);

		f.enqueue(4);
		f.enqueue(2);
		s.enqueue(9);
		s.enqueue(10);
		s.enqueue(1);
		s.printQueue();	

		f.printQueue();
		
		insertElemAtFront(f, s);
	}
}
