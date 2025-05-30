package Arrays.Easy;
import java.util.*;
public class FindUnion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] nums = {1,2,3,6,7};
       int[] x = union(arr, nums);
       int[] y = common(arr, nums);
       System.out.println(Arrays.toString(x));
       System.out.println(Arrays.toString(y));
    }
    public static int[] union(int[] arr,int[] nums){
       HashSet<Integer> set = new HashSet<>();
       for (int i = 0; i < arr.length; i++) {
           set.add(arr[i]);
       }
       for (int i = 0; i < nums.length; i++) {
           set.add(nums[i]);
       }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }
    public static int[] common(int[] arr,int[] nums){
         HashSet<Integer> set = new HashSet<>();
         HashSet<Integer> set2 = new HashSet<>();
       for (int i = 0; i < arr.length; i++) {
           set.add(arr[i]);
       }
       for (int i = 0; i < nums.length; i++) {
             if (set.contains(nums[i])) {
                set2.add(nums[i]);
             }
       }
       int[] result = new int[set2.size()];
        int i = 0;
        for (int num : set2) {
            result[i++] = num;
        }
        return result;
    }
}
