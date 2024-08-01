package Design_Patterns.Structural_Patterns.FlyWeight.Robot;

public class Main {
    public static void main(String[] args) {
        IRobot human=RoboticFactory.createRobot("HUMANOID");
        human.display(0,1);
        IRobot humanoidRobot2 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot2.display(10,30);


        IRobot dog= RoboticFactory.createRobot("ROBOTICDOG");
        dog.display(2,3);

        IRobot roboDog2 = RoboticFactory.createRobot("ROBOTICDOG");
        roboDog2.display(11,19);

    }
}
