public class CheckArrayisSorted{
    public static void main(String[] args){
        int[] nums = {3,4,5,1,2};
        System.out.println(fun(nums));
    }
    public static boolean fun(int[] arr){
        int c = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]>arr[(i+1)%arr.length]){
                c++;
            }
        }
        return c<=1;
    }
}