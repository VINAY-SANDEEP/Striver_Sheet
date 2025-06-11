package BinarySearch.Easy;

import java.util.Arrays;

public class SearchCharacter {
    public static void main(String[] args) {
        char[] ch= {'a','b','d','e','g'};
         System.out.println(Arrays.toString(search(ch, 'f')));
    }
    public static char[] search(char[] ch,char target){
        char x = lowerBound(ch, target);
        char y = HigherBound(ch, target);
        return new char[] {x,y};
    }
    public static char lowerBound(char[] ch,char target){
       int start = 0;
       int end = ch.length-1;
       int ans = ch.length;
       while (start<=end) {
          int mid = start+(end-start)/2;
          if (ch[mid]<=target) {
            ans = mid;
            start=mid+1;
          }else{
           end = mid-1;
          }
       }
       return ch[ans];
    }
    public static char HigherBound(char[] ch,char target){
       int start = 0;
       int end = ch.length-1;
       int ans = ch.length;
       while (start<=end) {
          int mid = start+(end-start)/2;
          if (ch[mid]>=target) {
            ans = mid;
             end = mid-1;
          }else{
           start=mid+1;
          }
       }
       return ch[ans];
    }
}
