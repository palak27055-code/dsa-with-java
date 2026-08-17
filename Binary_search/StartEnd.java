package Binary_search;
import java.sql.Array;
import java.util.*;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class StartEnd {
    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 8, 8, 8, 9, 21, 22};
        System.out.println(Arrays.toString(searchRange(arr, 8)));
        
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        int first = search(nums, target, true);
        int last = search(nums, target, false);
     
        ans[0] = first;
        ans[1] = last;
 
        return ans;
    }   

    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;

        int start = 0;   
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid-1;
            }
            else if(target > nums[mid]){
                start = mid +1;
            }
            else{
               ans = mid;
               if(findStartIndex){
                end = mid -1; 
               }else{
                start = mid +1;
               }
            }
        }
        return ans;
    }
}
