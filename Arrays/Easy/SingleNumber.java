package Arrays.Easy;

import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int x = single(nums);
        int y = optimal(nums);
        int z = binary(nums);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    private static int binary(int[] nums) {
        if (nums.length==1) {
            return nums[0];
        }
        if (nums[0]!=nums[1]) {
            return nums[0];
        }
        if (nums[nums.length-1]!=nums[nums.length-2]) {
            return nums[nums.length-1];
        }
        int low = 1;
        int high = nums.length-2;
        while (low<=high) {
            int mid = low + (high-low)/2;
            if (nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]) {
                return nums[mid];
            }else if ((mid%2==1 && nums[mid]==nums[mid-1]) || (mid%2==0 && nums[mid]==nums[mid+1])) {
                 low = mid+1;   
            }else{
                high = mid-1;
            }
        }
        return -1;
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
