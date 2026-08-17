package Linear_search;
// https://leetcode.com/problems/richest-customer-wealth/
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
        // store the maximum wealth
        int ans = Integer.MIN_VALUE; 

        // go through each account 
        for( int[] ints : accounts){

            // store the sum of each account
            int sum =0;

            // add each value of the account to the sum
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
