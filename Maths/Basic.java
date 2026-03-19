package Maths;

public class Basic {
    public static void main(String[] args) {
        int n = 121;
        System.out.println("count Digits : "+ countDigt(n));
        System.out.println("Reverse Number: "+ ReverseNumber(n));
        System.out.println("palindrome Number: "+ Palindrome(n));
        System.out.println("GCD  : "+ GCD(2,4));
        System.out.println("ArmStrong : "+ ArmStrong(153));
        System.out.println("Prime : "+ prime(3));
    }
    static int countDigt(int n){
        int  c = 0;
      while (n!=0) {
        n=n/10;
      c++;
      }
      return c;
    }
    static int ReverseNumber(int n){
        int rev = 0;
        while (n!=0) {
            int digit = n%10;
             rev = rev*10+digit;
             n = n/10;
        }
        return rev;
    }
    static boolean Palindrome(int n){
        int rev = 0;
        int original = n;
        while (n!=0) {
            int digit = n%10;
             rev = rev*10+digit;
             n = n/10;
        }
        return rev==original;
    }
    static int GCD(int n1,int n2){
           int gcd = 1;
    for(int i = 1; i <= Math.min(n1, n2); i++) {
        if(n1 % i == 0 && n2 % i == 0) {
            gcd = i;
        }
    }
    return gcd;
    }
    static boolean ArmStrong(int n){
        int rev = 0;
        int x = n;
        while (n!=0) {
            int digit = n%10;
            rev+=rev*digit*3;
            n=n/10;
        } 
        return rev==n;
    }
    static boolean prime(int n){
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                c++;
            }
        }
        return c==2;
    }
}
