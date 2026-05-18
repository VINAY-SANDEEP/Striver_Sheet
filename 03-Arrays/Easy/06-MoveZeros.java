import java.util.*;
public class MoveZeros{
    public static void main(String[] args){
       int[] nums = {1,0,2,0,3,0};
        fun(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void fun(int[] arr){
        int index=0;
        for(int i = 0 ; i < arr.length;i++){
         if(arr[i]!=0){
             int temp = arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
                index++;
         }
        }
    }
}