package Binary_search;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class Letters{
    public static void main(String[] args) {
        char[] array = {'c', 'f', 'j'};
        char target = 'a';
        char ans = letter(array, target);
        System.out.println(ans);
    }

    static char letter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else{
                start = mid +1;
            }
        }
        return arr[start % arr.length];
    }
}



