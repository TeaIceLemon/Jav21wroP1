package sda.com.DesignPatterns.b_structural.decorator;

public class Dog implements Animal {
    @Override
    public void becomeAlive() {
        System.out.println("dog is born");
    }

    @Override
    public void givesound() {
        System.out.println("woof, woof");
    }

    @Override
    public void behavior() {
        System.out.println("im neutral");
    }

    @Override
    public void description(){ System.out.println("regular"); }

}
