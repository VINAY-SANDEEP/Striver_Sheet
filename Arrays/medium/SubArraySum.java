package Arrays.medium;

import java.util.HashMap;

public class SubArraySum {
    public static void main(String[] args) {
       int[] nums = {1,2,3};
       int k = 3;
       System.out.println(MaximumSubArray(nums, k));
    }
    public static int MaximumSubArray(int[] nums,int k){
       int c = 0;
       for (int i = 0; i < nums.length; i++) {
        int sum = 0;
        for (int j = i; j < nums.length; j++) {
            sum+=nums[j];
            if (sum==k) {
                c++;
            }
        }
       }
       return c;
    }
    public static int optimal(int[] nums,int k){
         HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int prefixSum = 0;
        map.put(0, 1);
        for (int i = 0 ; i < nums.length ; i++) {
            prefixSum += nums[i];
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
