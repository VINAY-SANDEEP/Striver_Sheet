import java.util.*;
public class MoveZeros{
    public static void main(String[] args){
      int[] nums = {1,2,3};
      int k = 3;
       System.out.println(fun(nums,k));
    }
    public static int fun(int[] nums,int k){
       HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 
        int sum = 0, count = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
    int c = 0;
      for(int i = 0 ; i < nums.length ; i++){
        int sum = 0;
        for(int j = i ; j < nums.length ; j++){
            sum+=nums[j];
            if(sum==k){
                c++;
            }
        }
      }
      return c;
    }
}