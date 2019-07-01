package sda.com.DesignPatterns.b_structural.decorator;

public class BehaviorDecorator extends AnimalDecorator {
    protected Behavior behavior;

    public BehaviorDecorator(Animal decoratedAnimal, Behavior behavior) {
        super(decoratedAnimal);
        this.behavior = behavior;
    }

    @Override
    public void givesound() {
        decoratedAnimal.givesound();
    }

    @Override
    public void behavior() {
        switch (behavior){
            case Sad:
                System.out.println("im sad, leave me alone");
                break;
            case Timid:
                System.out.println("im timid");
                break;
            case Playful:
                System.out.println("I want to play");
                break;
            case Aggresive:
                System.out.println("i can bite you, don't come closer");
                break;
            default:
                decoratedAnimal.behavior();
                break;

        }
    }

    @Override
    public void description() {
        decoratedAnimal.description();
        System.out.println(", im" + behavior);
    }

    @Override
    public void becomeAlive() {
        decoratedAnimal.becomeAlive();
    }
}
