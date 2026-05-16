public class Main {
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
     pattern16(5);  
     pattern17(5); 
     pattern18(5); 
     pattern19(5); 
     pattern20(5); 
     pattern21(5); 
     pattern22(5); 
    }
    public static void pattern1(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < n-i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n-i+1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= 2*i-1 ; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern8(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <=(2*n)-(2*i-1) ; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
    pattern7(5);  
    pattern8(5);
    }
    public static void pattern10(int n){
    pattern2(5);  
    pattern5(5);
    }
    public static void pattern11(int n){
        for(int i = 1 ; i <= n ; i++){
            int start = (i%2==0)?0:1;
            for(int j = 1 ; j <= i ; j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    public static void pattern12(int n){
        int inis = 2*(n-1);
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j <= inis; j++){
                System.out.print(" ");
            }
            for(int j = i ; j >= 1 ; j--){
                System.out.print("*");
            }
            System.out.println();
            inis-=2;
        }
    }
    public static void pattern13(int n){
          int start = 1;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(start++ +" ");
            }
            System.out.println();
        }
    }
    public static void pattern14(int n){
         char ch = 'A';
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print((char)(ch+j));
            }
            System.out.println();
        }
    }
    public static void pattern15(int n){
         char ch = 'A';
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < +n-i-1 ; j++){
                System.out.print((char)(ch+j));
            }
            System.out.println();
        }
    }
    public static void pattern16(int n){
         char ch = 'A'-1;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print((char)(ch+i));
            }
            System.out.println();
        }
    }
    public static void pattern17(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2*i-1)/2;
            for(int j = 1 ; j <= 2*i-1 ; j++){
                System.out.print((char)ch);
                if(j<=breakpoint){
                    ch++;
                }else{
                    ch--;
                }
            }
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern18(int n){
         char ch = 'A';
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print((char)(ch+(n-j-1)));
            }
            System.out.println();
        }
 }
    public static void pattern19(int n){
        int inis = 0;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <=n- i ; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j <=inis ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print("*");
            }
            System.out.println();
            inis+=2;
        }
         inis = 2*(n-1);
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            for(int j = 1 ; j <= inis; j++){
                System.out.print(" ");
            }
            for(int j = i ; j >= 1 ; j--){
                System.out.print("*");
            }
            System.out.println();
            inis-=2;
        }
    }
    public static void pattern20(int n){
       int inis = 2*n-1;
       for(int i = 1 ; i<= n ; i++){
           for(int j = 1 ; j <= i ; j++){
               System.out.print("*");
           }
           for(int j = 1 ; j <= inis ; j++){
               System.out.print(" ");
           }
            for(int j = 1 ; j <= i ; j++){
               System.out.print("*");
           }
           System.out.println();
           inis -= 2;
       }
       for(int i = n ; i>=1; i--){
           for(int j = 1 ; j <= i ; j++){
               System.out.print("*");
           }
           for(int j = 1 ; j <= inis ; j++){
               System.out.print(" ");
           }
            for(int j = 1 ; j <= i ; j++){
               System.out.print("*");
           }
           System.out.println();
           inis += 2;
       }
       
    }
    public static void pattern21(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                      System.out.print("*");
                // Print space otherwise
                else
                       System.out.print(" ");
            }
               System.out.println();
        }
    }
    public static void pattern22(int n){
        for(int i = 1 ; i <= n ; i++){
          for(int j = 1 ; j <= n ; j++){
         int top = i;
         int bottom = (2*n-2)-i;
         int right = (2*n-2)-j;
         int left = j;
         int value = Math.min(Math.min(left,right),Math.min(top,left));
  System.out.print(n-value);
        }
        System.out.println();
        }
    }
}
