package Queues;

public class Anagrams {
	
	public static boolean isAnagram(String s1,String s2) {
		QueueObj q1=new QueueObj(s1.length());
		QueueObj q2=new QueueObj(s2.length());
		
		for(int i=0;i<s1.length();i++) {
			char c1= s1.charAt(i);
			q1.enqueue(c1);
		}
		for(int i=0;i<s2.length();i++) {
			char c2= s2.charAt(i);
			q2.enqueue(c2);
		}
		
		while(!q1.isEmpty()) {
			if(q1.peek()==q2.peek()) {
				q1.dequeue();
				q2.dequeue();
			}else {
				q1.enqueue(q1.dequeue());
			}		
		}
		

		return q1.isEmpty();
	}
	public static void main(String[] args) {
		String s1= "stop";
		String s2="pest";
		
		System.out.println(isAnagram(s1, s2));;
	}

}
