package BinarySearch.Easy;

public class solution {
    public static void main(String[] args) {
       int[] nums = {-1,0,3,5,9,12};
       int target = 9;
       System.out.println(BinarySearchNormal(nums,target));
       System.out.println(BinarySearchRecursive(nums, target));
    }
    public static int BinarySearchNormal(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if (nums[mid]==target) {
                return mid;
            }
            else if (nums[mid]<target) {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static int BinarySearchRecursive(int[] nums,int target){
        return BinaryRec(nums,0,nums.length-1,target);
    }
    public static int BinaryRec(int[] nums, int start, int end, int target) {
        if (start>end) {
            return -1;
        }
        int mid = (start+end)/2;
        if (nums[mid]==target) {
            return mid;
        }
       else if (nums[mid]<target) {
            return BinaryRec(nums,mid+1,end,target);
        }else{
         return BinaryRec(nums,start,mid-1,target);
        }
    }

}
