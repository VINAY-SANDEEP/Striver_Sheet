package Arrays.Easy;

public class Sortedandrotate {
    public static void main(String[] args) {
       int[] nums = {3,4,5,1,2};
       System.out.println(check(nums));
    }
    private static boolean check(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>nums[(i+1)%nums.length]) {
                c++;
                if (c>1) {
                    return false;
                }
            }
        }
        return true;
    }
    
}
