package Design_Patterns.Creational_Patterns.AbstractFactory;

public class WinFactory implements IFactory{
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ITextBox createTextBox() {
        return new WindowsTextBox();
    }
}
