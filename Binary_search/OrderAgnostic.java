package Binary_search;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] array = { 34, 23, 12, 1, -4, -8, -34, -56, -76 };
        int target = 23;
        int ans = orderAgnostic(array, target);
        System.out.println(ans);
    }

    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        // find whether array is sorted or not--
        boolean isasc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isasc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                 if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
