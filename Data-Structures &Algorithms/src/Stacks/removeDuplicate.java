package Stacks;

public class removeDuplicate {

	public static StackObj removeDuplicates(String s) {
		StackObj s2= new StackObj(s.length());
		for(int i=0;i<s.length();i++) {
			char c= s.charAt(i);
					
				
		}

		s2.printStack();
		return s2;
	}
	
	public static void main(String[] args) {
		String s= "abbaaz";
		System.out.println(s);
		System.out.println(removeDuplicates(s));
	}
}
