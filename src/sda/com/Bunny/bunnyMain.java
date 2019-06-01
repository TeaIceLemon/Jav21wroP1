package sda.com.Bunny;

import java.util.IllegalFormatException;
import java.util.Scanner;

public class bunnyMain {
    public static void main(String[] args) {
        BunnyFib bunny = new BunnyFib();
        int bN0 = 0, bN1 = 1;
        int n;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Pass number of months");
            n = in.nextInt();
            if (n == 1) System.out.println(1);
            else if (n == 0) System.out.println(0);
            else {
                System.out.println(bunny.BunnyNoFor(n, bN0, bN1));
                System.out.println(bunny.BunnyNoRec(n, bN0, bN1));
            }
        } catch (IllegalFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
