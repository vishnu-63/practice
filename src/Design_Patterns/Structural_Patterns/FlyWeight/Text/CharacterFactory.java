package Design_Patterns.Structural_Patterns.FlyWeight.Text;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static Map<Character,Iletter> charmap=new HashMap<>();

    public static Iletter getCharacter(char letter) {
        if(charmap.containsKey(letter)) {
            return charmap.get(letter);
        }
        else {
            Iletter charObj=new DocumentCharacter(letter,"Arial",14);
            charmap.put(letter,charObj);
            return charObj;
        }

    }

}
