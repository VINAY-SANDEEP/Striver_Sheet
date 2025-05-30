package Arrays.Easy;

import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int x = single(nums);
        int y = optimal(nums);
        System.out.println(x);
        System.out.println(y);
    }
    public static int optimal(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], map.getOrDefault(nums[i],0)+1);
       }
       for (int num : nums) {
        if (map.get(num)==1) {
            return num;
        }
       }
       return -1;
    }
    private static int single(int[] nums) {
        int result = 0;
       for (int i = 0; i < nums.length; i++) {
            result=result^nums[i];
       }
       return result;
    }
}
