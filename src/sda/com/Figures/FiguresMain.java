package sda.com.Figures;

import com.sun.org.apache.xpath.internal.functions.WrongNumberArgsException;

import java.util.IllegalFormatException;
import java.util.Scanner;

public class FiguresMain {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("what do you want to print ? 0 - Square, 1 - rectangle, 2 - tree, 3 - triangle  ");
            int n = in.nextInt();
            if(n<0 || n>3) throw new IllegalArgumentException("Input must be between 0 to 3 ");
            switch (n){
                case 0:
                    //////
                    break;
                case 1:
                    int sizeA;
                    int sizeB;
                    while(true){
                        System.out.println("What is heigh of rectangle?");
                        sizeA = in.nextInt();
                        System.out.println("What is width of rectangle?");
                        sizeB = in.nextInt();
                        if(sizeA >0 && sizeB > 0) break;
                        if ( sizeA < 0 ){
                            System.out.println("sizeA is lower than 0 ");
                        }
                        if ( sizeB < 0 ){
                            System.out.println("sizeB is lower than 0 ");
                        }

                    }
                    IDraw rec = new Rectangle(sizeA, sizeB);
                    rec.draw();
                    break;
                case 2:
                    //////
                    break;
                case 3:
                    //////
                    break;
            }
        }catch (IllegalFormatException e ) {
            System.out.println(e.getMessage());
        }

    }
}
