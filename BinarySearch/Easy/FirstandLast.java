package BinarySearch.Easy;

public class FirstandLast {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
         int target = 8;
         isPossible(nums,target);
         isPossible1(nums, target);
    }

    private static void isPossible(int[] nums, int target) {
       int low = 0;
       int high = nums.length-1;
       int first = -1;
       while (low<=high) {
        int mid = low + (high-low)/2;
        if (nums[mid]==target) {
            first = mid;
            high = mid-1;
        }
        else if (nums[mid]>target) {
            high=mid-1;
        }else{
            low = mid+1;
        }
       }
       System.out.println(first);
    }
    private static void isPossible1(int[] nums, int target) {
       int low = 0;
       int high = nums.length-1;
       int first = -1;
       while (low<=high) {
        int mid = low + (high-low)/2;
        if (nums[mid]==target) {
            first = mid;
            low = mid+1;
        }
        else if (nums[mid]>target) {
            high=mid-1;
        }else{
            low = mid+1;
        }
       }
       System.out.println(first);
    }
}
