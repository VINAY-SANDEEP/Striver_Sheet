import java.util.*;
public class lConsecutive{
    public static void main(String[] args){
       int[] nums = {1,2,3};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
         Arrays.sort(nums);
      int max = Integer.MIN_VALUE;
      int c = 1;
      for (int i = 1; i < nums.length; i++) {
         if (nums[i]==nums[i-1]) {
            continue;
         }
         if (nums[i]==nums[i-1]+1) {
            c++;
         }else{
          c=1;
         }
         max = Math.max(max, c);
      }
      return max;
    }
}