package LabAssignments;

public class T8_7000313_Lab2 {

    public static boolean isPalindrome(ArrayStack s) {
        ArrayStack firstHalf = new ArrayStack(s.size()/2);
          
        int halfSize =s.size()/ 2;
        for (int i =0;i <halfSize; i++) {
            firstHalf.push(s.pop());
        }
        while (!firstHalf.isEmpty() && !s.isEmpty()) {
            if (firstHalf.top()!=s.top()) { 
                return false;
            }
            firstHalf.pop();
            s.pop();
        }
        
        return true;
    }

    public static void main(String[] args) {
        ArrayStack s = new ArrayStack(7);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(0);
        s.push(3);
        s.push(2);
        s.push(1);
     
        if (isPalindrome(s)) {
            System.out.println("The sequence is a palindrome.");
        } else {
            System.out.println("The sequence is not a palindrome.");
        }
    }
}
