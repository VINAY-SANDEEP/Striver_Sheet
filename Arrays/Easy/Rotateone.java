package Arrays.Easy;

import java.util.Arrays;

public class Rotateone {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
       int[] x = Rotate(arr);
        System.out.println(Arrays.toString(x));
    }
    private static int[] Rotate(int[] arr) {
        int n = arr.length-1;
        int first = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]= arr[i+1];
        }
        arr[n] = first;
        return arr;
    }
}
