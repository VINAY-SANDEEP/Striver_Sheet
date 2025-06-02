package Arrays.medium;

import java.util.Arrays;
import java.util.HashMap;

public class SortArrays {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sort(nums);
        optimal(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void optimal(int[] nums) {
       int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private static void sort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }
        int index = 0;
        for (int i = 0; i <= 2; i++) {
            int count = map.getOrDefault(i,0);
            for (int j = 0; j < count; j++) {
                nums[index++] = i;
            }
        }
    }
}
