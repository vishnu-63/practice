package Design_Patterns.Creational_Patterns.AbstractFactory;

public class MacButton implements IButton{
    @Override
    public void press() {
        System.out.println("MaC Button Pressed..");
    }
}
