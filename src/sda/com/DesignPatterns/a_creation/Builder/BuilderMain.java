package sda.com.DesignPatterns.a_creation.Builder;

public class BuilderMain {
    public static void main(String[] args) {

        //builder -> do obiektów skomplikowanych
        // + -> zawsze dobre parametry i stan;

        Human Adam = new Human.HumanBuilder("Male", "Adam", 28)
                .isSinner(false)
                .isWorshipper(true)
                .build();
        System.out.println(Adam.getSex());
        System.out.println(Adam.getAge());
        System.out.println(Adam.getName());
        System.out.println("is a sinner " + Adam.isSinner());
        System.out.println("is Worshipper " + Adam.isWorshippingGod());
        System.out.println();
        Human Ewa = new Human.HumanBuilder("Female", "Ewa", 27)
                .isSinner(true)
                .isWorshipper(true)
                .build();
        System.out.println(Ewa.getSex());
        System.out.println(Ewa.getAge());
        System.out.println(Ewa.getName());
        System.out.println("is a sinner " + Ewa.isSinner());
        System.out.println("is Worshipper " + Ewa.isWorshippingGod());
        System.out.println();

        Animal snake = new Animal.AnimalBuilder("snake","sneeky", 2)
                .isAgressive(true)
                .isPet(false)
                .build();

        System.out.println(snake.getSpecies());
        System.out.println(snake.getName());
        System.out.println(snake.getAge());
        System.out.println("is agressive " + snake.isAgressive());
        System.out.println("is pet? " + snake.isPet());
    }

}
