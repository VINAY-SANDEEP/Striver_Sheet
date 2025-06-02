package Arrays.medium;

import java.util.Arrays;

public class RearrangeBySign {
    public static void main(String[] args) {
       int[] nums = {3,1,-2,-5,2,-4};
      int[] x = ReArrange(nums);
       System.out.println(Arrays.toString(x));
    }
    public static int[] ReArrange(int[] nums){
         int pos = 0;
         int neg = 1;
         int[] temp = new int[nums.length];
         for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0) {
                temp[pos] = nums[i];
                pos+=2;
            }else{
                 temp[neg] = nums[i];
                neg+=2;
            }
         }
         return temp;
    }
}
