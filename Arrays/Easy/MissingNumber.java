package Arrays.Easy;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1,3};
        System.out.println(missing(arr));
    }
    public static int missing(int[] arr) {
      int n = arr.length;
      int sum =  (n*(n+1))/2;
      int total = 0;
      for (int i = 0; i < arr.length; i++) {
        total+=arr[i];
      }
      return sum-total;
    }
}
