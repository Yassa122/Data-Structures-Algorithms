package Stacks;

import java.util.Stack;

public class letterDuplicates {

	
	public static String removeDuplicates(String s) {
		Stack<Object>st=new Stack<>();
		StackObj ste=new StackObj(s.length());
		for(int i=0;i<s.length();i++) {
			if(!st.isEmpty()&&s.charAt(i)==(char)st.peek()) {
				st.pop();
			}else {
				st.push(s.charAt(i));
			}
		}
		String result = "";
		while(!st.isEmpty())
		result = (char)st.pop() + result;
		System.out.println(result);
		return result;
		}
	
	public static void main(String[] args) {
		String s="abbaca";
		removeDuplicates(s);
	}
}
