package Arrays.Easy;
import java.util.*;
public class SecondElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Second(arr));
    }
    public static int Second(int[] nums){
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(max < arr[i]){
                second = max;
                max = arr[i];
            }
             else if (arr[i] > second && arr[i] != max) {
                second = arr[i];
            }
          }
          return (second==Integer.MIN_VALUE)?-1:second;
    }
}
