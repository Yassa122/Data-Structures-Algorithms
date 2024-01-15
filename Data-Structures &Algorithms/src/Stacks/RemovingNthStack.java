package Stacks;

public class RemovingNthStack {
	public static void removeNth(ArrayStack s,int n) {
		int size=s.size();
		ArrayStack tmp=new ArrayStack(size);
		for (int i=0;i<size-n;i++)
			tmp.push(s.pop());
		if (!s.isEmpty())
			s.pop();
		while(!tmp.isEmpty())
			s.push(tmp.pop());
	}

	public static void main(String[] args) {
		ArrayStack s=new ArrayStack(5);
		s.push(1);
		s.push(3);
		s.push(10);
		s.push(5);
		s.push(6);
		s.printStack();
		removeNth(s,3); 
	}
}