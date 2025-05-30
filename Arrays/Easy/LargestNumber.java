package Arrays.Easy;
import java.util.*;
public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int num = helper(arr);
        System.out.println(num);
    }
    public static int helper(int[] nums){
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max) {
               max = nums[i];
            }
        }
        return max;
    }
}
