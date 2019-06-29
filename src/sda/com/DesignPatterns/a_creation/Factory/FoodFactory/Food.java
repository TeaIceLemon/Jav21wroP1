package sda.com.DesignPatterns.a_creation.Factory.FoodFactory;

public abstract class Food {
    public abstract String getFoodType();
    public abstract int getKCal();
    public abstract boolean isFastFood();
    public abstract boolean hasCheese();

    @Override
    public String toString(){
        return "Your " + getFoodType() + "has " + getKCal() + " KCal."
                + "Is fast food? :" + isFastFood() + ", has cheese?: "
                + hasCheese();
    }
}
