package Patterns;

public class pattern {
    public static void main(String[] args) {
        int n = 5;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n);
        pattern11(n);
        pattern12(n);
        pattern13(n);
        pattern14(n);
        pattern15(n);
        pattern16(n);
        pattern17(n);
        pattern18(n);
        pattern19(n);
        pattern20(n);
        pattern21(n);
        pattern22(n);
    }
    static void pattern1(int n) {
        System.out.println("Pattern 1:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n) {
        System.out.println("Pattern 2:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n) {
        System.out.println("Pattern 3:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( j );
            }
            System.out.println();
        }
    }
    static void pattern4(int n) {
        System.out.println("Pattern 4:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( i );
            }
            System.out.println();
        }
    }
    static void pattern5(int n) {
        System.out.println("Pattern 5:");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern6(int n) {
        System.out.println("Pattern 6:");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >=i; j--) {
                System.out.print(n-j+1);
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        System.out.println("Pattern 7");
        for (int i = 1; i <= n; i++) {
            for(int j = 1 ; j <=n-i ;j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <=2*i-1 ;j++){
                System.out.print("*");
            }
             for(int j = 1 ; j <=n-i ;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        System.out.println("Pattern 8");
        for (int i = 1; i <= n; i++) {
            for(int j = 1 ; j <=i ;j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <=(2*n)-(2*i-1) ;j++){
                System.out.print("*");
            }
             for(int j = 1 ; j <=i ;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        System.out.println("Pattern 9");
        for (int i = 1; i <= n; i++) {
            for(int j = 1 ; j <=n-i ;j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <=2*i-1 ;j++){
                System.out.print("*");
            }
             for(int j = 1 ; j <=n-i ;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
         for (int i = 1; i <= n; i++) {
            for(int j = 1 ; j <=i ;j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <=(2*n)-(2*i-1) ;j++){
                System.out.print("*");
            }
             for(int j = 1 ; j <=i ;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        System.out.println("Pattern 10");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         for (int i = 1; i <= n; i++) {
            for (int j = n+1; j >=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        System.out.println("Pattern 11");
        for (int i = 1; i <= n; i++) {
            int start = (i%2==0)?1:0;
            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        System.out.println("Pattern 12");
        int spaces = 2*n-1;
           for(int i = 1 ; i <= n ; i++){
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
    static void pattern13(int n){
    System.out.println("Pattern 13");
        int start = 1;
             for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((start++)+" ");
            }
            System.out.println();
        }
    }
    static void pattern14(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 'A' ;j <= 'A'+i ; j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
    static void pattern15(int n){
        System.out.println("Pattern 15");
        for (int i = 1; i <= n; i++) {
            for(int j = 'A' ;j <= 'A'+(n-i-1) ; j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
    static void pattern16(int n){
        System.out.println("Pattern16");
         for(int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
    static void pattern17(int N){
             for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint) ch++;
                else ch--;
            }
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern18(int n){
         for (int i = 0; i < n; i++) {
            for (char ch = (char) ('A' + n-i-1); ch <= (char) ('A' + n - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
    }
}
    static void pattern19(int N){
        int iniS = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }
            iniS += 2;
            System.out.println();
        }
        iniS = 2 * N - 2;

        for (int i = 1; i <= N; i++) {
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
    static void pattern20(int n){
         int spaces = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) stars = 2 * n - i;
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n) spaces -= 2;
            else spaces += 2;
        }
    }
    static void pattern21(int n){
      for(int i = 1 ; i <= n ; i++){
        for(int j = 1 ; j <=n ; j++){
            if (i==1 || j==1 || i==n || j==n) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
      }
    }
    static void pattern22(int n){
        for(int i = 1 ; i <=2*n-1 ;i++){
            for(int j = 1 ; j <=2*n-1 ; j++){
              int top = i;
              int bottom = (2*n-2)-i;
              int left = j;
              int right = (2*n-2)-j; 
              int min = Math.min(Math.min(top, bottom),Math.min(right, left));
              System.out.print(n-min);
            }
            System.out.println();
        }
    }   
}


