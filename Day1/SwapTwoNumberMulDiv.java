import java.util.*;

class demo2{
    static void swap2(int a,int b){
     a=a*b;
     b=a/b;
     a=a/b;
     System.out.println("After swap value of a is "+a+"and b is "+b);
    }
}
public class SwapTwoNumberMulDiv {
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=scn.nextInt();
        System.out.println("Value of a is"+a);
        System.out.println("Enter the value of b");
        int b=scn.nextInt();
        System.out.println("Value of b is"+b);
        demo2.swap2(a,b);
    }
}
