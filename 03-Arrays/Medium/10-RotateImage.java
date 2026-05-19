import java.util.*;
public class lConsecutive{
    public static void main(String[] args){
       int[][] nums = {{1,1,1},{1,0,1},{1,1,1}};
       rotate(nums);
        System.out.println(Arrays.deepToString(nums));
    }
   public void rotate(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix.length];
        for(int i = 0 ; i < matrix.length ;i++){
            for(int j = 0 ; j < matrix.length ; j++){
                result[j][matrix.length-i-1] = matrix[i][j];
            }
        }
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ;j < matrix.length ; j++){
                matrix[i][j] = result[i][j];
            }
        }
    }
    }
}