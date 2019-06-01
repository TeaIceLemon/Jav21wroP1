package sda.com.PrimeNumber;

import java.util.IllegalFormatException;
import java.util.List;
import java.util.Scanner;

public class PrimeMain {
    public static void main(String[] args) {
        PrimeNumber pNumber = new PrimeNumber();

        try(Scanner in = new Scanner(System.in)){
            System.out.println("Podaj liczbe");
            int n = in.nextInt();
//            System.out.println(pNumber.isPrime(n));
        List<Integer> primeList = pNumber.generatePrimeList(n);
            for(int number:primeList){
                System.out.println(number);
            }
        }catch(IllegalFormatException e){
            System.out.println(e.getMessage());
        }


    }
}
