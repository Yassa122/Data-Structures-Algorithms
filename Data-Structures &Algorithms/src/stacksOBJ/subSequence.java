package stacksOBJ;

import java.util.Stack;

public class subSequence {

	public static boolean check(String s, String t) {
		Stack <Character> stack= new Stack<>();
		for(int i=0;i<s.length();i++) {
			stack.push(t.charAt(i));
		}
		for(int i=s.length()-1;i>=0;i--) {
			if(stack.isEmpty()) {
				return true;
			}
			if(s.charAt(i)==stack.peek()) {
				stack.pop();
			}
		}
		if(stack.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
}
