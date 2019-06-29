package sda.com.DesignPatterns.b_structural.facade;

import sda.com.MyLists.ArrayList1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Weiter {
    public void bringBeer(){
        Scanner in = new Scanner(System.in);
        System.out.println("\"small\" czy \"big\"");
        String size = in.nextLine();
        in.close();
        System.out.println("heres your " + size + " beer" );
    }
    public void bringMenuVege(){
        String poz1 = "spinach";
        String poz2 = "soy something";
        String poz3 = "vege something";
        ArrayList<String> vegeMenu= new ArrayList<>();
        vegeMenu.add(poz1);
        vegeMenu.add(poz2);
        vegeMenu.add(poz3);
        System.out.println("Vege menu : " + vegeMenu.toString());
    }
    public void bringMenuMeat(){
        System.out.println("Meat menu :" + MeatMenu.getMenu());
    }
    public void checkPlease(){
        Random random = new Random();
        System.out.println("your check is " + random.nextInt(100) + "PLN");
    }
}
