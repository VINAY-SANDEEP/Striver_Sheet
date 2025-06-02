package Arrays.medium;
import java.util.*;
public class Leaders {
    public static void main(String[] args) {
         int[] nums = {1, 2, 5, 3, 1, 2};
           System.out.println(leaders(nums));
    }
    public static ArrayList<Integer> leaders(int[] nums){
       ArrayList<Integer> list = new ArrayList<>();
       int max = nums[nums.length-1];
       list.add(max);
       for (int i = nums.length-2; i >= 0; i--) {
            if (nums[i]>max) {
                max = nums[i];
                list.add(max);
            }
       }
      Collections.reverse(list);
        return list;
    }
}
