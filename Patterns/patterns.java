public class patterns{
    public static void main(String[] args) {
        pattern19(5);
    }
    public static void pattern1(int n){
        for(int i = 1 ; i <=n ;i++){
            for(int j = 1 ; j <= n ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i = 1 ; i <=n ;i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int i = 1 ; i <=n ;i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int i = 1 ; i <=n ;i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int i = 1 ; i <=n ;i++){
            for(int j = n ; j >= i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        for(int i = 1 ; i <=n ;i++){
            for(int j = n ; j >= i ; j--){
                System.out.print(n-j+1);
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        for(int i = 1 ; i <=n ;i++){
          for (int j = 1; j <= n-i; j++) {
            System.out.print(" ");
          }
          for (int j = 1; j <= 2*i+1; j++) {
            System.out.print("*");
          }
            System.out.println();
        }
    }
    public static void pattern8(int n){
        for(int i = 1 ; i <=n ;i++){
          for (int j = 1; j <= i; j++) {
            System.out.print(" ");
          }
          for (int j = 1; j <= (2*n)-(2*i+1) ; j++) {
            System.out.print("*");
          }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        pattern7(n);
        pattern8(n);
    }
    public static void pattern10(int n){
        pattern2(n);
        pattern5(n);
    }
    public static void pattern11(int n){
        for(int i = 1 ; i <=n ;i++){
            int ans = (i%2==0)? 0 : 1;
            for(int j = 1 ; j <= i ; j++){
                System.out.print(ans);
                 ans = 1 - ans; 
            }
            System.out.println();
        }
    }
    public static void pattern12(int n){
        int spaces = 2 * (n - 1);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
            spaces -= 2;
    }
    }
    public static void pattern13(int n){
    int start= 1;
        for(int i = 1 ; i <=n ;i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(start++);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern14(int n){
        for(int i = 1 ; i <=n ;i++){
            for(char ch = 'A' ; ch < ('A'+i) ; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void pattern15(int n){
       for (int i = n; i >= 1; i--) {
        for (int j = 0; j < i; j++) {
            System.out.print((char) ('A' + j));
        }
        System.out.println();
    }
}
    public static void pattern16(int n){
        for(int i = 1 ; i <=n ;i++){
            for(char ch = 'A' ; ch < ('A'+i) ; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void pattern17(int n){
         for (int i = 0; i < n; i++) {

        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }

        char ch = 'A';
        int breakpoint = (2 * i + 1) / 2;

        for (int j = 1; j <= 2 * i + 1; j++) {
            System.out.print(ch);
            if (j <= breakpoint) {
                ch++;
            } else {
                ch--;
            }
        }

        for (int j = 0; j < n - i - 1; j++) {
            System.out.print(" ");
        }

        System.out.println();
         }
    }
    public static void pattern19(int n) {

    int iniS = 0;

    for (int i = 0; i < n; i++) {

        for (int j = 1; j <= n - i; j++) {
            System.out.print("*");
        }

        for (int j = 0; j < iniS; j++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= n - i; j++) {
            System.out.print("*");
        }

        iniS += 2;
        System.out.println();
    }

    iniS = 2 * n - 2;

    for (int i = 1; i <= n; i++) {

        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }

        for (int j = 0; j < iniS; j++) {
            System.out.print(" ");
        }

        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }

        iniS -= 2;
        System.out.println();
    }
}


}