package Arrays.medium;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
      int[][]  matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static void rotate(int[][] matrix) {
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
