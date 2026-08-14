package Searching;

public class EvenDigits {
   public static void main(String[] args) {
    int[] arr = {23, 643, 7533, 744, 234, 11};
    System.out.println(findNumbers(arr));
   }
  // function to find number of even digits in array ->
   static int findNumbers(int[] arr){
    int count = 0;
      for(int num : arr){
        if(even(num)){
            count++;
        }
      }
      return count;
   }
   // function to check number contain even number of digits ->
   static boolean even(int num){
    int numberOfDigits = digits(num);
    if(numberOfDigits % 2==0){
        return true;
    }
    return false;
   }

   // count number of digits-->
   static int digits(int num){
    int count = 0;
    while (num>0) {
       count++;
       num = num/10;
    }
    return count;
   }

}

