package Design_Patterns.Creational_Patterns.AbstractFactory;

public class Main {

    public static void main(String[] args) {
        IFactory macFactory=GUIAbstractFactory.CreteFactory("mac");
        IButton macButton=macFactory.createButton();
        macButton.press();
        ITextBox macTextBox=macFactory.createTextBox();

        macTextBox.showText();
    }
}
