package sda.com.Figures;

import java.util.Scanner;

public class Rectangle implements IDraw{
    private int sizeA;
    private int sizeB;

    public Rectangle (int sizeA, int sizeB ){
        this.sizeA = sizeA;
        this.sizeB = sizeB;
    }

    @Override
    public void draw() {
        for(int i = 0; i<sizeA ;i++){
            for(int j = 0; j<sizeB;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
