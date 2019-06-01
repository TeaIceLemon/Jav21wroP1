package sda.com.GCD;

public class GCD {
    public static int getGCDIt(int a, int b){
        while(a!=b){
            if(a>b)a = a-b;
            else if (b>a) b = b-a;
            if(a==1||b==1) break;
        }
        if(a==b)return a;
        else{
            System.out.println("There is no common divisor");
            return -1;
        }
    }
    public static int getGCDRec(int a, int b){
         a = a>b ? a-b : a;
         b = b>a ? b-a : b;
         if((a<=1)||(b<=1)){
             System.out.println("There is no common divisor");
             return -1;
         }
         else return a==b? a : getGCDRec(a,b);

    }
}
