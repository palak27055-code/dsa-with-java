package Searching;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {76, 85, 83, 28, 29, 24, 95, 56, 87};
        int result = linearSe(nums, 83);
        System.out.println(result);
    }

    // searching an element in the array: return the index of the element if found, otherwise return -1
    static int linearSe(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}