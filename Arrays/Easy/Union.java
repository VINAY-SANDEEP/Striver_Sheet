import java.util.*;

public class MoveZeros {

    public static void main(String[] args) {

        int[] nums = {1,2,3};
        int[] arr = {4,5,6};

        System.out.println(Arrays.toString(fun(nums, arr)));
    }

    public static int[] fun(int[] nums, int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int[] ans = new int[set.size()];

        int index = 0;

        for(Integer value : set) {
            ans[index] = value;
            index++;
        }

        return ans;
    }
}