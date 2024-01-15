package Stacks;

import LabAssignments.ArrayStack;

public class lab2 {

	public static boolean isPali(ArrayStack s) {
		ArrayStack s2= new ArrayStack(s.size()/2);
		int halfSize=s.size()/2;
		for(int i=0;i<halfSize;i++) {
			s2.push(s.pop());
		}
		while(!s.isEmpty()&&!s2.isEmpty()) {
			if(s.pop()!=s2.pop()) {
				return false;
			}
		}
		if(!s.isEmpty()&&!s2.isEmpty()) {
			return false;
		}
		
		s.printStack();
		return true;
		
	}
		public static void main(String[] args) {
	        ArrayStack s = new ArrayStack(6);
	        s.push(3);
	        s.push(2);
	        s.push(1);
	        s.push(3);
	        s.push(2);
	        s.push(3);
	        
	        System.out.println(isPali(s));
	        s.printStack();
		}
}
