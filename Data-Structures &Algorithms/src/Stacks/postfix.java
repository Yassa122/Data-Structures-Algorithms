package Stacks;

public class postfix {

	public static String infixToPostfix(String s) {
		ArrayStack s1=new ArrayStack(s.length());
		String result=new String();
		ArrayStack o=new ArrayStack(s.length());
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='-') {
				s1.pop();
				o.push(c);
			}else if(c=='+') {
				s1.pop();
				o.push(c);
			}else if(c=='*') {
				s1.pop();
				o.push(c);
			}else {
				s1.push(c);
			}
			
		}
		return result;
	}
}
