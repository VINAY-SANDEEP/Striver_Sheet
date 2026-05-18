import java.util.*;
public class TwoSum{
    public static void main(String[] args){
       int[] nums = {7,1,5,3,6,4};
        System.out.println(fun(nums));
    }
    public static int fun(int[] nums){
        int ans = nums[0];
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < nums.length ; i++){
            int profit = nums[i]-ans;
            max = Math.max(max,profit);
            ans = Math.min(ans,nums[i]);
        }
        return max;
    }
}