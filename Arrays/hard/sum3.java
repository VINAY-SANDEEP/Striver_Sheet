 package Arrays.hard;

import java.util.*;
public class sum3 {
    public static void main(String[] args) {
       int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(sumbruteforce3(nums));
    }

    private static List<List<Integer>> sumbruteforce3(int[] nums) {
       HashSet<List<Integer>> set = new HashSet<>();
       for (int i = 0; i < nums.length; i++) {
         HashSet<Integer> seen = new HashSet<>(); 
           for (int j = i + 1; j < nums.length; j++) {
             int three = -(nums[i]+nums[j]);
                    if (seen.contains(three)) {
                List<Integer> triplet = Arrays.asList(nums[i], nums[j], three);
                        Collections.sort(triplet); 
                        set.add(triplet);
                    }
                    seen.add(nums[j]);
             }
           }
       return new ArrayList<>(set);
    }
}
