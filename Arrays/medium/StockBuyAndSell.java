package Arrays.medium;

public class StockBuyAndSell {
    public static void main(String[] args) {
    int[]  nums = {7,1,5,3,6,4};
       System.out.println(bruteForce(nums));
       System.out.println(optimal(nums));
    }
    public static int bruteForce(int[] nums){
       int max = 0;
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) { 
            int profit = nums[j] - nums[i];
            max = Math.max(max, profit);
        }
    }
    return max;
    }
    public static int optimal(int[] nums){
        int max = 0;
        int min =  0;
        int price = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int cost = nums[i]-price;
            max = Math.max(max, cost);
            price= Math.min(price, nums[i]);
        }
        return max;
    }
}
