package sda.com.DesignPatterns.a_creation.AbstractFactory;

public class NormalFactoryOfMacsWindows implements AbstractFacoryOfWidgets {
    @Override
    public Window makeWindow() {
        return new MacsWindow();
    }
}
