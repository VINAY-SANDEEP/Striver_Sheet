package Arrays.medium;
import java.util.*;
public class Majority {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(bruteforce(nums));
        System.out.println(optimal(nums));
        
        
    }
    public static int optimal(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
       }
       for(int num : map.keySet()){
        if (map.get(num)>nums.length/2) {
            return num;
        }
       }
       return -1;
    }
    private static int bruteforce(int[] nums) {
       Arrays.sort(nums);
       return nums[nums.length/2];
    }

}
