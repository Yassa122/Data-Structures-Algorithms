package midtermQuestions;

public class BinaryQueues {

    public static QueueObj transformBinary(String s) {
        QueueObj queue = new QueueObj(s.length());

        for (int i = 0; i < s.length(); i++) {
            queue.enqueue(s.charAt(i));
        }

        while (queue.size() >= 3) {
            if (queue.peek().equals('0')) {
                queue.dequeue();
                queue.dequeue();
                queue.dequeue();
                queue.enqueue('1');
                queue.enqueue('0');
                queue.enqueue('0');
            } else if (queue.peek().equals('1')) {
                Object c1 = queue.dequeue();
                Object c2 = queue.dequeue();
                Object c3 = queue.dequeue();
                queue.enqueue(c1);
                queue.enqueue(c2);
                queue.enqueue(c3);
            }
        }

        return queue;
    }

    public static void main(String[] args) {
        String binaryString = "01010";
        QueueObj result = transformBinary(binaryString);
        result.printQueue(); // Example usage
    }
}
