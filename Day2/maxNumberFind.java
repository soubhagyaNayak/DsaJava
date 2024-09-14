//package Day2;
import java.util.*;
class demo5{
    static int maxFind(int a,int b){
        return (a>b)?a:b;
    }
}
class demo6{
    static int maxFind1(int a,int b){
        return Math.max(a,b);
    }
}
class demo7{
    static int maxFind2(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
}
public class maxNumberFind{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        System.out.println("maxmimun value from demo5 is "+demo5.maxFind(a,b));
        System.out.println("maxmimun value from demo6 is "+demo6.maxFind1(a,b));
        System.out.println("maxmimun value from demo7 is "+demo7.maxFind2(a,b));
    }
}
