package Stacks;

public class repeatedLetters {

	public static boolean isRepeated(String s) {
		for(int i=0;i<s.length()-1;i++) {
			char c=s.charAt(i+1);
			for(int j=i+1;j<s.length();j++) {
				if(c==s.charAt(j)) {
					return true;
				}else {
					return false;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		String s="abbca";
		
		System.out.println(isRepeated(s));
	}
	
	
	
}
