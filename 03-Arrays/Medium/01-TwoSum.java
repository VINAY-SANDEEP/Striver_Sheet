public class TwoSum{
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(fun(nums,target)));
    }
    public static int[] fun(int[] nums,int target){
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i +1 ; j < nums.length ; j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static int[] fun(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            int find = target-nums[i];
            if(map.containsKey(find)){
                return new int[]{map.get(find),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
     public static int[] fun(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            int find = target-nums[i];
            if(map.containsKey(find)){
                return new int[]{map.get(find),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}