import java.util.*;

class demo8{
    static int sumNumber(int n){
      int sum=0;
      for(int i=1;i<=n;i++){
        sum=sum+i;
      }
     return sum;
    }
}
class demo9{
    static int sumNumber1(int n){
     
      if(n==0){
        return 0;
      }else{
         return n+sumNumber1(n-1);
      }
    }
}


public class sumOfNaturalNumber {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(demo8.sumNumber(n));
        System.out.println(demo9.sumNumber1(n));
    }
}
