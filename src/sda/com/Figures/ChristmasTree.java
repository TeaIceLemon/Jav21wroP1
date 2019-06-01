package sda.com.Figures;

public class ChristmasTree implements IDraw{
    private int heigh;

    public ChristmasTree(int heigh) {
        this.heigh = heigh;
    }

    @Override
    public void draw() {
        String[] tree = new String[heigh*2+1];
        for(int i =0; i<tree.length; i++){
            tree[i] = " ";
        }
        tree[heigh] ="*";
        for(int i = 1 ; i<heigh+1;i++){
        for(int j = 0 ; j<tree.length;j++){
            System.out.print(tree[j]);
        }
        tree[heigh-i] ="*";
        tree[heigh+i] ="*";
        System.out.println();
    }
}
}
