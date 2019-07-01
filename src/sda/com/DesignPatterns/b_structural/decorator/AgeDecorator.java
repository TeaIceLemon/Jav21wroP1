package sda.com.DesignPatterns.b_structural.decorator;

public class AgeDecorator extends AnimalDecorator {
    protected Age age;

    public AgeDecorator(Animal decoratedAnimal, Age age) {
        super(decoratedAnimal);
        this.age = age;
    }

    @Override
    public void becomeAlive() {
        decoratedAnimal.becomeAlive();
        System.out.println("at age: " + age);
    }

    @Override
    public void givesound() {
        decoratedAnimal.givesound();
        switch (age) {
            case Old:
                System.out.println("im too old for that");
                break;
            case Young:
                System.out.println("i barely learn to speak");
                break;
            case Normal:
                System.out.println("Typical sound");
                break;
        }

    }

    @Override
    public void behavior() {
        decoratedAnimal.behavior();

    }

    @Override
    public void description() {
        decoratedAnimal.description();
        System.out.println("of " + age + "age");
    }

}
