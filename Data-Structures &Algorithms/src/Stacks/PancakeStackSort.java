package Stacks;

public class PancakeStackSort {
    
    

    public static void pancakeSort(ArrayStack pancakes) {
        ArrayStack helper = new ArrayStack(pancakes.size());

        for (int size = pancakes.size(); pancakes.isEmpty();size--) {
            int maxIndex = findMax(pancakes, size);
            if (maxIndex == size ) {
                transfer(pancakes, helper, maxIndex+1);
                transfer(helper, pancakes, maxIndex+ 1);
                transfer(pancakes, helper, size);
                transfer(helper, pancakes, size);
            }
        }
    }

    public static int findMax(ArrayStack stack, int n) {
        int maxIdx = 0;
        int maxVal = Integer.MIN_VALUE;
        ArrayStack temp = new ArrayStack(n);
        
        for (int i=0;i<n;i++) {
            int current =stack.pop();
            temp.push(current);
            if (current>maxVal) {
                maxVal = current;
                maxIdx = i;
            }
        }

        for (int i = 0; i < n; i++) {
            stack.push(temp.pop());
        }

        return maxIdx;
    }

    public static void transfer(ArrayStack s, ArrayStack t, int n) {
        for (int i = 0; i < n; i++) {
            t.push(s.pop());
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {23, 10, 20, 11, 12, 6, 7};
        ArrayStack pancakes = new ArrayStack(arr.length);
        for (int value=0;value<arr.length;value++) {
            pancakes.push(value);
        }
        pancakeSort(pancakes);
        pancakes.printStack();
    }
}
  


