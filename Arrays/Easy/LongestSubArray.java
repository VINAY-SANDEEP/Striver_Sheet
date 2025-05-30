package Arrays.Easy;

public class LongestSubArray {
   public static void main(String[] args) {
       int[] nums = {10, 5, 2, 7, 1, 9};
       int k=15;
        System.out.println(Maxsub(nums,k));
        System.out.println(optimal(nums,k));
   }
   public static int Maxsub(int[] nums, int k) {
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
        int sum = 0;
        for (int j = i; j < nums.length; j++) {
            sum+=nums[j];
            if (sum==k) {
                max = Math.max(max, j-i+1);
            }
        }
    }
    return max;
   }  
   public static int optimal(int[] nums,int k){
    int max = 0;
    int sum = 0;
    int l = 0;
    for (int i = 0; i < nums.length; i++) {
        sum+=nums[i];
        while (sum>=k) {
            if (sum==k) {
                max = Math.max(max, i-l+1);
            }
            sum-=nums[l];
            l++;
        }
    }
    return max;
   }
}
