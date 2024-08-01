package Design_Patterns.Creational_Patterns.AbstractFactory;

public class GUIAbstractFactory {
    public static IFactory CreteFactory(String osType) {
        osType=osType.toLowerCase();
        if(osType.equals("windows")) {
            return new WinFactory();
        } else if (osType.equals("mac")) {
            return new MacFactory();
        }
        return new MacFactory();
    }
}
