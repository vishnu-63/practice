package Design_Patterns.Creational_Patterns.AbstractFactory;

public interface  IFactory {
    IButton createButton();
    ITextBox createTextBox();
}
