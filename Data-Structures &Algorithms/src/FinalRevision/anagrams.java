package FinalRevision;

public class anagrams {
	public static boolean anagrams(String a, String b) {

		QueueObj q1= new QueueObj(a.length());
		QueueObj q2 = new QueueObj(b.length());
		QueueObj res = new QueueObj(b.length());

		
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);

			q1.enqueue(c);
		}
		for(int i=0;i<b.length();i++) {
			char c=b.charAt(i);

			q2.enqueue(c);
		}
		if(q1.size()!=q2.size()) {
			return false;
		}
		while(!q2.isEmpty()) {
			if(q1.peek()==q2.peek()) {
				res.enqueue(q2.dequeue());
			}else {
				q1.enqueue(q1.dequeue());
			}
			
			
		}
		if(!q2.isEmpty()) {
			return false;
		}
	
		return q2.isEmpty();
	}
	
	public static void main(String[] args) {
		String a= "post";
		String b="sdop";
		
		System.out.println(anagrams(a, b));
	}

}
