import java.util.*;
public class TwoSum{
    public static void main(String[] args){
       int[] nums = {2,2,1,1,1,2,2};
        System.out.println(fun(nums));
    }
    public static int fun(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(int num : map.values()){
            if(max<num){
                max = num;
            }
        }
        for(int num : nums){
            if(map.get(num)==max){
                return num;
            }
        }
        return -1;
    }
}