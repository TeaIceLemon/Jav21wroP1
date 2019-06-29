package sda.com.DesignPatterns.a_creation.Factory.FoodFactory;

public class Pizza extends Food {
    private String foodType;
    private int kCal;
    private boolean isFastFood;
    private boolean hasCheese;

    public Pizza() {
        this.foodType = this.getClass().getSimpleName();
        this.kCal = 500;
        this.isFastFood = true;
        this.hasCheese = true;
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

