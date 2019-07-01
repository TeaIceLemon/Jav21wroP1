package sda.com.DesignPatterns.a_creation.AbstractFactory;

public class GraficsUI {
    public void drawWindow(AbstractFacoryOfWidgets factory){
        Window window = factory.makeWindow();
    }
}
