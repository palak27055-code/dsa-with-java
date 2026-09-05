package Binary_search;

public class CountRBS {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2, 3};
        int count = countOccurences(nums);
        System.out.println("Number of rotations: " + count);
    }

    private static int countOccurences(int[] arr){
        int pivot = findPivot(arr);
        return pivot + 1;
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

   
        
        
            


    }



