package BinarySearch.Easy;

public class posandneg {
    public static void main(String[] args) {
        int[] nums = {-3,-2,-2,0,1,2,3,4};
         System.out.println(maxmium(nums));
    }
    public static int maxmium(int[] nums){
       int pos = search(nums, 0);
       int neg = search(nums, 1);
       return Math.max(pos, neg);
    }
    public static int search(int[] nums,int target){
          int start = 0;
     int end = nums.length-1;
     int ans = nums.length;
     while (start<=end) {
        int mid = start + (end-start)/2;
        if (nums[mid]>=target) {
            ans=mid;
            end = mid-1;
        }
        else{
            start = mid+1;
        }
     }
     return ans;
    }
}
