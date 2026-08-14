package Searching;
import java.util.*;
import java.lang.reflect.Array;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {31, 43, 55},
            {81, 50, 98, 87},
            {21, 23, 54, 62},
            {11, 40, 82},
        };
        int target = 54;
        int[] ans = search(arr, target);  // format of ans = {row, col}
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]== target){
                   return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
