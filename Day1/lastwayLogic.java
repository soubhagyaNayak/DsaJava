import java.util.*;
class demo5{
    static void swap5(int a,int b){
        System.out.println("Before swapping value of a is"+a+" and b is "+b);
        a=a+b-(b=a);
        System.out.println("After swapping value of a is "+a+" and b is "+b);
    }
}
public class lastwayLogic {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        demo5.swap5(a,b);
    }
}
