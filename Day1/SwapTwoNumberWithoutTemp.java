import java.util.Scanner;

class demo1{
    static void swap1(int a,int b){
     System.out.println("Before swap Value of a is"+a+"and b is "+b);
     a=a+b;
     b=a-b;
     a=a-b;
     System.out.println("After swap Value of a is"+a+"and b is "+b);
    }
}

public class SwapTwoNumberWithoutTemp {
    public static void main(String[] args){
     Scanner scn =new Scanner(System.in);
     System.out.println("Enter the Value of a ");
     int a=scn.nextInt();
     System.out.println("Value of a is" +a);
     System.out.println("Enter the Value of b");
     int b=scn.nextInt();
     System.out.println("Value of b is" +b);
     demo1.swap1(a,b);
    }
}
