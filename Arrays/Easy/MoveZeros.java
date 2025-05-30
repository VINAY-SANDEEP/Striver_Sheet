package Arrays.Easy;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0};
        zeros(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void zeros(int[] arr) {
        int j = 0;
        int[] temp = new int[arr.length];
       for (int i = 0; i < arr.length; i++) {
        if (arr[i]!=0) {
            temp[j]=arr[i];
            j++;
        }
       }
       for (int i = 0; i < temp.length; i++) {
           arr[i] = temp[i];
       }
    }
}
