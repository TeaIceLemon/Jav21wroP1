package sda.com.DesignPatterns.b_structural.decorator;

public abstract class AnimalDecorator implements Animal {
    protected Animal decoratedAnimal;
    AnimalDecorator(Animal decoratedAnimal){
        super();
        this.decoratedAnimal = decoratedAnimal;

    }
}
