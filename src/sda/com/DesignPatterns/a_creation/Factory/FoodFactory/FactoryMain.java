package sda.com.DesignPatterns.a_creation.Factory.FoodFactory;

public class FactoryMain {
    static Food getFood(String foodType){
        if("Pizza".equalsIgnoreCase(foodType)){ return new Pizza();}
        else if("Salad".equalsIgnoreCase(foodType)){return new Salad();}
        else return null;
    }

    public static void main(String[] args) {
        Food food1 = getFood("pizza");
        Food food2 = getFood("salad");

        System.out.println(food1);
        System.out.println(food2);

    }
}
