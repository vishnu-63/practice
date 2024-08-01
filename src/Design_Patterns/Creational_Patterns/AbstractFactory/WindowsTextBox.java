package Design_Patterns.Creational_Patterns.AbstractFactory;

public class WindowsTextBox implements ITextBox{
        @Override
        public void showText() {
            System.out.println("Windows TextBox..");
        }
}
