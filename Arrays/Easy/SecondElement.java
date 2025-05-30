package Arrays.Easy;
import java.util.*;
public class SecondElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Second(arr));
    }
    public static int Second(int[] nums){
        int max = 0;
        int second = 0;
          for (int i = 0; i < nums.length; i++) {
            if (nums[i]>max) {
                second = max;
                max = nums[i];
            }
            if (nums[i] > second && nums[i] < max) {
                second = nums[i];
            }
          }
          return second;
    }
}
