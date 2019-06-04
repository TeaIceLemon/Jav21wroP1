package sda.com.Games.PoorDarkSoulsGame;

import java.util.Scanner;

public class PoorDarkSoulsGameMain {

    public static void main(String[] args) {
        Monster monster = new Monster();
        System.out.println("Choose your class : [K]night, [A]ssasin, [M]age");
        Scanner in = new Scanner(System.in);
        String ch = in.next();
        HeroTemplate heroT;
        switch (ch){
            case "k":
                heroT = HeroTemplate.Knight;
                break;
            case "a":
                heroT = HeroTemplate.Assassin;
                break;
            case "m":
                heroT = HeroTemplate.Mage;
                break;
                default:heroT = HeroTemplate.Knight;
        }
        System.out.println("your class is " + heroT.toString());
        Hero hero = new Hero(heroT);
        while(hero.isAlive()){
            hero.fight(monster);
        }
    }
}
