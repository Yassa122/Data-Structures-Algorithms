package Stacks;

public class nearestGreater {
    
    public static int[] nearestGreater(int[] arr) {
        int[] result = new int[arr.length];
        ArrayStack s = new ArrayStack(arr.length);
        
        for (int i = 0; i < arr.length; i++) {
            // Pop elements from the stack while the current element is greater
            while (!s.isEmpty() && (int) s.top() <= arr[i]) {
                s.pop();
            }
            
            // If stack is empty, no greater element to the left
            // Otherwise, top of the stack is the nearest greater element to the left
            result[i] = s.isEmpty() ? -1 : (int) s.top();
            
            // Push the current element onto the stack
            s.push(arr[i]);
        }
        
        return result;
    }
    
    // Test the method
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] result = nearestGreater(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
