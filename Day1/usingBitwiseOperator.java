import java.util.*;

 class demo3{
   public static void swap3(int a,int b){
     System.out.println("Before swapping value of a is "+a+" and b is"+b);
     a=a^b;
     b=a^b;
     a=a^b;
     System.out.println("After swapping value of a is "+a+" and b is "+b);
   }
}

public class usingBitwiseOperator {
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        demo3.swap3(a,b);

    }
}
