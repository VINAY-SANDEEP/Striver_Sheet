import java.util.*;
public class lConsecutive{
    public static void main(String[] args){
       int[][] nums = {{1,1,1},{1,0,1},{1,1,1}};
       longestConsecutive(nums);
        System.out.println(Arrays.deepToString(nums));
    }
    public static void longestConsecutive(int[][] nums) {
        int[] row = new int[nums.length];
        int[] col = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[i][j]==0){
                    row[i] = 1;
                     col[j]=1;
                }
            }
        }
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums.length ; j++){
                if(row[i]==1 || col[j]==1){
                    nums[i][j]=0;
                }
            }
        }
    }
}