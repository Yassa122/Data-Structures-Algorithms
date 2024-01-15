package FinalRevision;


public class pancakeStackSorting {

	public static ArrayStack pancakeSort(ArrayStack s1) {
		ArrayStack s2 = new ArrayStack(s1.size());
		ArrayStack s3 = new ArrayStack(s1.size());

		s2.push(s1.pop());

		while (!s1.isEmpty()) {
			if (s1.top() > s2.top()) {
				s3.push(s2.pop());
				s2.push(s1.pop());
			}else {
				s2.push(s1.pop());

			}
		}

		while (!s3.isEmpty()) {
			s2.push(s3.pop());
		}

		s2.printStack();
		return s2;
	}
	
//	public static int findamx(ArrayStack s1) {
//		
//	}
//	
	public static void main(String[] args) {
		ArrayStack s1= new ArrayStack(5);
		
		s1.push(1);
		s1.push(4);
		s1.push(3);
		s1.push(2);
		s1.push(5);
		
		s1.printStack();
		System.out.println("///");
		
		pancakeSort(s1);




	}
}
