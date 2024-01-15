package midtermQuestions;

public class delete {

	public static int remove(String s) {
		StackObj s1 = new StackObj(s.length());
		StackObj s2 = new StackObj(s.length());
		StackObj removed = new StackObj(s.length());

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			s1.push(c);
		}
		s1.printStack();
		while (!s1.isEmpty()) {
			if (s1.top() == (Character) 'd' || s1.top() == (Character) 'b') {
				s2.push(s1.pop());
				if (!s1.isEmpty() &&s1.top() == (Character) 'a' || s1.top() == (Character) 'c') {
					removed.push(s2.pop());
					s2.push(s1.pop());
				}
			} else {
				s2.push(s1.pop());
			}
		}
		
		return s2.size();
	}
	
	public static void main(String[] args) {
		String s="absecde";
		System.out.println(remove(s));
	}
}
