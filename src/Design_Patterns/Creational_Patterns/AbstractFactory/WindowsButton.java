package Design_Patterns.Creational_Patterns.AbstractFactory;

public class WindowsButton implements IButton{

    @Override
    public void press() {
        System.out.println("Windows Button Pressed..");
    }
}
