package Arrays.Easy;

import java.util.Arrays;

public class RotateDplaces {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr1 = {1,2,3,4,5,6};
        int k = 3;
        Rotate(arr,k);
        Rotaterec(arr1,k);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }

    public static void Rotaterec(int[] arr1, int k) {
        int n = arr1.length-1;
         reverse(arr1, 0, n-1);
         reverse(arr1, k, n-1);
         reverse(arr1, 0, k-1);
    }
    public static void reverse(int[] nums,int start,int end){
         start = 0;
         end = nums.length-1;
        while (start<=end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    private static void Rotate(int[] arr, int k) {
       int n = arr.length;
        k = k%n;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = k; i < arr.length; i++) {
            arr[i-k] = arr[i];
        }
        for (int i = k; i < arr.length; i++) {
            arr[i]=temp[i-k];
        }
    }
}
