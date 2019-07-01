package sda.com.DesignPatterns.a_creation.AbstractFactory;

public class NormalFactaryOfWindowsWindows implements AbstractFacoryOfWidgets {
    @Override
    public Window makeWindow() {
        return new WindowsWindow();
    }
}
