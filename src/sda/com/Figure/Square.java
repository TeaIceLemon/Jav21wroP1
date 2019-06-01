package sda.com.Figure;

public class Square extends Rectangle {
    protected int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public void draw(){
        for(int i=0; i<side; i++){
            for(int j=0 ; j<side;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
