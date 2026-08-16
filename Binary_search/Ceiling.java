package Binary_search;

public class Ceiling {
    public static void main(String[] args) {
        int[] array = {-34, -23, -12, -1, 4, 8, 34, 56, 76};
        int target = 57;
        int ans = ceiling(array, target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}

