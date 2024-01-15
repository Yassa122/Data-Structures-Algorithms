package Queues;

import java.util.Stack;

public class sandwichCount {

	public static int count(QueueObj q,Stack<Integer>s) {
		int count=0;
		boolean flag=false;;
		while(!q.isEmpty()) {
			if(q.peek()==s.peek()) {
				q.dequeue();
				s.pop();
				flag=true;
			}else {
				q.enqueue(q.dequeue());
				flag=false;
				count++;
			}
			break;
		}
		
		
		return count;
	}
	public static void main(String[] args) {
		QueueObj q= new QueueObj(5);
		Stack<Integer>s=new Stack<Integer>();
		q.enqueue(1);
		q.enqueue(0);
		q.enqueue(0);
		q.enqueue(1);
		q.enqueue(0);
		s.push(1);
		s.push(0);
		s.push(0);
		s.push(1);
		s.push(0);
		q.printQueue();
		System.out.println(count(q, s));
	}
}
