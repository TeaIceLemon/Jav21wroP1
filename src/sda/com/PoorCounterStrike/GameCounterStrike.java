package sda.com.PoorCounterStrike;

import java.sql.SQLOutput;
import java.util.Scanner;


public class GameCounterStrike {
    private int OpHp;
    private double cash;
    private int round;
    private Gun gun;
    private Scanner in ;
    private int distance;
    private double dmgToCash;

    public GameCounterStrike() {
        this.cash =0;
        this.round = 1;
        this.dmgToCash = 20;
        this.gun = new Gun();
        this.in = new Scanner(System.in);
        gameStart();
    }

    public void addCash(double amount) {
        this.cash += amount;
    }

    public void gameStart(){
        System.out.println("Round: " + round);
        System.out.println("Cash "+ cash + "$");
        this.OpHp = 100;
        chooseWeapon();
    }
    public void chooseWeapon(){
        if(cash<1000){
            gun.setWeapon(Weapon.Pistol);
        }
        else if(cash<3000){
            System.out.println("What weapon do you want to buy?" +
              "\n [P]istol - 0$, 7 shots, 10 dmg" +
                    "\n [S]hotgun - 1000$, 2 shots, 45 dmg");
            char z = Character.toUpperCase(in.nextLine().charAt(0));
            switch (z){
                case 'P':
                    gun.setWeapon(Weapon.Pistol);
                    break;
                case 'S':
                    gun.setWeapon(Weapon.Shotgun);
                    addCash(-1000);
                    break;
                default:
                    System.out.println("Wrong weapon, take pistol");
                    gun.setWeapon(Weapon.Pistol);
                    break;
            }
        }else{
            System.out.println("What weapon do you want to buy?" +
                    "\n [P]istol - 0$, 7 shots, 10 dmg" +
                    "\n [S]hotgun - 1000$, 2 shots, 45 dmg" +
                    "\n [R]ifle - 3000$, 15 shots, 10 dmg");
            System.out.println();
            char z = Character.toUpperCase(in.nextLine().charAt(0));
            switch (z) {
                case 'P':
                    gun.setWeapon(Weapon.Pistol);
                    break;
                case 'S':
                    gun.setWeapon(Weapon.Shotgun);
                    addCash(-1000);
                    break;
                case 'R':
                    gun.setWeapon(Weapon.Rifle);
                    addCash(-3000);
                    break;
                default:
                System.out.println("Wrong weapon, take pistol");
                    gun.setWeapon(Weapon.Pistol);
                    break;
            }
        }
        roundStart();
    }
    public void roundStart(){
        int distance = (int) (Math.random()*3); // 0 - close, 1 - normal, 2 - far
        double dmgDone;
        int missed=0;
        for(int i =0; i< gun.getAmmo();i++){
            int miss = (int) (Math.random()*2);
            if(miss ==1){
                if((gun.getWeapon() == Weapon.Shotgun)&& (distance == 0 )){
                    dmgDone =(gun.getDmg() + gun.getDmg()/2);
                } else if((gun.getWeapon() == Weapon.Shotgun)&& (distance == 2 )){
                    dmgDone =gun.getDmg()/2;
                }else if((gun.getWeapon() == Weapon.Rifle)&& (distance == 0 )){
                    dmgDone =gun.getDmg()/2;
                }else if((gun.getWeapon() == Weapon.Rifle)&& (distance == 2 )){
                    dmgDone =(gun.getDmg() + gun.getDmg()/2);
                }else{
                    dmgDone = gun.getDmg();
                }
                OpHp -= dmgDone;
                addCash(dmgDone*dmgToCash);
            } else {
                missed++;
            }
        }
        System.out.println("you missed " + missed + " shots");
        System.out.println("Your opponent lost " + (100 - OpHp) + " hp" );
        endRound();
    }
    public void endRound(){
        if(OpHp<=0){
            System.out.println("Congratulation, you won");
            System.out.println("Rounds played: " + round);
        }
        else {
            round++;
            gameStart();
        }
    }
}
