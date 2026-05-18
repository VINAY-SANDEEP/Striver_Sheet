import java.util.*;
public class Rotate{
    public static void main(String[] args){
       int[] nums = {1,2,3,4,5,6,7};
       int k = 3;
        fun(nums, k);
        System.out.println(Arrays.toString(nums));
    }
    public static void fun(int[] arr,int k){
        int n = arr.length;
        k=k%arr.length;
       reverse(arr,0,n-1);
       reverse(arr,0,k-1);
       reverse(arr,k,n-1);
    }
     public static void reverse(int[] nums,int i ,int j){
   while(i<=j){
     swap(nums,i,j);
    i++;
    j--;
   }
  }
  public static void swap(int[] nums,int i,int j){
    int temp = nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
  }
}