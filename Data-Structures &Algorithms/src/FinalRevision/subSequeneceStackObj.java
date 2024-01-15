package FinalRevision;

public class subSequeneceStackObj {

	public static boolean isSubSeq(String s, String target) {

		StackObj s1 = new StackObj(s.length());
		StackObj t1 = new StackObj(target.length());

		for (int i = 0; i < s.length(); i++) {
			s1.push(s.charAt(i));
		}
		for (int i = 0; i < target.length(); i++) {
			t1.push(target.charAt(i));

		}

		while (!s1.isEmpty()) {
			if (s1.top().equals(t1.top())) {
				s1.pop();
				t1.pop();
			} else {
				s1.pop();
			}
		}

		return t1.isEmpty();

	}

	public static void main(String[] args) {
		String s = "DATASTRUCTURES";
		String target = "STRT";
		System.out.println(s);
		System.out.println(target);
		System.out.println(isSubSeq(s, target));

	}
}
