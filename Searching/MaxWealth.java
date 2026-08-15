package Searching;
import java.util.*;
public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
            {3, 4, 5},
            {5, 6, 6},
            {3, 5, 2}
        };
        System.out.println(maximumwealth(accounts));
        
    }
    static int maximumwealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for( int[] ints : accounts){
            int sum =0;
            for(int anInt : ints){
                sum += anInt;
            }
        if(sum>ans){
            ans = sum;
        }
    }
        return ans;
    
    }
}
