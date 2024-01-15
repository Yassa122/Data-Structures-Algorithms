package Stacks;

public class validateParenth {

    public static boolean validate(String s) {
        ArrayStack stack = new ArrayStack (s.length());
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }

                char top = (char) stack.pop();
                if(c == '}' && top != '{') {
                    return false;
                } else if(c == ')' && top != '(') {
                    return false;
                } else if(c == ']' && top != '[') {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        String s = "{}[]{";
        System.out.println(validate(s));
    }
}
