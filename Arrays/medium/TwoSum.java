package Arrays.medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
       int[] nums = {2,7,11,15};
         int target = 9;
         int[] x = better(nums, target);
         int[] y = twoSum(nums, target);
         System.out.println(Arrays.toString(x));
         System.out.println(Arrays.toString(y));
    }
   public static int[] better(int[] nums,int target){
    for (int i = 0; i < nums.length; i++) {
        for (int j = i; j < nums.length; j++) {
            if (nums[i]+nums[j]==target) {
                return new int[] {i,j};
            }
        }
    }
    return new int[] {-1,-1};
   }
    public static int[] twoSum(int[] arr, int target) {
          HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            map.put(arr[i],i);
        }
        for(int i = 0 ; i < arr.length ; i++){
             int sum = target-arr[i];
             if(map.containsKey(sum) && map.get(sum) != i){
                return new int[]{i, map.get(sum)};
             }
        }
        return new int[] {};
    }
}
