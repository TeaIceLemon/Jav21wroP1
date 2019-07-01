package sda.com.DesignPatterns.b_structural.decorator;

public class DecoMain {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.givesound();
        dog.givesound();
        System.out.println();
        cat.description();
        dog.description();

        Animal angryOldCat = new BehaviorDecorator(new AgeDecorator(cat, Age.Old),Behavior.Aggresive );
        Animal playfulYoungSmallDog = new BehaviorDecorator(new AgeDecorator(new SizeDecorator(dog,Size.Small),Age.Young),Behavior.Playful);

        angryOldCat.description();
        angryOldCat.behavior();
        System.out.println();

        playfulYoungSmallDog.behavior();
        playfulYoungSmallDog.description();
        playfulYoungSmallDog.givesound();

    }
}
