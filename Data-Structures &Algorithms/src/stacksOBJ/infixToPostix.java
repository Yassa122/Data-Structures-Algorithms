package stacksOBJ;

import java.util.Stack;

import Stacks.stack;

public class infixToPostix {
	
	public static int getPriority(char c) {
		if(c=='*') {
			return 1;
		}else if(c=='+'){
			return 2;
		}else {
			return 3;
		}
	}
	
	public static String infixToPostfix(String s) {
		Stack<Object>st=new Stack<>();
		String postfix="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='0'&&c<='9') {
				s+=c;
			}else {
				if(st.isEmpty()) {
					st.push(c);
				}else {
					int p=getPriority(c);
					int f=getPriority((char)st.peek());
					while(f<=p) {
						s+=st.pop();
						
					}
				}
			}
		}
		return postfix;
	}
}
