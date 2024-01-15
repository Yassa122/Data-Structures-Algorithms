package LabAssignments;

public class T8_7000313_Lab3 {
	
	public static void shiftLeft(QueueObj q, int x) {
	    int size = q.size();
	    boolean found = false;
	    QueueObj tempQueue = new QueueObj(size); 
	    for (int i = 0; i < size; i++) {
	        Integer element = (Integer) q.dequeue();
	        if (element.equals(x) && !found) {
	            found = true;
	            q.enqueue(element);
	            break;
	        } else {
	            tempQueue.enqueue(element); 
	        }
	    }
	    if (!found) {
	        while (!tempQueue.isEmpty()) {
	            q.enqueue(tempQueue.dequeue());
	        }
	        q.printQueue();
	        return;
	    }
	    while (!tempQueue.isEmpty()) {
	        q.enqueue(tempQueue.dequeue());
	    }

	    q.printQueue();
	}


	public static void main(String[] args) {
		QueueObj q= new QueueObj(7);
		int x=5;
		q.enqueue(9);
		q.enqueue(1);

		q.enqueue(7);

		q.enqueue(5);

		q.enqueue(19);

		q.enqueue(5);

		q.enqueue(2);

		q.printQueue();
		
		shiftLeft(q, x);
	}
}
