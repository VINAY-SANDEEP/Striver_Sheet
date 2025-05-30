package Arrays.Easy;

public class maximumOnes {
    public static void main(String[] args) {
       int[] nums = {1,1,0,1,1,1};
        System.out.println(ones(nums));
    }
    public static int ones(int[] nums) {
        int c = 0;
        int max = 0;
       for (int i = 0; i < nums.length; i++) {
        if (nums[i]==1) {
            c++;
            max = Math.max(max, c);
        }else{
            c = 0;
        }
       }
       return max;
    }
}
