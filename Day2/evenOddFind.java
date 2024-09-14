
import java.util.Scanner;

class demo7{
    static void findOddEvenNumber(int a){
        if(a%2==0){
            System.out.println("a is Even Number");
        }
        else{
            System.out.println(a+ " is odd number");
        }
    }
}

public class evenOddFind {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        demo7.findOddEvenNumber(a);
    }
}
