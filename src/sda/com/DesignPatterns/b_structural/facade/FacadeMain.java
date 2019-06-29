package sda.com.DesignPatterns.b_structural.facade;

public class FacadeMain {
    public static void main(String[] args) {
        Weiter kelner = new Weiter();
        kelner.bringBeer();
        kelner.bringMenuVege();
        kelner.bringMenuMeat();
        kelner.checkPlease();
    }


}
