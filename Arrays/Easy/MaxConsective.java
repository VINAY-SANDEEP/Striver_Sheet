import java.util.*;
public class MaxConsective{
    public static void main(String[] args){
        int[] nums = {1,1,0,1,1,1};
       System.out.println(fun(nums));
    }
    public static int fun(int[] nums){
        int max= Integer.MIN_VALUE;
        int c = 0;
       for(int i = 0 ; i < nums.length ; i++){
           if(nums[i]==1){
               c++;
               max = Math.max(max,c);
           }else{
               c = 0;
           }
       }
       return max;
    }
}