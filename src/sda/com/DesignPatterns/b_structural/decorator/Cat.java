package sda.com.DesignPatterns.b_structural.decorator;

public class Cat implements Animal {
    @Override
    public void becomeAlive() {
        System.out.println("cat is born");
    }

    @Override
    public void givesound() {
        System.out.println("Meow, meow");
    }

    @Override
    public void behavior() {
        System.out.println("Im neutral");
    }

    @Override
    public void description() {
        System.out.println("Regular");
    }

}
