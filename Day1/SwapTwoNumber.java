import java.util.*;
class Demo{
    static void swaps(int a,int b){
      System.out.println("Before swap a is"+a+"and b is"+b);
      int t;
      t=a;
      a=b;
      b=t;
      System.out.println("After swap a is"+a+"and b is"+b);
    }
}

class SwapTwoNumber{
   public static void main(String[] args){
     Scanner scn=new Scanner (System.in);
     int a=scn.nextInt();
     System.out.println("Value of A is"+a);
     int b=scn.nextInt();
     System.out.println("Value of B is"+b);
     Demo.swaps(a,b);
    }
}