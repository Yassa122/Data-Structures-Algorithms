package midtermQuestions;

public class circ {

	public static int circ(QueueObj q,StackObj s ) {
		if(q.size()!=s.size()) {
			return 0;
		}
		while(q.peek()==s.top()) {
			s.pop();
			q.dequeue();
			
			if(q.peek()!=s.top()) {
				q.enqueue(q.dequeue());
			}
		}
		return q.size();
	}
	
	public static void main(String[] args) {
		QueueObj q=new QueueObj(4);
		StackObj s= new StackObj(4);
		
		q.enqueue(1);
		q.enqueue(0);
		q.enqueue(0);
		q.enqueue(0);
		
		s.push(0);
		s.push(1);
		s.push(0);
		s.push(1);
		
		System.out.println(circ(q, s));
	}
}
