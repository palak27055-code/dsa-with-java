package Linear_search;

public class EvenDigits {
   public static void main(String[] args) {
      int[] arr = { 23, 643, 7533, 744, 234, 11, -22, -234, -2345, 0 };
      System.out.println(findNumbers(arr));
   }

   // function to find number of even digits in array ->
   static int findNumbers(int[] arr) {
      int count = 0;
      for (int num : arr) {
         if (even(num)) {
            count++;
         }
      }
      return count;
   }

   // function to check number contain even number of digits ->
   static boolean even(int num) {
      if (num < 0) {
         num = num * -1;
      }
      int numberOfDigits = digits2(num);
      if (numberOfDigits % 2 == 0) {
         return true;
      }
      return false;
   }

   // count number of digits-->
   static int digits(int num) {
      if (num < 0) {
         num = num * -1;
      }
      int count = 0;
      while (num > 0) {
         count++;
         num = num / 10;
      }
      return count;
   }
   // count number of digits using log10 function -->
   static int digits2(int num) {
      if (num < 0) {
         num = num * -1;
      }
      return (int) (Math.log10(num) + 1);
   }

}
