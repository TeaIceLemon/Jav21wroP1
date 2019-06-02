package sda.com.Cryptography;

import java.util.IllegalFormatException;
import java.util.Scanner;

public class CryptoMain {
    public static void main(String[] args) {
        Crypto crypto = new Crypto();
        outerloop:
        try(Scanner in = new Scanner(System.in)){
            System.out.println("What meesage you want to encrypt ? ");
            String msg = in.nextLine();
            System.out.println("What cipher do you want to use ? 0 - cezar cipher, 1 - myCipher, 2 - both (cezar and myCipher)" );
            int whatCipher = in.nextInt();
            switch (whatCipher){
                case 0:
                    System.out.println(crypto.cezar(msg));
                    break;
                case 1:
                    System.out.println(crypto.myCipher(msg));
                    break;
                case 2:
                    System.out.println(crypto.bothCiphers(msg));
            }
            System.out.println("do you want to decipher? [Y]es ? [N]o ?");
            char ch = in.next().charAt(0);
            if(ch == 'Y' || ch == 'y') System.out.println(msg);
            else if (ch == 'N' || ch == 'n') break outerloop;
            else {
                String bush = "";
                for(int i = 0 ; i<msg.length();i++){
                    bush+= (char)(((int)Math.random()*122)+33);
                }
                System.out.println(bush);
            }
        }catch (IllegalFormatException e ){
            System.out.println(e.getMessage());
        }
        System.out.println("thanks for using my program");
    }
}
