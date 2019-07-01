package sda.com.DesignPatterns.b_structural.decorator;

public class SizeDecorator extends AnimalDecorator {
    protected Size size;

    public SizeDecorator(Animal decoratedAnimal, Size size) {
        super(decoratedAnimal);
        this.size = size;
    }

    @Override
    public void givesound() {
        decoratedAnimal.givesound();
    }

    @Override
    public void behavior() {
        decoratedAnimal.behavior();
    }

    @Override
    public void description() {
        decoratedAnimal.description();
        System.out.println(" i have " + size + "body");
    }

    @Override
    public void becomeAlive() {
        decoratedAnimal.becomeAlive();

    }
}
