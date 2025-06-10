package BinarySearch.Easy;

import java.util.Arrays;

public class LowerandUpper {
    public static void main(String[] args) {
       int[] arr ={3, 4, 4, 7, 8, 10};
       int target = 8;
       int[] answer = getFloorAndCeil(arr, target);
       System.out.println(Arrays.toString(answer));
    }
    public static int[] getFloorAndCeil(int[] nums, int target) {
         int x = ceil(nums, target);
         int y = floor(nums, target);
       return new int[]{y,x};
   }
   public static int ceil(int[] nums,int target){
    int low = 0;
    int high = nums.length-1;
    int ans = nums.length;
    while (low<=high) {
        int mid = low +(high-low)/2;
        if (nums[mid]>=target) {
            ans = nums[mid];
            high = mid-1;
        }
        else{
          low = mid+1;
        }
    }
    return ans;
   }
   public static int floor(int[] nums,int target){
    int low = 0;
    int high = nums.length-1;
    int ans = nums.length;
    while (low<=high) {
        int mid = low +(high-low)/2;
        if (nums[mid]<=target) {
            ans = nums[mid];
            low = mid+1;
        }
        else{
           high = mid-1;
        }
    }
    return ans;
   }
}
