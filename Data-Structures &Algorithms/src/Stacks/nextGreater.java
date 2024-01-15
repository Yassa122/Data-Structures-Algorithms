package Stacks;

import java.util.Stack;

public class nextGreater {
    public static int[] nextGreat(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer>s  = new Stack<>();
        
        for (int i = 0; i < nums.length; i++) {
            result[i] = -1;
        }

        for (int i = 0; i < nums.length; i++) {
            while (!s.isEmpty() && nums[i] > nums[s.peek ()]) {
                int idx = s.pop();
                result[idx] = nums[i];
            }
            s.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 1, 5};
        int[] result = nextGreat(arr);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
