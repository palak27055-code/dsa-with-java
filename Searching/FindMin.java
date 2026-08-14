package Searching;

public class FindMin {
    public static void main(String[] args) {
        int[] array = {34, 3, 52, 45, 32, 42, -8, 98};
        System.out.println(min(array));
    }

    static int min(int[] arr){
     int mini = arr[0];
     for(int i=0; i<arr.length; i++){
        if(arr[i] < mini){
            mini = arr[i];
        }
     }
     return mini;
    }
}
