package Arrays;

public class Lab1 {

    public static boolean isMajority(int x, int[] arr) {
        int n = arr.length;
        int left = 0; 
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {//check law el x nafs el [mid]
               
                if (mid + n / 2 < n && arr[mid + arr.length / 2] == x) {
                    return true;
                } else {
                    return false;
                }
            }
            if (arr[mid] < x) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 3, 3, 3};
        int x = 3;
        boolean res = isMajority(x, a);
        System.out.println(res);  
    }


}
