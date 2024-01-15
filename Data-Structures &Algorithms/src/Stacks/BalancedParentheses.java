package Stacks;

public class BalancedParentheses {

	public static boolean isBalanced(String s) {
		ArrayStack s1=new ArrayStack(s.length());
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='(') {
				s1.push(c);
				
			}else if (c==')') {
				if(s1.isEmpty()) {
					return false;
				}
				s1.pop();
			}
			
		}
		return s1.isEmpty();

	}
	
	public static void main(String[] args) {
        String test1 = "((()))";
        String test2 = "(()";
        String test3 = "())";
        String test4 = "(()())";

        System.out.println(isBalanced(test1)); // true
        System.out.println(isBalanced(test2)); // false
        System.out.println(isBalanced(test3)); // false
        System.out.println(isBalanced(test4)); // true
    }

}
