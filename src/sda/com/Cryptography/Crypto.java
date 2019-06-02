package sda.com.Cryptography;

import java.util.Scanner;

public class Crypto {
    public String cezar(String arg){
        String result = "";
        //            StringBuffer result = new StringBuffer();
            System.out.println("Jakie przesunięcie 1-25?");
            Scanner scanner = new Scanner(System.in);
            int shift = scanner.nextInt();
            if (shift > 25) {
                System.out.println("Za dużo przesuwasz!");
            } else {
                for (int i = 0; i < arg.length(); i++) {
                    if (Character.isUpperCase(arg.charAt(i))) {
                        char ch = (char) (((int) arg.charAt(i) +
                                shift - 65) % 26 + 65);
                        result+=ch;
                    } else {
                        char ch = (char) (((int) arg.charAt(i) +
                                shift - 97) % 26 + 97);
                        result+=ch;
                    }
                }
            }
        return result;
    }
    public  String myCipher(String arg){
        String result = "";
        for(int i =0 ; i< arg.length();i++){
            char ch = (char)((int)arg.charAt(i) - 'A' + '>');
            result +=ch;
        }
        return result;
    }
    public String bothCiphers(String arg){
        return myCipher(cezar(arg));
    }
}
