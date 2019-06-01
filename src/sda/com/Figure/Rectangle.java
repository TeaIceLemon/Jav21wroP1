package sda.com.Figure;

public class Rectangle implements Drawable{
    protected int sideA;
    protected int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void draw(){
        for(int i=0; i<sideB; i++){
            for(int j=0 ; j<sideA;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
