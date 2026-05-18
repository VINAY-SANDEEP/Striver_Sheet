import java.util.*;
public class MoveZeros{
    public static void main(String[] args){
        int[]  nums = {4,1,2,1,2};
       System.out.println(fun(nums));
    }
    public static int fun(int[] nums){
       int res = nums[0];
       for(int i = 1 ; i < nums.length ; i++){
         res^=nums[i];
       }
       return res;
    }
    public int singleNumber(int[] nums) {
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i = 0 ; i < nums.length ; i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }
      for(int num:nums){
        if(map.get(num)==1){
            return num;
        }
      }
      return -1;
    }
}