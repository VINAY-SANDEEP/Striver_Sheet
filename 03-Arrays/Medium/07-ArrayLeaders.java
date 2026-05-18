import java.util.*;
public class TwoSum{
    public static void main(String[] args){
       int[] nums = {1,2,3};
        System.out.println(leaders(nums));
    }
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int first = arr[arr.length-1];
        list.add(first);
        for(int i = arr.length-2 ; i>=0 ; i--){
            if(arr[i]>=first){
                list.add(arr[i]);
                first = arr[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
}