package sda.com.Figure;

public class EquilateralTriangle implements Drawable {
    protected int side;

    public EquilateralTriangle(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public void draw() {
        for(int i=1; i<side;i++){
            for(int j=0; j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
