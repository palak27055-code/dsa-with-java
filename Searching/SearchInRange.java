package Searching;

public class SearchInRange {
    public static void main(String[] args) {
        
        int[] nums = {76, 85, 83, 28, 29, 24, 95, 56, 87};
        int result = linearSe(nums, 83, 2, 6);
        System.out.println(result);
    }
    // searching in range-->
    static int linearSe(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i < end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
