package Design_Patterns.Structural_Patterns.FlyWeight.Robot;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
    private static Map<String, IRobot> roboticObjectCache = new HashMap<>();

    public static IRobot createRobot(String robotType) {
        if(roboticObjectCache.containsKey(robotType)) {
            return roboticObjectCache.get(robotType);
        }
        else {
            if(robotType=="HUMANOID") {
                Sprites humanSprites=new Sprites();
                IRobot robot=new HumanoidRobot(robotType,humanSprites);
                roboticObjectCache.put(robotType,robot);
                return robot;
            }
            if(robotType=="ROBOTICDOG") {
                Sprites animalSprites=new Sprites();
                IRobot robot=new HumanoidRobot(robotType,animalSprites);
                roboticObjectCache.put(robotType,robot);
                return robot;
            }
        }
    return null;
    }
}
