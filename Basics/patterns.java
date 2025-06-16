package Basics;
public class patterns {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(5);
        pattern11(5);
        pattern12(5);
        pattern13(5);
        pattern14(5);        
        pattern15(5);
        pattern17(5);
        pattern18(5);
        pattern19(5);
        pattern20(5);
        pattern21(5);
        pattern22(5);
    }
    public static void pattern1(int n) {
        System.out.println("Pattern 1");
         System.err.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n) {
         System.out.println("Pattern 2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n) {
         System.out.println("Pattern 3");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n) {
         System.out.println("Pattern 4");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n) {
         System.out.println("Pattern 5");
          System.err.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n) {
         System.out.println("Pattern 6");
          System.err.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n) {
         System.out.println("Pattern 7");
          System.err.println();
        for (int i = 0; i < n; i++) {
            //spaces
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 0; j < 2*i+1 ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern8(int n) {
         System.out.println("Pattern 8");
          System.err.println();
        for (int i = 0; i < n; i++) {
            //spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 0; j < 2*n - (2*i+1) ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
    
   }
    public static void pattern10(int n){
    System.out.println("Pattern 10");
    System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern11(int n){
    System.out.println("Pattern 11");
    System.out.println();
        int start = 0;
        for (int i = 0; i <= n; i++) {
           start = (i%2==0) ? 1 : 0;
            for (int j = 0; j <= i; j++) {
                 System.out.print(start);
                 start = 1-start;
            }
            System.out.println();
        }
    }
    public static void pattern12(int n) {
    System.out.println("Pattern 12");
    System.out.println();
       int spaces = 2*n-1;
      for(int i=1;i<=n;i++){
          for(int j=1;j<=i;j++){
          System.out.print(j);
          }
          for(int j = 1;j<=spaces;j++){
          System.out.print(" ");
          }
          for(int j=i;j>=1;j--){
           System.out.print(j);
          }
          System.out.println();
          spaces-=2;
      }
    }
    public static void pattern13(int n){
         System.out.println();
        System.out.println("Pattern 13");
        int c = 1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((c++) +" ");
            }
            System.out.println();
        }
    }
    public static void pattern14(int n){

        System.out.println();
        System.out.println("Pattern 14");
        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch < 'A'+i; ch++) {
                System.out.print(ch+" ");
            }
           System.out.println();
        }
    }
    public static void pattern15(int n){
        System.out.println();
        System.out.println("Pattern 15");
        for (int i = 0; i <= n; i++) {
            for (char ch = 'A'; ch <= 'A'+(n-i-1); ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern16(int n){

         System.out.println();
        System.out.println("Pattern 16");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
              System.out.print((char)(int)('A'+i)+" ");   
            }
            System.out.println();
        }
    }
    public static void pattern17(int n){
        System.out.println();
        System.out.println("Pattern 17");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (char ch = 'A'; ch < 'A' + i + 1; ch++) {
                System.out.print(ch);
            }
            for (char ch = (char)('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch);
            }
            System.out.println();
    }
}
    public static void pattern18(int n){
        System.out.println();
        System.out.println("Pattern 18");
        for (int i = 1; i <= n; i++) {
            char ch = (char) ('A' + n - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }
    }
    public static void pattern19(int n){
          System.out.println();
        System.out.println("Pattern 19");
        int iniS = 0;
      for(int i=0;i < n;i++){
          for(int j=1;j<=n-i;j++){
              System.out.print("*");
          }
          for(int j=0;j<iniS;j++){
              System.out.print(" ");
          }
          for(int j=1;j<=n-i;j++){
              System.out.print("*");
          }
          iniS+=2;
          System.out.println();
      }
      
      iniS = 2*n -2;
      for(int i=1;i<=n;i++){
          for(int j=1;j<=i;j++){
              System.out.print("*");
          }
          for(int j=0;j<iniS;j++){
              System.out.print(" ");
          }
          for(int j=1;j<=i;j++){
              System.out.print("*");
          }
          iniS-=2;
          System.out.println();
    }
    }
    public static void pattern20(int n){
        System.out.println();
        System.out.println("Pattern 20");
         int spaces = 2*n-2;
      for(int i = 1;i<=2*n-1;i++){
          int stars = i;
          if(i>n) stars = 2*n - i;
          for(int j=1;j<=stars;j++){
              System.out.print("*");
          }
          for(int j = 1;j<=spaces;j++){
              System.out.print(" ");
          }
          for(int j = 1;j<=stars;j++){
              System.out.print("*");
          }
          System.out.println();
          if(i<n) spaces -=2;
          else spaces +=2;
      }
    }
    public static void pattern21(int n){
        System.out.println();
        System.out.println("Pattern 21");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || j == 0 || i == n-1 || j == n-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern22(int n){
        System.out.println();
        System.out.println("Pattern 22");
      for(int i=0;i<2*n-1;i++){
         for(int j=0;j<2*n-1;j++){
             int top = i;
             int bottom = j;
             int right = (2*n - 2) - j;
             int left = (2*n - 2) - i;
             System.out.print(n- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
         }
         System.out.println();
     }
    }
}
