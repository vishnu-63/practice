package Design_Patterns.Structural_Patterns.FlyWeight.Text;

public class Main {
    public static void main(String[] args) {
        Iletter object1 = CharacterFactory.getCharacter('t');
        object1.display(0,0);

        Iletter object2 = CharacterFactory.getCharacter('a');
        object1.display(0,6);
    }
}
