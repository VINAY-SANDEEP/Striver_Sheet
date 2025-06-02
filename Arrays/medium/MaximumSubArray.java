package Arrays.medium;
import java.util.*;
public class MaximumSubArray {
    public static void main(String[] args) {
       int[] nums = {5,4,-1,7,8};
         System.out.println(maxArray(nums));
         System.out.println(optimal(nums));
    }
    public static int optimal(int[] nums) {
        int sum = 0;
        int max = 0;
       for (int i = 0; i < nums.length; i++) {
        sum+=nums[i];
        if (sum>max) {
            max = sum;
        }
        if(sum < 0){
            sum = 0;
        }
       }
       return max;
    }
    public static int maxArray(int[] nums){
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                sum+=nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
