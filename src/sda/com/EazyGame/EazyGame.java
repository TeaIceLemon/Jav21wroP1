package sda.com.EazyGame;

import java.util.Scanner;

public class EazyGame {
    int number;

    public EazyGame() {
        number = (int)(Math.random()*100) +1;
    }

    public int getNumber() {
        return number;
    }
    public void game(){
        boolean isNotGuessed = true;
        int index =0;
        try(Scanner in = new Scanner(System.in)){
            while(isNotGuessed){
                index++;
                System.out.println("Podaj liczbe");
                int a = in.nextInt();
                if(a==number){
                    System.out.println("Brawo zgadłes");
                    isNotGuessed=false;
                }
                else if(a>number) System.out.println("Za duzo!!");
                else System.out.println("Za mało!!");
                if(index ==5){
                    System.out.println("Nie trafiles 5 razy, Przegrałeś");
                    break;
                }
            }
        }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
        }

    }
}

