import java.util.*;
public class MoveZeros{
    public static void main(String[] args){
       int[] nums = {0,1,3};
       System.out.println(fun(nums));
    }
    public static int fun(int[] nums){
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();
        int x = n*(n+1)/2;
        return x-sum;
    }
}