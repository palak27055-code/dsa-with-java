package Binary_search;

// https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountain {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 9, 7, 3, 1};
        int ans = search(array, 1);
        System.out.println(ans);
    }


    static int search(int[] arr, int target){
        int peak = peakIndexInMountain(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1){
           return firstTry;
        }
        // try to search second half-->
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }

    static int peakIndexInMountain(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){    
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start; // or end
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid-1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
        
    }
}
