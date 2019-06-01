package sda.com.Figure;

public class FigureMain {
    public static void main(String[] args) {
        Drawable rec = new Rectangle(5,3);
        Drawable squ = new Square(5);
        Drawable tri = new EquilateralTriangle(5);
        rec.draw();
        System.out.println();
        squ.draw();
        System.out.println();
        tri.draw();

    }
}
