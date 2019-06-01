package sda.com.GCD;

import java.util.IllegalFormatException;
import java.util.Scanner;

public class GCDMain {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Enter first number");
            int a = 50;//in.nextInt();
            System.out.println("Enter first number");
            int b = 999;//in.nextInt();
            System.out.println("Greatest common divisor (iteration) is: " + GCD.getGCDIt(a,b));
            System.out.println("Greatest common divisor (recursion) is: " + GCD.getGCDRec(a,b));
        }catch(IllegalFormatException e){
            System.out.println(e.getMessage());
        }
    }
}
