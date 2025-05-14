package Basics;
public class patterns{
    public static void main(String[] args){
        pattern17(5);
    }
    public static void pattern1(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print("*");
            }
             System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int i = 0 ; i < n ; i++){
          //spaces
          for(int j = 0 ; j < n-i-1 ; j++){
              System.out.print(" ");
          }
          //stars
          for(int j = 0 ; j < 2*i+1 ; j++){
              System.out.print("*");
          }
          //spaces
          for(int j = 0 ; j < n-i-1 ; j++){
              System.out.print(" ");
          }
          System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int i = 0 ; i < n ; i++){
          //spaces
          for(int j = 0 ; j < i ; j++){
              System.out.print(" ");
          }
          //stars
          for(int j = 0 ; j < (2*n)-(2*i+1) ; j++){
              System.out.print("*");
          }
          //spaces
          for(int j = 0 ; j < i ; j++){
              System.out.print(" ");
          }
          System.out.println();
        }
    }
    public static void pattern6(int n){
        pattern4(n);
        pattern5(n);
    }
    public static void pattern7(int n){
       for(int i = 0; i < 2 * n; i++){
        int stars = i<=n ? i : 2*n-i;
        for(int j = 0; j < stars; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
    public static void pattern8(int n){
        for(int i = 0 ; i < n ; i++){
             int start = 1;
             if(i%2==0){
                 start=1;
             }
             else{
                 start = 0;
             }
            for(int j = 0 ; j < i ; j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        int start = 1;                       
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < i ; j++){       
                System.out.print(start);
                start++;
            }
            System.out.println();
        }
    }
    public static void pattern10(int n){
        for(int i = 0 ; i < n ; i++){
            for(char ch = 'A' ; ch < 'A'+i ; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void pattern11(int n){
        for(int i = 0 ; i < n ; i++){
            for(char ch = 'A' ; ch < 'A'+(n-i-1) ; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void pattern12(int n){
        for(int i = 0 ; i < n ; i++){
            char ch =(char) ('A'+ i);
            for(int j = 0 ; j < i ; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void pattern13(int n){
    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < n - i - 1 ; j++){
            System.out.print(" ");
        }
        char ch = 'A';
        for(int j = 0 ; j <= i ; j++){
            System.out.print(ch);
            ch++;
        }
        ch -= 2;
        for(int j = 0 ; j < i ; j++){
            System.out.print(ch--);
        }
        System.out.println();
    }
}
    public static void pattern14(int n){
        for(int i = 0 ; i < n ; i++){
            for(char ch = (char)('E'-i) ; ch <='E' ; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void pattern15(int n){
    int inis = 0;
    // Upper half
    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < n - i ; j++){
            System.out.print("*");
        }
        for(int j = 0 ; j < inis ; j++){
            System.out.print(" ");
        }
        for(int j = 0 ; j < n - i ; j++){
            System.out.print("*");
        }
        inis += 2;
        System.out.println();
    }

    inis = 2 * n - 2;
    // Lower half
    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j <= i ; j++){
            System.out.print("*");
        }
        for(int j = 0 ; j < inis ; j++){
            System.out.print(" ");
        }
        for(int j = 0 ; j <= i ; j++){
            System.out.print("*");
        }
        inis -= 2;
        System.out.println();
    }
}
    public static void pattern16(int n){
        int spaces = 2*n-2;
        for(int i = 0 ; i < 2*n-1 ; i++){
           int stars = i<n?i+1 : 2*n-i-1;
            for(int j = 0 ; j < stars ; j++){
                System.out.print("*");
            }
            for(int j = 0 ; j < spaces ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < stars ; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n-1){
                spaces=spaces-2;
            }else{
                spaces=spaces+2;
            }
        }
    }
    public static void pattern17(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i==0 || j == 0 || i ==n-1 || j == n - 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}