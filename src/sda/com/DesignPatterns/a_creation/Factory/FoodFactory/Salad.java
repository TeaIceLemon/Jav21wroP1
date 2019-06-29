package sda.com.DesignPatterns.a_creation.Factory.FoodFactory;

public class Salad extends Food {
    private String foodType;
    private int kCal;
    private boolean isFastFood;
    private boolean hasCheese;

    public Salad() {
        this.foodType = this.getClass().getSimpleName();
        this.kCal = 300;
        this.isFastFood = false;
        this.hasCheese = false;
    }
    @Override
    public String getFoodType() { return this.foodType;}

    @Override
    public int getKCal() {return this.kCal; }

    @Override
    public boolean isFastFood() { return this.isFastFood; }

    @Override
    public boolean hasCheese() {return this.hasCheese; }
}
