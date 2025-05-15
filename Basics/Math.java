package Basics;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
         System.out.println(countDigit1(12345));
         System.out.println(countDigit2(12345));
         System.out.println(isPalindrome(121));
         System.out.println(reverse(12345));
         System.out.println(GCD(20,40));
         System.out.println(isArmstrong(20));
         System.out.println(Arrays.toString(divisors(12)));
         System.out.println(isPrime(11));
    }
    public static int countDigit1(int n){
        int sum = 0;
        while(n!=0){
            int digit = n%10;
            sum++;
            n=n/10;
        }
        return sum;
    }
    public static int countDigit2(int n){
        int x = (int)Math.log10(n)+1;
        return x;
    }
    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        int x = n;
        int rev = 0;
        while(n!=0){
            int digit = n%10;
            rev = rev*10+digit;
            n = n/10;
        }
        return rev == x;
    }
    public static boolean reverse(int n){
        int rev = 0;
        int original = n;
         while(n!=0){
             int digit = n%10;
             rev = rev * 10 + digit;
             n = n/10;
         }
         return original == rev;
    }
    public static int GCD(int n1, int n2) {
        for(int i= Math.min(n1,n2) ; i > 1 ; i--){
            if(n1%i==0 && n2%i==0){
                return i;
            }
        }
        return 1;
    }
    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
    while(n!=0){
        int digit = n%10;
      sum = sum + (int)Math.pow(digit,3);
        n = n/10;
    }
    return original==sum;
    }
    public static int[] divisors(int n) {
    Vector<Integer> v = new Vector<Integer>();
    for (int i = 1; i <= n; i++) {
        if (n % i == 0) {
            v.add(i);
        }
    }
    int[] result = new int[v.size()];
    for (int i = 0; i < v.size(); i++) {
        result[i] = v.get(i);
    }

    return result;
}
    public static boolean isPrime(int n) {
          int c = 0;
          for(int i = 1 ; i <= n ; i++){
              if(n%i==0){
                c++;
              }
          }
          return c == 2;
    }

}
