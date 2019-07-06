package sda.com.Games.PoorDarkSoulsGame;

import java.util.Random;
import java.util.Scanner;

public class Hero {
    HeroTemplate heroTemplate;
    Weapon weapon;
    boolean alive;

    public Hero(HeroTemplate heroTemplate) {
        this.heroTemplate = heroTemplate;
        if(heroTemplate.equals(HeroTemplate.Knight)) setWeapon(Weapon.Sword);
        else if(heroTemplate.equals(HeroTemplate.Assassin)) setWeapon(Weapon.Dagger);
        else if(heroTemplate.equals(HeroTemplate.Mage)) setWeapon(Weapon.Wand);
        alive = true;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public void fight(Monster monster){
        if((heroTemplate.equals(HeroTemplate.Knight) && weapon.equals(Weapon.Sword))){
            System.out.println("your next oponent is " + monster.getLvl() + " lvl");
            System.out.println("YEA , you defeated this monster, but your weapon is broken");
            monster.lvlUp();
            setWeapon(newWeapon());
            System.out.println("your new weapon is : " + getWeapon());
            System.out.println("get ready to fight!!");
            System.out.println();
        }
        else if((heroTemplate.equals(HeroTemplate.Assassin) && weapon.equals(Weapon.Dagger))){
            System.out.println("your next oponent is " + monster.getLvl() + " lvl");
            System.out.println("YEA , you defeated this monster, but your weapon is broken");
            monster.setLvl(monster.getLvl() + 1 );
            monster.lvlUp();
            setWeapon(newWeapon());
            System.out.println("your new weapon is : " + getWeapon());
            System.out.println("get ready to fight!!");
            System.out.println();
        }
        else if((heroTemplate.equals(HeroTemplate.Mage) && weapon.equals(Weapon.Wand))){
            System.out.println("your next oponent is " + monster.getLvl() + " lvl");
            System.out.println("YEA , you defeated this monster, but your weapon is broken");
            monster.setLvl(monster.getLvl() + 1 );
            monster.lvlUp();
            setWeapon(newWeapon());
            System.out.println("your new weapon is : " + getWeapon());
            System.out.println("get ready to fight!!");
            System.out.println();
        }
        else{
            System.out.println("You are DEAD");
            alive = false;
        }
    }
    public Weapon newWeapon(){

        return Weapon.values()[new Random().nextInt(Weapon.values().length-1)];
    }

    public boolean isAlive() {
        return alive;
    }
}
