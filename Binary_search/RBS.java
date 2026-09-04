package Binary_search;
// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class RBS {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2, 3};
        int ans = search(nums, 2);
        System.out.println(ans);
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        //if you did not find pivot , it means the array is not rotated
        if(pivot == -1){
            // do normal binary search
            return binary(arr, target, 0, arr.length-1);
        }
        if(arr[pivot] == target){
            //you found pivot
            return pivot;
        }if(arr[0] < target){
           return binary(arr, target, 0, pivot-1);
        }
        return binary(arr, target, pivot+1, arr.length-1);
        
    }

    static int binary(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
