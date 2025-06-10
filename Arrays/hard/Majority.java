 package Arrays.hard;
import java.util.*;
public class Majority {

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(N3(nums));
        System.out.println(N3BruteForce(nums));
    }
   public static List<Integer> N3BruteForce(int[] nums) {
    List<Integer> result = new ArrayList<>();
    int n = nums.length;

    for (int i = 0; i < n; i++) {
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (nums[i] == nums[j]) {
                count++;
            }
        }
        if (count > n / 3 && !result.contains(nums[i])) {
            result.add(nums[i]);
        }
    }

    return result;
}

   public static List<Integer> N3(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
       }
       ArrayList<Integer> list = new  ArrayList<Integer>();
       for (int num : nums) {
          if (map.get(num)>nums.length/3) {
            if (!list.contains(num)) {
                list.add(num);
            }
          }
       }
       return list;
    }
}