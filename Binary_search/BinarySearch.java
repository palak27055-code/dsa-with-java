package Binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {-34, -23, -12, -1, 4, 8, 34, 56, 76};
        int target = 7;
        int ans = binary(array, target);
        System.out.println(ans);
    }

    static int binary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
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
        return -1;
    }
}
