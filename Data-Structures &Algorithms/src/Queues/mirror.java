package Queues;

public class mirror {

    public static QueueObj reverse(QueueObj q) {
        QueueObj temp = new QueueObj(q.size());
        QueueObj rev = new QueueObj(q.size());
        while (!q.isEmpty()) {
            Object data = q.dequeue();
            temp.enqueue(data);
            rev.enqueue(data);
        }
        
        // Restore original queue
        while (!temp.isEmpty()) {
            q.enqueue(temp.dequeue());
        }
        return rev;
    }
    
    public static QueueObj mirroring(QueueObj q) {
        QueueObj q2 = new QueueObj(q.size() * 2);
        QueueObj revQ = reverse(q);

        while (!q.isEmpty()) {
            q2.enqueue(q.dequeue());
        }
        while (!revQ.isEmpty()) {
            q2.enqueue(revQ.dequeue());
        }
        
        return q2;
    }

    public static void main(String[] args) {
        QueueObj q = new QueueObj(4);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.printQueue();

        QueueObj mirroredQueue = mirroring(q);
        mirroredQueue.printQueue();
    }
}
