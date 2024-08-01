package Design_Patterns.Creational_Patterns.AbstractFactory;

public class MacFactory implements IFactory{


    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new MacTextBox();
    }
}
