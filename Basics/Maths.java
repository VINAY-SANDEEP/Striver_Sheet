package Basics;

public class Maths {
    public static void main(String[] args) {
        System.out.println(countDigits(12345));
        System.out.println(ReverseNumber(123));
        System.out.println(palindrome(121));
        GCD(6, 12);
        System.out.println();
        System.out.println(ArmStrong(153));
        System.out.println(Prime(11));
    }
    public static int countDigits(int n){
        int c = 0;
      while (n!=0) {
         n = n/10;
         c++;
      }
      return c;
    }
    public static int ReverseNumber(int n){
        int rev = 0;
        while (n!=0) {
            int digit = n%10;
              rev = rev*10+digit;
              n=n/10;
        }
        return rev;
    }
    public static boolean palindrome(int n){
        int rev = 0;
        int original = n;
        while (n!=0) {
            int digit = n%10;
            rev = rev*10+digit;
            n=n/10;
        }
        return rev == original;
    }
    public static void GCD(int n1,int n2){
        for (int i = 1 ; i <= Math.min(n1, n2); i++) {
             if (n1%i==0 && n2%i==0) {
                System.out.print(i+" ");
             }
        }
    }
    public static boolean ArmStrong(int n){
        int k = String.valueOf(n).length();
        int sum  = 0;
        int original = n;
       while (n!=0) {
        int digit = n%10;
       sum+=(int)Math.pow(digit,k);
        n=n/10;
       }
    return sum==original;
    }
    public static void Divisors(int n){
     for (int i = 1; i <= n; i++) {
        if (n%i==0) {
            System.out.print(i+" ");
        }
     }
    }
    public static boolean Prime(int n){
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                 c++;
            }
        }
        return c == 2;
    }
}
