package Stacks;
import java.util.Stack;

public class sortingStacks {
	public static Stack<Integer> Sort(Stack<Integer> in){
		Stack<Integer>s1=new Stack<Integer>();

		while(!in.isEmpty()) {
		while(!s1.isEmpty()&&s1.peek()>in.pop()) {
			in.push(s1.pop());
		}
 		
		}
		while(!s1.isEmpty()) {
			s1.push(in.pop());
		}
		return in;
	}
	public static void main(String[] args) {
		Stack<Integer>in=new Stack<Integer>();
		in.push(5);
		in.push(3);
		in.push(2);
		in.push(1);
		in.push(4);
		
		System.out.println(Sort(in));
	}
}
