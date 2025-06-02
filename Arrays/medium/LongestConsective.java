package Arrays.medium;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsective {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(consecative(nums));
        System.out.println(longestConsecutiveBrute(nums));
        System.out.println(longestConsecutiveOptimal(nums));
    }
    public static int consecative(int[] nums){
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
    public static int longestConsecutiveBrute(int[] nums) {
    int longest = 0;
    for (int i = 0; i < nums.length; i++) {
        int current = nums[i];
        int count = 1;

        // Check for next consecutive numbers
        while (contains(nums, current + 1)) {
            current++;
            count++;
        }

        longest = Math.max(longest, count);
    }
    return longest;
}

private static boolean contains(int[] nums, int target) {
    for (int num : nums) {
        if (num == target) return true;
    }
    return false;
}

public static int longestConsecutiveOptimal(int[] nums) {
    if (nums.length == 0) return 0;
    HashSet<Integer> set = new HashSet<>();
    for (int num : nums) {
        set.add(num);
    }
    int maxLen = 0;

    for (int num : set) {
        if (!set.contains(num - 1)) { 
            int currentNum = num;
            int count = 1;
            while (set.contains(currentNum + 1)) {
                currentNum++;
                count++;
            }

            maxLen = Math.max(maxLen, count);
        }
    }
    return maxLen;
}

}
