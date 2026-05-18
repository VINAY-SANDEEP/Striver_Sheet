public class second{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(fun(arr));
    }
    public static int fun(int[] arr){
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(max<arr[i]){
                second = max;
                max = arr[i];
            }
            else if(arr[i]>second && max!=arr[i]){
                second = arr[i];
            }
        }
        return second;
    }
}